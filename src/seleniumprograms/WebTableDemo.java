package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Madhuri-Reading a table from website
 */
public class WebTableDemo extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
		openurl("https://www1.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm");
		WebElement table = driver.findElement(By.xpath("//*[@id=\"topGainers\"]")); 
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			String rows1 = row.getText();
			System.out.println(rows1);
			List<WebElement> columns = row.findElements(By.tagName("td"));
			for (WebElement column : columns) {
				String columnValue = column.getText();
				System.out.println(columnValue);
			}
		}
	}

}

//For loop enhancement and next row and column setup
//
//public static void main(String[] args) throws InterruptedException {
//	launchBrowser("chrome");
//	openurl("https://www1.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm");
//	WebElement table = driver.findElement(By.xpath("//*[@id=\"topGainers\"]")); 
//	List<WebElement> rows = table.findElements(By.tagName("tr"));
//	for (WebElement row : rows) {
//		String rows1 = row.getText();
//		System.out.println(rows1.replace("\n", "\t"));
//		List<WebElement> columns = row.findElements(By.tagName("td"));
//		String columnValue = "";
//		for (WebElement column : columns) {
//			columnValue = columnValue + "\t" + column.getText();
//		}
//		System.out.println(columnValue);
//	}
//}