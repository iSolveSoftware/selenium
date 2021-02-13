package seleniumprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritingDemo {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("C:\\Users\\parma\\Desktop\\tests-example.xlsx");
		FileInputStream fi = new FileInputStream(inputFile);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		int sheet_count = wb.getNumberOfSheets();

		boolean sheetFound = findSheet(wb, sheet_count);
		XSSFSheet sh;
		if (sheetFound) {
			sh = wb.getSheet("CreateTest1");
		} else {
			sh = wb.createSheet("CreateTest1");
		}

		sh.createRow(2).createCell(12).setCellValue("Hello");
//		for(int i=1;i<20;i++) {
//			Row createRow = sh.createRow(i);
//			for(int j=1; j<11; j++) {
//				String val = i+ " value "+j;
//				createRow.createCell(j).setCellValue(val);
//				System.out.println("value written to sheet: " + val);
//			}
//		}

		FileOutputStream fo = new FileOutputStream(inputFile);
		System.out.println("CreateTest1 sheet is created");
		wb.write(fo);
		fo.close();
		wb.close();
		fi.close();
	}

	public static boolean findSheet(XSSFWorkbook wb, int sheet_count) {
		boolean status = false;
		for (int i = 0; i < sheet_count; i++) {
			String sheetName = wb.getSheetName(i);
			System.out.println(sheetName);
			if (sheetName.equalsIgnoreCase("CreateTest1")) {
				status = true;
				break;
			}
		}
		return status;
	}

}
