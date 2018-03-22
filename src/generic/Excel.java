package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	
	public static String getValue(String path,String sheet,int r,int c) {
		String v="";
		try {
		     Workbook w = WorkbookFactory.create(new FileInputStream(path));
		     v=w.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e) {
			
		}
	return v;
	}
	
	public static int getRowCount(String path,String sheet) {
	 int rc=0;
		try {
		    Workbook w=WorkbookFactory.create(new FileInputStream(path));
		    rc=w.getSheet(sheet).getLastRowNum();
		   }
	 catch(Exception e) {
		 
	 }
		return rc;
	}

	public static int getCellCount(String path,String sheet,int r) {
		 int cc=0;
		 try {
			 
			  Workbook w = WorkbookFactory.create(new FileInputStream(path));
			  cc=w.getSheet(sheet).getRow(r).getLastCellNum();
		 }
		 catch(Exception e) {
			 
		 }
		 return cc;	
		}

	
	
	
}
