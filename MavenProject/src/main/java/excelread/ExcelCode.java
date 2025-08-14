package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh; //to represent any of the sheet

	public static String readStringData(int row, int col) throws IOException {
		f = new FileInputStream("C:\\Users\\Lenovo\\git\\Sample\\MavenProject\\src\\main\\resources\\Exceljava.xlsx"); // to read the excel file from your system
		w = new XSSFWorkbook(f); //load the workbook to excel with apache poi
		sh = w.getSheet("Sheet1"); // to select the sheet
		XSSFRow r = sh.getRow(row); // to get the datas in the rows according to row number
		XSSFCell c = r.getCell(col); // to get the cells in the rows according to cell number
		return c.getStringCellValue(); //to convert the content of the String cells with text

	}

	public static String readIntegerData(int row, int col) throws IOException {
		f = new FileInputStream("C:\\Users\\Lenovo\\git\\Sample\\MavenProject\\src\\main\\resources\\Exceljava.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		XSSFRow r = sh.getRow(row);
		XSSFCell c = r.getCell(col);
		int val =   (int) c.getNumericCellValue();  //convert double to int using typecasting
		return String.valueOf(val);   //convert int to string using valueOf() method
		//return val;
	}
}
