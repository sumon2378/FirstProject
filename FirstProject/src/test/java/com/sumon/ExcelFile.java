package com.sumon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		
		
		FileInputStream fis= new FileInputStream ("./ExcelFile/Book1.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet s= wb.createSheet("Sheet1");
		String result= s.getRow(4).getCell(4).getStringCellValue();
		System.out.println(result);
		
	}
	
	
	
	
	
	
}
