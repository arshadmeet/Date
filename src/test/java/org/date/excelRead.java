package org.date;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelRead {
	public static void excelData() {
		
		try {
			File f = new File("D:\\Selenium Task\\Datesample\\External\\Project.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
   public static void excelEntiredata() {
	   try {
			File f = new File("D:\\Selenium Task\\Datesample\\External\\Project.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			for (int i = 0; i < physicalNumberOfRows ; i++) {
				Row row = sheet.getRow(i);
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				for (int j = 0; j < physicalNumberOfCells ; j++) {
					Cell cell = row.getCell(j);
					System.out.println(cell);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
   public static void excelBinary() {
	   try {
			File f = new File("D:\\Selenium Task\\Datesample\\External\\Project.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			for (int i = 0; i < physicalNumberOfRows ; i++) {
				Row row = sheet.getRow(i);
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				for (int j = 0; j < physicalNumberOfCells ; j++) {
					Cell cell = row.getCell(j);
					int cellType = cell.getCellType();
					if(cellType ==1) {
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);
					}else if(cellType == 0) {
						if(DateUtil.isCellDateFormatted(cell)) {
							Date date = cell.getDateCellValue();
							SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
							String format = s.format(date);
							System.out.println(format);
						}else {
							double numeric = cell.getNumericCellValue();
							long l = (long)numeric;
							String valueOf = String.valueOf(l);
							System.out.println(valueOf);
						}
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
   public static void main(String[] args) {
	excelBinary();
}
}
