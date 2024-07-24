package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	@Test(dataProvider = "getData")
	public void Busticket(String src, String des, int noOfPpl) {
		System.out.println("Bus travelling from"+src+" to Destination "+des+" with "+noOfPpl+" of people");
	}

	@DataProvider
	public Object[][] getData(){
		Object[][] objArr=  new Object[3][3];
		
		objArr[0][0]="Pune";
		objArr[0][1]="Mumbai";
		objArr[0][2]=2;
		
		objArr[1][0]="Pune";
		objArr[1][1]="Solapur";
		objArr[1][2]=4;
		
		objArr[2][0]="Delhi";
		objArr[2][1]="Kashmir";
		objArr[2][2]= 4;
		
		return objArr;
		
	}
}
