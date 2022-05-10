package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_intro 
{
	public static void readParticularData() throws IOException
	{
	File f =new File
			("C:\\Users\\hp\\eclipse-workspace\\Mavenvi\\Data sets\\DATA SET 1.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb =new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	Row row = sheetAt.getRow(2);
	Cell cell = row.getCell(1);
	CellType type = cell.getCellType();
		if(type.equals(CellType.STRING))
		{
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		}
	
		else if(type.equals(CellType.NUMERIC))
		{
		double numericCellValue = cell.getNumericCellValue();
		System.out.println(numericCellValue);
		}
	}
	public static void main(String[] args) throws IOException 
	{
		readParticularData();	
	}
}