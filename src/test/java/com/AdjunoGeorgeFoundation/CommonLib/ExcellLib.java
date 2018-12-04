package com.AdjunoGeorgeFoundation.CommonLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class ExcellLib {
	String data;
	/*public String getExcellData(String sheetName,int rowNum,int columnNum) throws Exception, IOException{
		try{
			FileInputStream file=new FileInputStream(".//Testdata//Testdata.xlsx");
			Workbook wb=WorkbookFactory.create(file);
			Sheet sh=wb.getSheet(sheetName);
			Row row=sh.getRow(rowNum);
			data =row.getCell(columnNum).getStringCellValue();
		
		}catch(FileNotFoundException e){
			
		}
	
		return data;	
	}
	public void setExcellData(String sheetName,int rowNum,int columnNum,String data) throws Exception, IOException{
		
		try{
			FileInputStream file=new FileInputStream(".//Testdata//Testdata.xlsx");
			Workbook wb=WorkbookFactory.create(file);
			Sheet sh=wb.getSheet(sheetName);
			Row row=sh.getRow(rowNum);
			Cell cell=row.createCell(columnNum);
			cell.setCellValue(data);
			FileOutputStream fileOut=new FileOutputStream(".//Testdata//Testdata.xlsx");
			wb.write(fileOut);
		}catch(FileNotFoundException e){
			
		}
				
	}*/

}
