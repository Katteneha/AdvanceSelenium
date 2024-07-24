package Organization;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.FileUtility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import Object_Repository.CreateOrganizationPage;
import Object_Repository.ValidationAndVerificationPage;
import Object_Repository.VtigerLoginPage;
import Object_Repository.homePage;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Generic_Utilities.ListenerImplementations.class)
public class CreateOrganizationTest extends BaseClass{
	
	@Test
	public void CreateOrganization() throws Throwable {
		
//		FileUtility flib = new FileUtility();
//		WebDriver_Utility wlib =new WebDriver_Utility();
//		Excel_Utility elib = new Excel_Utility();
//		Java_Utility jlib = new Java_Utility();
//		
//		WebDriverManager.edgedriver().setup();
//		WebDriver dr = null;
//		String BROWSER= flib.getKeyAndValuePair("browser");
//		if(BROWSER.equalsIgnoreCase("edge"))
//			{
//				dr=new EdgeDriver();
//   	 		}
//		
//         else
//        	 if(BROWSER.equalsIgnoreCase("chrome"))
//             {
//            	 dr=new ChromeDriver();
//             }
//         
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
//         
//		
//		//dr.get("http://localhost:8888/");
//		
//		wlib.implicitly_Wait(dr);
//		wlib.maximizingWindow(dr);
//		
//		String URL= flib.getKeyAndValuePair("url");
//		String USERNAME= flib.getKeyAndValuePair("username");
//		String PASSWORD= flib.getKeyAndValuePair("password");
////		dr.manage().window().maximize();
////		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		dr.get(URL);
//		VtigerLoginPage login = new VtigerLoginPage(dr);
//		login.loginToVtigerApp(USERNAME, PASSWORD);
////		login.getUserTextField().sendKeys(USERNAME);
////		login.getPassWordTextField().sendKeys(PASSWORD);
		homePage home = new homePage(dr);
		home.clickOrganizationLink();
		
//		dr.findElement(By.name("user_name")).sendKeys("admin");
//		dr.findElement(By.name("user_password")).sendKeys("admin");
//		dr.findElement(By.id("submitButton")).click();
		
//		dr.findElement(By.linkText("Organizations")).click();
//		dr.findElement(By.cssSelector("[alt='Create Organization...']")).click();
		
		CreateOrganizationPage createOrg =new CreateOrganizationPage(dr);
		createOrg.clickPlusImg();
		//createOrg.createOrgData("NehaK", "9860775729", "neha@gmail.com");
		
		int ranNum = jlib.getRandomNum();
        String orgData = elib.readExcelDataUsingDataFormatter("Organizations", 0, 0)+ranNum;
        String phoneNum = elib.readExcelDataUsingDataFormatter("Organizations", 1, 0);
        String emailId = elib.readExcelDataUsingDataFormatter("Organizations", 2, 0);
        createOrg.createOrgData(orgData, phoneNum, emailId);
        createOrg.clickOnSaveButton();
		 
		

		
		Thread.sleep(2000);
		
		ValidationAndVerificationPage orgValid = new ValidationAndVerificationPage(dr);
		orgValid.orgValidation(dr, orgData);
		
		//home.logOut(dr);

		
		
		
		
		
	}

	

}
