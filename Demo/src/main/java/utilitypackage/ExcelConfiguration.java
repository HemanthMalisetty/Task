package utilitypackage;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfiguration 
{
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ExcelConfiguration(String excelPath)
	{
		try 
		{
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	public String getData(int sheetNo, int row, int column)
	{
		sheet1 = wb.getSheetAt(sheetNo);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
}
