package seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ReusableSeleniumScript {
	static WebDriver driver;

	public static void launchbrowser(String browsername) throws InterruptedException {
		// TODO Auto-generated method stub
		if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parma\\Downloads\\chromedriver.exe");
		 driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\parma\\Downloads\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize(); // To maximize the application
		Thread.sleep(3000);
	}
	//OpenUrl
	public static void openurl(String url) {
		// driver.get("https://jqueryui.com/"); making it reusable with openurl
		driver.get(url);
	}
	// maximize the application
	public static void windowMax() {
		driver.manage().window().maximize(); // To maximize the application
	}
	//Click action
	public static void click(By locatorname) {
		driver.findElement(locatorname).click();
	}
	//Finds elements
	public static void findElement(By locatorname) {
		driver.findElement(locatorname);
	}
	//waiting time
//	public static void SleepTime(int num) throws InterruptedException {
//		Thread.sleep(num);
//	}
	//close applicaton
	public static void quitbrowser() {
		driver.close();
	}
	//display msg
//	public static void print(String text) {
//		System.out.println(text);
//	}
	public static void sendkeys(By locatorname, String text) {
		driver.findElement(locatorname).sendKeys(text);
		// findElement(locatorname).sendKeys(text);
	}
	public static void switchToalert() {
		driver.switchTo().alert().accept();
	}
	public static void frame() {
		driver.switchTo().frame(0);
	}
	// NavigationCommands
	public static void forward() {
		driver.navigate().forward();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void back() {
		driver.navigate().back();
	}
	// Bootstrap Alerts
	public static void ismsgDisplayed(By locatorname) {
		boolean Displayed = driver.findElement(locatorname).isDisplayed();
		System.out.println("" + Displayed);
	}
	// draggable
	public static void draggable(By locatorname) {
		WebElement draggable = driver.findElement(locatorname);
		Actions action = new Actions(driver);
		action.dragAndDropBy(draggable, 179, 86).perform();
	}
	// DragandDrop
	public static void dragNdrop(By locatorname) {
		WebElement draggable = driver.findElement(locatorname);
		WebElement droppable = driver.findElement(locatorname);
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, droppable).perform();
	}
	// Resizable
	public static void resizable(By locatorname) throws InterruptedException {
		WebElement resizable = driver.findElement(locatorname);
		Actions action = new Actions(driver);
		action.dragAndDropBy(resizable, 295, 174).perform();
		Thread.sleep(3000);
	}
	// isSelected
	public static void isSlected(By locatorname) {

		boolean status = driver.findElement(locatorname).isSelected();
		if (status == true) {
			System.out.println("Moderate Radio button Selected");
		} else {
			System.out.println("Moderate Radio not Selected");
		}
	}
	// MouseHoverActions
	public static void moveToelement(By locatorname) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(locatorname)).perform();
		Thread.sleep(3000);
	}
	// MultipleKeyboars Actions
	public static void keyboardActions() throws InterruptedException, AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_R);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_R);
		Thread.sleep(8000);
	}
	// SilkuiScreenPattern
	public static void screenpattern(String filePath, String openButtonPath, String uploadFile) throws InterruptedException, FindFailed {		
		Screen sc = new Screen();
		Pattern filepath = new Pattern(filePath);
		Pattern openButton = new Pattern(openButtonPath);
		sc.type(filepath, uploadFile);
		Thread.sleep(1000);
		sc.click(openButton);
	}

}
