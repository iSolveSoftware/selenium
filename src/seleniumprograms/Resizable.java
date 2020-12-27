package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parma\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the application
		driver.get("https://jqueryui.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Resizable")).click();
		Thread.sleep(3000);
		WebElement resizable = driver.findElement(By.linkText("Resizable"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(resizable, 295, 174).perform();
		Thread.sleep(3000);
		driver.close();

	}

}
