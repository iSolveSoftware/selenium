package by.others;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import seleniumprograms.ReusableSeleniumScript;

public class MultipleWindows extends ReusableSeleniumScript {
	public static void main(String[] args) throws InterruptedException {

		// launch website
		launchBrowser("chrome");
		openurl("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement closeBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		if (closeBtn.isDisplayed()) {
			closeBtn.click();
		}

		// click on mobile category and click on samsung
		WebElement electronics = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(electronics).perform(); // mouse hovering over Electronics dropdown
		click(By.linkText("Samsung")); // clicking on Samsung		

		// start logic for ---search for "Samsung Mobile under ₹15K" and click on it
		String parent_window = driver.getWindowHandle();
		// clicking on View All button for phones under 15K
		List<WebElement> viewAllButtons = driver
				.findElements(By.xpath("//*[@id='container']/div/div[3]/div[3]/div/div/div[1]/div[2]/a"));
		List<WebElement> priceSections = driver
				.findElements(By.xpath("//*[@id='container']/div/div[3]/div[3]/div/div/div[1]/div[1]/h2"));
		for (int i = 0; i < priceSections.size(); i++) {
			String curentPriceSection = priceSections.get(i).getText();
			if (curentPriceSection.contains("Samsung Mobile under ₹15K")) {
				viewAllButtons.get(i).click();
				break;
			}
		}
		// end logic for --- search for "Samsung Mobile under ₹15K" and click on it

		// selecting phone from 2nd page from pagination -- looping multiple pages to
		// find an item
		List<WebElement> allPaginationPages = driver
				.findElements(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[2]/div[26]/div/div/nav/a"));
		System.out.println("count of all pages in pagination is : " + allPaginationPages.size());

		for (WebElement pageWebElement : allPaginationPages) {
			List<WebElement> countMobilePhones = driver.findElements(By
					.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[2]/div/div/div/div/a/div[2]/div[1]/div[1]"));
			System.out.println("number of Mobiles in current page : " + countMobilePhones.size());
			boolean flag = false;
			String findMobile = "Samsung Galaxy A20 (Gold, 32 GB)";// "Samsung Galaxy A20 (Red, 32 GB)"; // "Samsung Galaxy A50s (Prism Crush Violet, 128 GB)"
			for (WebElement webElement : countMobilePhones) {
				if (webElement.getText().equals(findMobile)) {
					System.out.println("Found before clciked on Mob iteam");
					webElement.click();
					System.out.println("Found and clciked on Mob iteam");
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
			System.out.println("clicking on Next button for page: " + pageWebElement.getText());
			pageWebElement.click();
			Thread.sleep(3500);
			System.out.println("clicked");
		}

		// after opening a page with required mobile
		Thread.sleep(3500);
		Set<String> child_windows = driver.getWindowHandles();
		for (String window : child_windows) {
			if (!window.equals(parent_window)) {
				driver.switchTo().window(window);
				driver.findElement(
//						By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click(); // click on Buy Now button
						By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click(); // click on Add to card button
				Thread.sleep(3500);
				System.out.println("Add to Cart - button is clicked");
			}
		}
		driver.close();
		driver.switchTo().window(parent_window);
		driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
		driver.navigate().refresh();
	}
	
}
