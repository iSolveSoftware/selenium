package seleniumprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingDemo extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException, IOException {

		File inputFile = new File("C:\\Users\\parma\\Desktop\\Test1.xlsx");
		FileInputStream fi = new FileInputStream(inputFile);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("Example Test");
		//to return single value
		//sh.getRow(0).getCell(0);
		//sh.createRow(0).createCell(0).setCellValue("HI");
		//instead of above 3lines of code we can use this
		//System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		for (Row row : sh) {
			for (int i = 0; i < row.getLastCellNum(); i++) {
				Cell cell = row.getCell(i);
				System.out.println("row num: " + row.getRowNum());
				if(cell.isPartOfArrayFormulaGroup()) 
				System.out.println("column num: " + i + " " + cell.getStringCellValue());
			}
		}
	}

}
