package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableDemo2 extends ReusableSeleniumScript {

	private static int row;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		openurl("http://demo.automationtesting.in/WebTable.html");
		WebElement table = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]")); 
		//List<WebElement> div = table.findElements(By.xpath("//*[@id=\"1609355114237-grid-container\"]/div/div"));
	
		List<WebElement> table_row = table.findElements(By.xpath("//*[@id=\"1609355114237-grid-container\"]/div[1]/div/div/div/div/div/div/div/div"));
		for(int row=0;row<table_row.size();row--) {
			String rowValue= table_row.get(row).getText();
			System.out.println(rowValue);	
		}
			List<WebElement> table_col=table_row.get(row).findElements(By.xpath("//*[@id=\"1609355114237-0-uiGrid-0005-cell\"]/div"));
			for(int col=0;col<table_col.size();col--) {
			String columnValue= table_col.get(col).getText();
			System.out.println(columnValue);
	}
	}
}
