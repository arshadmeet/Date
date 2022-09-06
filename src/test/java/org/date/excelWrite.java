package org.date;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelWrite {
	public static void excelDataWrite() {
	
	try {
		File f = new File("D:\\Selenium Task\\Datesample\\External\\Project.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet createSheet = wb.createSheet("Sheet2");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Arshad");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	public static void excelUpdate() {
		try {
			File f = new File("D:\\Selenium Task\\Datesample\\External\\Project.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet2");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			String Value = cell.getStringCellValue();
			if(Value.equals("Arshad")) {
				cell.setCellValue("Muhammad");
			}
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			wb.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		excelUpdate();
	}
	
}
