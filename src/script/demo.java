package script;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import generic.IAutoConst;

public class demo implements IAutoConst {
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
	public static void main(String[] args) {
		System.out.println(getRowCount(XL_PATH, "InvalidLogin"));
	}
}

