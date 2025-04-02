package org.sample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenSample {

	public static void main(String[] args) throws IOException {

		// To locate the file where we have to create

		File file = new File("C:\\FileNewSample\\selenium\\java\\newsample.xlsx");

		// To find the workbook

		Workbook book = new XSSFWorkbook();

		// To create Excel sheet from the work book

		Sheet createsheet = book.createSheet("List");

		createsheet.createRow(0).createCell(0).setCellValue("username");
		createsheet.createRow(0).createCell(1).setCellValue("Password");

		FileOutputStream out = new FileOutputStream(file);// FileNotFoundException

		// To write values to the created workbook

		book.write(out);// IO Exception

	}

}
