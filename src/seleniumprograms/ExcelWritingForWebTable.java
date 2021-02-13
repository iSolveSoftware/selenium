package seleniumprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelWritingForWebTable extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException, IOException {
		File inputFile = new File("C:\\Users\\parma\\Desktop\\testFile.xlsx");
		FileInputStream fi = new FileInputStream(inputFile);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("PrintingValues2");

		launchBrowser("chrome");
		openurl("https://money.rediff.com/gainers/bse/daily/groupa");
		WebElement table = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));

		// read header row and write it to excel
		// header is always one row so took it at 0th index
		List<WebElement> thColumns = table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th"));
		Row thRow = sh.createRow(0);
		for (int x = 0; x < thColumns.size(); x++) {
			System.out.println(thColumns.get(x).getText());
			thRow.createCell(x).setCellValue(thColumns.get(x).getText());
		}

		//read body row and write it to excel
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("no of rows:" + rows.size());
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			Row row = sh.createRow(i);
			for (int j = 0; j < columns.size(); j++) {
				System.out.println(columns.get(j).getText());
				row.createCell(j).setCellValue(columns.get(j).getText());
			}
		}
		System.out.println("end of the loop");

		FileOutputStream fo = new FileOutputStream(inputFile);
		wb.write(fo);
		fo.close();
		wb.close();
		fi.close();
		driver.close();
	}

}
