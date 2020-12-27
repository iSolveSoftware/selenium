package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoComplete extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("chrome");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();			
		driver.getWindowHandles();
		sendkeys(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"),"h");

		List<WebElement>tags=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		for (int i = 0; i < tags.size();) {
			String values = tags.get(i).getText();
			System.out.println(values);
			Thread.sleep(3000);
			if (values.equalsIgnoreCase("home")) {
			tags.get(i).click();
			Thread.sleep(3000);
			break; // comes out of that loop
		}
	}
		driver.close();
	}
}
