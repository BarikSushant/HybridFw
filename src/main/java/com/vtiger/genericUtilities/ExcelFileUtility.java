package com.vtiger.genericUtilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility { //Excel Fetching Data
	public String readDatafromExcel(String SheetName,int rowNum,int cellNum) throws Throwable {
		FileInputStream fise=new FileInputStream(IconstantUtility.excelFilePath);
		Workbook wb = WorkbookFactory.create(fise);
		return wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();	
		
	}

}
