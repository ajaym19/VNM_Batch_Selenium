package Testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMLoginTest {

	@Test
	public void loginTest(String username, String password) {
		// run same TC multiple times
		// with different number of paramters
		// data driven testing
		System.out.println("Username is " + username + " password is  "+password);
	}

//	@DataProvider(name = "dataSource")
//	public Object[][] getData() {
//		// row indicates how many times you want to test
//		// col indicates how many values per test
//		Object[][] data = new Object[3][2];
//		data[0][0] = "User1";
//		data[0][1] = "password1";
//		data[1][0] = "User2";
//		data[1][1] = "password2";
//		data[2][0] = "User3";
//		data[2][1] = "password3";
//		return data;
//	}
	
	@DataProvider
	public Object[][] readDataUsingExcel() throws IOException {
		
		Object[][] data = new Object[3][2];
		String filePath = "./src/test/java/Testcases/Auto (1).xlsx";
		String sheetName = "data";
		XSSFWorkbook wb = new XSSFWorkbook(filePath);
		XSSFSheet sheet = wb.getSheet(sheetName);
		System.out.println(sheet.getPhysicalNumberOfRows());
		for(int i =0; i <2; i++) {
			for( int j =0; j< 2; j++) {
				String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i][j] =sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellData);
			}
		}
		
		return data;
			
	}
}
