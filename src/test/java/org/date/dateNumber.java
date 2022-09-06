package org.date;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dateNumber {
	public static void readExcel() throws IOException {
		File f = new File("D:\\Arshad\\Project 2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		 Date dateCellValue = sheet.getRow(0).getCell(0).getDateCellValue();
		 String format = s.format(dateCellValue);
		// String text = NumberToTextConverter.toText(dateCellValue);
		System.out.println(format);
	}
	public static void main(String[] args) throws IOException {
		readExcel();
	}

}
