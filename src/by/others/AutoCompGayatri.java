package by.others;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumprograms.ReusableSeleniumScript;

public class AutoCompGayatri extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException {

		launchBrowser("chrome");
		openurl("https://www.bing.com/");
		//Thread.sleep(11000); // Code did not work without this comman
		ReusableSeleniumScript.driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		Thread.sleep(11000);
		List<WebElement> tags = ReusableSeleniumScript.driver.findElements(By.xpath("//*[@id=\"sa_5006\"]/div"));
		System.out.println(tags.size());
		for (int i = 0; i < tags.size(); i++) {
			String values = tags.get(i).getText();
			System.out.println(values);
			if (values.equalsIgnoreCase("selenium ide")) {
				clickSearchResult(tags, i);
			}

			if (values.equalsIgnoreCase("selenium testing")) {
				clickSearchResult(tags, i);
			}

			if (values.equalsIgnoreCase("selenium")) {
				clickSearchResult(tags, i);
			}

			
		//Automationpractice.com This worked without Thread.sleep command
//		openurl("http://automationpractice.com/index.php");
//		    driver.findElement(By.id("search_query_top")).sendKeys("dress");
//		    Thread.sleep(8000);
//		    List<WebElement>tags=driver.findElements(By.xpath("//*[@id='index']/div[2]/ul/li"));
															   //*[@id="index"]/div[2]/ul/li[6]
//		    System.out.println(tags.size());
//		    for(int i=0;i<tags.size();i++) {
//		    String values=tags.get(i).getText();
//		    System.out.println(values);
//		    if (values.equalsIgnoreCase("T-shirts > Faded Short Sleeve T-shirts")) {
//		      tags.get(i).click();
//		      break;
//		    }
//		}
//		    driver.close();
		

	}

	}

	private static void clickSearchResult(List<WebElement> tags, int i) throws InterruptedException {
		Thread.sleep(8000);

		tags.get(i).click();
		Thread.sleep(8000);

		//test comment
//	break;
	}
}


////////WebTable
public class WebTable extends ReusableScripts {
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	launchBrowser("chrome");
	openUrl("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	WebElement table_body = driver.findElement(By.xpath("//*[@id=\'task-table\']/tbody"));
	List <WebElement>table_row = table_body.findElements(By.tagName("tr"));
	for(int row=0;row<table_row.size();row++) {
	List<WebElement> table_col=table_row.get(row).findElements(By.tagName("td"));
	for(int col=0;col<table_col.size();col++) {
	String value= table_col.get(col).getText();
	System.out.println(value);
	}
	}

	close();

	}