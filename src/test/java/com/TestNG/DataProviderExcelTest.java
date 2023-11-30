package com.TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.realestatespotpotter.GenericUtilis.ExcelUtils;
import com.realestatespotpotter.GenericUtilis.IpathConstants;


	
public class DataProviderExcelTest {
	@DataProvider
	public Object[][] getData() throws Throwable, IOException
	{
	FileInputStream fis = new FileInputStream(IpathConstants.Excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet2");
	int rowcount = sh.getPhysicalNumberOfRows();
	int cellcount = sh.getRow(0).getLastCellNum();
	
	Object[][] obj = new Object[rowcount][cellcount];
	
	for(int i=0;i<rowcount;i++)
	{
		for(int j=0;j<cellcount;j++)
		{
			obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
		}
	}
	return obj;
	}
	
	@DataProvider
	public Object[][] DataEcexlUtilis() throws Throwable
	{
		ExcelUtils eLib = new ExcelUtils();
		Object[][] data = eLib.getMultipleSetOfData("sheet2");
		return data;
	}
}
