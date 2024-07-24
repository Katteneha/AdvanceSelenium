package Campaigns;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.FileUtility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import Object_Repository.CreateCampaignPage;
import Object_Repository.VtigerLoginPage;
import Object_Repository.homePage;

public class CreateCampaignsShobhaTest extends BaseClass {
	
	@Test
	public void CreateCampaignsShobha() throws Throwable {
//        FileUtility flib = new FileUtility();
//         WebDriver_Utility wlib = new WebDriver_Utility();
//         Excel_Utility elib = new Excel_Utility();
//         Java_Utility jlib = new Java_Utility();
        
//         WebDriver dr;
//       String BROWSER = flib.getKeyAndValuePair("browser");
//         if(BROWSER.equalsIgnoreCase("chrome"))
//         {
//        	 dr=new ChromeDriver();
//         }
//         else
//         {
//         if(BROWSER.equalsIgnoreCase("edge"))
//        	 {
//        		 dr=new EdgeDriver();
//        	 }
//       	 else
//        	 {
//        if(BROWSER.equalsIgnoreCase("firefox"))
//        		{
//        			dr=new FirefoxDriver();
//        		}
//        else
//        		{
//        			dr=new ChromeDriver();
//        		}
//        	 }
//         }
         
//         wlib.implicitly_Wait(dr);
// 		wlib.maximizingWindow(dr);
//        String URL = flib.getKeyAndValuePair("url");
//		String USERNAME =flib.getKeyAndValuePair("username");
//    	String PASSWORD = flib.getKeyAndValuePair("password");
//		
//		dr.get(URL);
//        VtigerLoginPage login = new VtigerLoginPage(dr);
//    	login.loginToVtigerApp(USERNAME, PASSWORD);
        
		homePage home = new homePage(dr);
		home.clickMoreLink();
		home.clickCampaignsLink();

		CreateCampaignPage campPage = new CreateCampaignPage(dr);
        campPage.clickOnPlusSign();
        //assertEquals(true, true);
		
		int ranNum = jlib.getRandomNum();
		
        String campData = elib.readExcelDataUsingDataFormatter("Campaigns", 0, 0)+ranNum;
	     campPage.enterCampaignName(campData);
	     campPage.clickOnSaveButton();
	
//	     Thread.sleep(2000);
////		home.clickAdmImg();
////		home.clickOnSignOut();

	}

}
