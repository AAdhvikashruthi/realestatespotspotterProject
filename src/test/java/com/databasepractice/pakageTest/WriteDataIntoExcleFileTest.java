package com.databasepractice.pakageTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcleFileTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\SHRU\\eclipse-workspace\\com.realestate.spotpotter\\src\\test\\resources\\TestData.xlsx");
	
		Workbook wb = WorkbookFactory.create(fin);
		Sheet sh = wb.getSheet("sheet1");
		sh.createRow(6).createCell(0).setCellValue("shru");
		
		
		FileOutputStream fout = new FileOutputStream("C:\\\\Users\\\\SHRU\\\\eclipse-workspace\\\\com.realestate.spotpotter\\\\src\\\\test\\\\resources\\\\TestData.xlsx");
		wb.write(fout);
		wb.close(); 
	}

}
