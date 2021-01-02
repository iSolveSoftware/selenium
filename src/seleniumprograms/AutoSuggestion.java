package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoSuggestion extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		openurl("https://www.myntra.com/");
		sendkeys(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input"), "dress");
		List<WebElement> tags = driver.findElements(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/div/ul/li")); //li[index]-index value
		for (int i = 0; i < tags.size();i++) {
			String values = tags.get(i).getText();
			System.out.println(values);
			Thread.sleep(3000);
			if (values.equalsIgnoreCase("DressBerry")) {
				Thread.sleep(3000);
				System.out.println("DressBerry");
				tags.get(i).click();
				Thread.sleep(3000);
				break; // comes out of that loop
			}
		
		}
		driver.close();
	}
}
