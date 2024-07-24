package Products;

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
import Object_Repository.CreateProductPage;
import Object_Repository.VtigerLoginPage;
import Object_Repository.homePage;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Generic_Utilities.ListenerImplementations.class)
public class CreateProductsTest extends BaseClass{
	
	@Test
	public void CreateProducts() throws Throwable {
		/*WebDriverManager.edgedriver().setup();
		WebDriver dr = new EdgeDriver();
		dr.get("http://localhost:8888/");
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dr.findElement(By.name("user_name")).sendKeys("admin");
		dr.findElement(By.name("user_password")).sendKeys("admin");
		dr.findElement(By.id("submitButton")).click();
		
		dr.findElement(By.linkText("Products")).click();
		dr.findElement(By.cssSelector("[alt='Create Product...']")).click();

		Random ran=new Random();
		int ranNm= ran.nextInt(1000);
		
		dr.findElement(By.xpath("//input[@name='productname']")).sendKeys("Vaidika"+ranNm);
		dr.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		dr.findElement(By.linkText("Sign Out")).click();*/
	
//		FileUtility flib = new FileUtility();
//		Wew Excel_Utility();
//		Java_Utility jlib = new Java_Utility();

		//WebDriver dr;
//		String BROWSER = flib.getKeyAndValubDriver_Utility wlib = new WebDriver_Utility();
		//Excel_Utility elib = neePair("browser");
//		  if(BROWSER.equalsIgnoreCase("chrome"))
//		  {
//		 	 dr=new ChromeDriver();
//		  }
//		  else
//		  {
//		  if(BROWSER.equalsIgnoreCase("edge"))
//		 	 {
//		 		 dr=new EdgeDriver();
//		 	 }
//			 else
//		 	 {
//		 if(BROWSER.equalsIgnoreCase("firefox"))
//		 		{
//		 			dr=new FirefoxDriver();
//		 		}
//		 else
//		 		{
//		 			dr=new ChromeDriver();
//		 		}
//		 	 }
//		  }
//				wlib.maximizingWindow(dr);
//				wlib.implicitly_Wait(dr);
				

//				String URL = flib.getKeyAndValuePair("url");
//				String USERNAME =flib.getKeyAndValuePair("username");
//		    	String PASSWORD = flib.getKeyAndValuePair("password");
//				
//				dr.get(URL);
//				VtigerLoginPage login = new VtigerLoginPage(dr);
//				login.loginToVtigerApp(USERNAME, PASSWORD);
				
				homePage home = new homePage(dr);
				home.clickProductLink();
				CreateProductPage createPrd= new CreateProductPage(dr);
				createPrd.clickOnPlusSign();

		        
		        int ranNum = jlib.getRandomNum();
		       String prdData = elib.getExcelData("Products", 0, 0)+ranNum;
				
		        createPrd.enterProductName(prdData);
		        createPrd.clickOnSaveButton();
				
				Thread.sleep(3000);
				
//				home.logOut(dr);
//				
//				wlib.closeBrowser(dr);
	
	
	}
}
