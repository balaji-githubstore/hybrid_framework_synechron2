package com.synechron.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	
	@DataProvider
	public Object[][] commonDataProvider(Method method) throws IOException
	{
		//test method name is the sheetname
		String sheetname=method.getName();
		Object[][] main= ExcelUtils.getSheetIntoTwoDimensionalArray("testdata/openemr_data.xlsx", sheetname);
		return main;
	}
	
	
//	@DataProvider
//	public Object[][] validCredentialData() throws IOException
//	{
//		Object[][] main= ExcelUtils.getSheetIntoTwoDimensionalArray("testdata/openemr_data.xlsx", "validCredentialTest");
//		return main;
//	}
	
//	@DataProvider
//	public Object[][] validCredentialData()
//	{
//		Object[][] main=new Object[2][4];
//		
//		main[0][0]="admin";
//		main[0][1]="pass";
//		main[0][2]="English (Indian)";
//		main[0][3]="OpenEMR";
//		
//		main[1][0]="physician";
//		main[1][1]="physician";
//		main[1][2]="English (Indian)";
//		main[1][3]="OpenEMR";
//		
//		
//		return main;
//	}

//	@DataProvider
//	public Object[][] invalidCredentialData()
//	{
//		Object[][] main=new Object[3][4];
//		
//		main[0][0]="john";
//		main[0][1]="john123";
//		main[0][2]="English (Indian)";
//		main[0][3]="Invalid username or password";
//		
//		main[1][0]="saul";
//		main[1][1]="saul123";
//		main[1][2]="Dutch";
//		main[1][3]="Invalid username or password";
//		
//		main[2][0]="kim";
//		main[2][1]="kim123";
//		main[2][2]="English (Indian)";
//		main[2][3]="Invalid username or password";
//		
//		return main;
//	}
}
