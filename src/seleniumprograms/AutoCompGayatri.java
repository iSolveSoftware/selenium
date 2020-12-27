package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoCompGayatri extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException {

		launchbrowser("chrome");
		openurl("https://www.bing.com/");
		Thread.sleep(8000); // Code did not work without this command
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		List<WebElement> tags = driver.findElements(By.xpath("//*[@id='sa_ul']/li"));
		System.out.println(tags.size());
		for (int i = 0; i < tags.size(); i++) {
			String values = tags.get(i).getText();
			System.out.println(values);
			if (values.equalsIgnoreCase("selenium ide")) {
				tags.get(i).click();
				Thread.sleep(3000);
				break;
			}

		}

	}

}
