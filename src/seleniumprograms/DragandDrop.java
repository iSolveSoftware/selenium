package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parma\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the application
		driver.get("https://www.seleniumeasy.com/test/");
		Thread.sleep(3000);
		//driver.switchTo().frame(0); 
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[4]/ul/li[1]/a")).isSelected(); //isDisplayed method is to select drop down
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(3000);
		//driver.switchTo().frame(0); //based on how many frames wil consider index  
		//driver.switchTo().frame("frame"); name attribute can consider as a string
		//driver.switchTo().frame("demo-frame");regular webelement
		WebElement draggable = driver.findElement(By.linkText("Draggable"));
		WebElement droppable = driver.findElement(By.id("mydropzone"));
		Actions action = new Actions(driver);
		//action.clickAndHold(draggable).moveToElement(droppable).perform();
		action.dragAndDrop(draggable,droppable).perform();
		Thread.sleep(3000);
		driver.close();


	}

}
