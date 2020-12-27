package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parma\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the application
		driver.get("https://jqueryui.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(3000);

		driver.switchTo().frame(0); //based on how many frames wil consider index  
		//driver.switchTo().frame("frame"); name attribute can consider as a string
		//driver.switchTo().frame("");regular webelement
		WebElement droppable = driver.findElement(By.linkText("Droppable"));
		WebElement draggable = driver.findElement(By.linkText("Draggable"));
		Actions action = new Actions(driver);
		//action.dragAndDropBy(droppable, 179, 86).perform();
		action.dragAndDrop(droppable, draggable);
		Thread.sleep(3000);
		driver.close();
		
		//Actions action=new Actions(driver);
		//action.dragAndDrop(source, target)
		//action.dragAndDropBy(//*[@id='draggable']/p", xOffset, yOffset)o
	}

}
