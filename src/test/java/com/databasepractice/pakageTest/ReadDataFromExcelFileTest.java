package com.databasepractice.pakageTest;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFileTest {

	public static void main(String[] args) throws   IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\SHRU\\eclipse-workspace\\com.realestate.spotpotter\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fin);
		Sheet sh = wb.getSheet("sheet1");
		 int rowcount = sh.getLastRowNum();
		 int cellcount = sh.getRow(0).getLastCellNum();
		 
		 for(int i=0;i<=rowcount;i++) // get row 
		 {
			 for(int j=0;j<cellcount;j++) // get cell
			 {
				 String data = sh.getRow(i).getCell(j).getStringCellValue();
				 System.out.print(data+" ");
				
			 }
			 System.out.println();
		 }
		 
		 
	}

}
