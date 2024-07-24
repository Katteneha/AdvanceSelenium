package Generic_Utilities;


import java.util.Date;
import java.util.Random;

public class Java_Utility {
	/**
	 * This method is used to avoid duplicates
	 * @return
	 */
	
	public int getRandomNum() {
		Random ran = new Random();
		int ranNm= ran.nextInt();
		return ranNm;
	}	
		
	/**
	 * This method is used to get system date and time in IST format
	 * @return
	 * @author Shobha
	 */
	public String getSystemDateAndTime()
	{
		Date date = new Date();
		String dateAndTime = date.toString();
	System.out.println(dateAndTime);
		return dateAndTime;
		}
	
	/**
	* This method is used to get Date in YYYY-MM-DD format
	* 
	* 
	*/
		
	public String getSystemDateWithFormat() 
	{
		Date date = new Date();
		String dateAndTime = date.toString();
		System.out.println(dateAndTime);
		
		String YYYY = dateAndTime.split(" ")[5];
		String DD = dateAndTime.split(" ")[2];
		
		int MM = date.getMonth()+1;
		
		String FinalFormat= YYYY+"-"+MM+"-"+DD;
		System.out.println(FinalFormat);
		return FinalFormat;
		
	}
		
	

}
