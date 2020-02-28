package com.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EceelConnection {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		
		FileInputStream fis= new 	FileInputStream("./Excelfile/Book1.xlsx");
		
		Workbook wb= WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("sheet1");
		
		String ss =s.getRow(2).getCell(3).getStringCellValue();
		
System.out.println(ss);
		
		
	

}}
