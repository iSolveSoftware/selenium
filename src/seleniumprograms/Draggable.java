package seleniumprograms;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		quitbrowser();
		//driver.get("https://jqueryui.com/"); making it reusable with OpenUrl
		openurl("https://jqueryui.com/");
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Draggable")).click(); //making it Reusable
		click(By.linkText("Draggable"));
		Thread.sleep(3000);

		driver.switchTo().frame(0); //based on how many frames wil consider index  
		//driver.switchTo().frame("frame"); name attribute can consider as a string
		//driver.switchTo().frame("");regular webelement
		WebElement draggable = driver.findElement(By.linkText("Draggable"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(draggable, 179, 86).perform();
		Thread.sleep(3000);
		driver.close();

	}

}
