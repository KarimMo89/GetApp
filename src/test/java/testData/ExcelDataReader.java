package testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	
static	FileInputStream fis = null;
public Object [] [] GetExcelData () throws IOException
{
	String filePath = System.getProperty("user.dir")+"//TestData//TestData.xlsx";
	
	File scrFile = new File(filePath);
	fis = new FileInputStream (scrFile);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheetAt(0);
	int TotalRow = sheet.getLastRowNum()+1;
	int TotalColmn = 11;
	
	String [][] arrExcel = new String [TotalRow][TotalColmn];
	
	for (int row = 0; row<TotalRow;row++)
	
	{
		
		for (int col = 0; col< TotalColmn;col++) {
			
			XSSFRow rowsh = sheet.getRow(row);
			arrExcel[row][col] = rowsh.getCell(col).toString();
			
		
		
	
	
	}
	}
	wb.close();
	return arrExcel;
	}

}
