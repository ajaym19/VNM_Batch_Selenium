package Testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static String filePath = "./src/test/java/Testcases/Auto (1).xlsx";
	static String sheetName = "data";
	
	public Excel_Reader(String filePath, String SheetName) {
		try {
			workbook = new XSSFWorkbook(filePath);
			sheet = workbook.getSheet(SheetName);
		} catch (IOException e) {
			System.out.println("Cannot find the file");
		}
		
	}
	
	public int getRowCount() {
		int rowCount = 0;
		rowCount = sheet.getPhysicalNumberOfRows();
		return rowCount;
	}
	
	public int getColCount() {
		int colCount = 0;
		colCount = sheet.getRow(0).getLastCellNum();
		return colCount;
	}
	
	public String getCellData(int rowNum, int colNum) {
		String cellData = null;
		cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return cellData;
	}
	
	public void getTestData() {
		Object data[][] = null;
		int rowCount = getRowCount();
		int colCount = getColCount();
		System.out.println("Rows are "+rowCount);
		System.out.println("Columns are "+colCount);
	}
	
	public static void main(String[] args) {
		System.out.println(1);
		Excel_Reader reader = new Excel_Reader(filePath, sheetName);
		reader.getTestData();
	}
	
	
}
