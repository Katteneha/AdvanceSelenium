package Generic_Utilities;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import com.mysql.jdbc.Driver;

import Object_Repository.VtigerLoginPage;
import Object_Repository.homePage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;

public class BaseClass {

	public static WebDriver dr;
	public static WebDriver sDriver;
	
	public FileUtility flib = new FileUtility();
    public WebDriver_Utility wlib = new WebDriver_Utility();
    public Excel_Utility elib = new Excel_Utility();
    public Java_Utility jlib = new Java_Utility();
    
   
    
	@BeforeSuite
	public void BeforeSuite() throws Throwable {
		
		//Driver driverRef = new Driver();
		//DriverManager.registerDriver(driverRef);
		System.out.println("Database connection open..");
		
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Browser open..");
		
	}
	
	@BeforeClass
	public void BeforeClass() throws Throwable {
			
		 
	       String BROWSER = flib.getKeyAndValuePair("browser");
	         if(BROWSER.equalsIgnoreCase("chrome"))
	         {
	        	 dr=new ChromeDriver();
	         }
	         else
	         {
	         if(BROWSER.equalsIgnoreCase("edge"))
	        	 {
	        		 dr=new EdgeDriver();
	        	 }
	       	 else
	        	 {
	        if(BROWSER.equalsIgnoreCase("firefox"))
	        		{
	        			dr=new FirefoxDriver();
	        		}
	        else
	        		{
	        			dr=new ChromeDriver();
	        		}
	        	 }
	         }
	         
			sDriver=dr;
		System.out.println("Browser launched..");
		
	}
	
	@BeforeMethod
	public void BeforeMethod() throws Throwable {
		wlib.implicitly_Wait(dr);
 		wlib.maximizingWindow(dr);
        String URL = flib.getKeyAndValuePair("url");
		String USERNAME =flib.getKeyAndValuePair("username");
    	String PASSWORD = flib.getKeyAndValuePair("password");
		
		dr.get(URL);
        VtigerLoginPage login = new VtigerLoginPage(dr);
    	login.loginToVtigerApp(USERNAME, PASSWORD);
		System.out.println("Login to application..");
		
	}
	
	@AfterMethod
	public void AfterMethod() throws Throwable {
		homePage home = new homePage(dr);
		Thread.sleep(2000);
		home.clickAdmImg();
		home.clickOnSignOut();
		System.out.println("Logout from application..");
		
	}
	
	@AfterClass
	public void AfterClass() {
		dr.close();
		System.out.println("Browser Closed..");
		
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("parallel execution done");
		
	}
	
	@BeforeSuite
	public void AfterSuite() throws Throwable {
		/*Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_details","root" ,"root");
		conn.close();*/
		System.out.println("Database connection closed..");
		
	}
	
	
}
