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

public class ExcelWritingForPrintingDropDown extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		File inputFile = new File("C:\\Users\\parma\\Desktop\\testFile.xlsx");
		FileInputStream fi = new FileInputStream(inputFile);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.createSheet("PrintingValues");

		launchBrowser("chrome");
		openurl("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");
		List<WebElement> sponsorname = driver.findElements(By.xpath("//*[@id=\"c0\"]")); // findElements it is going to
																							// give the list of the
																							// WebElements
		for (int i = 0; i < sponsorname.size(); i++) {
			sh.createRow(i).createCell(i).setCellValue(sponsorname.get(i).getText());
		}
		FileOutputStream fo = new FileOutputStream(inputFile);
		wb.write(fo);
		// System.out.println(sponsorname);
		fo.close();
		wb.close();
		fi.close();
		driver.close();
	}
}
