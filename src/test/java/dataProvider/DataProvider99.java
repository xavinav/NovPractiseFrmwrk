package dataProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import genericLibrary.ExcelRW;

import org.testng.annotations.DataProvider;

public class DataProvider99 {

	@DataProvider(name="dp_Invalidlogin")
	public static Iterator<Object[]> getInvalidlogindata() throws Exception
	{
		return commondp_logic("Login99","InvalidLogin");
	}
	
	@DataProvider(name="dp_Validlogin")
	public static Iterator<Object[]> getvalidlogindata() throws Exception
	{
		return commondp_logic("Login99","ValidLogin");
	}
	
	public static Iterator<Object[]> commondp_logic(String sheetName,String sname) throws Exception
	{
		
		ExcelRW xl= new ExcelRW("D:\\Framework_Practise\\Test_Data\\Test_Data_99Books.xlsx");
		
		int rowCount = xl.rowCount(sheetName);
		int colCount = xl.colCount(sheetName);
		
		List<Object[]>arr_list=new ArrayList<Object[]>();
		
		for(int i=1;i<=rowCount;i++)
		{
			String Execute = xl.readCellValue(sheetName, i, 2);
			String Scenario = xl.readCellValue(sheetName, i, 3);
			
			if((Execute.equalsIgnoreCase("Y")) && (Scenario.equalsIgnoreCase(sname)))
			{
				Object[] x= new Object[1];
			    Map<String,String> dMap= new HashMap<String,String>();
			    
			    for(int j=0;j<colCount;j++)
			    {
			    	
			    	String Skey = xl.readCellValue(sheetName, 0, j);
			    	String Value = xl.readCellValue(sheetName, i, j);
			    	dMap.put(Skey, Value);
			    	
			    }
			    
			    x[0]=dMap;
			    arr_list.add(x);
			}//end of if
		}//end of for
		
		return arr_list.iterator();
		
	}
	
	
	
}
