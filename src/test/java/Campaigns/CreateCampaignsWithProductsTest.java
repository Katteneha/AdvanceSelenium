package Campaigns;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.FileUtility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import Object_Repository.CampWithPrdWindowSwitching;
import Object_Repository.CreateCampaignPage;
import Object_Repository.CreateProductPage;
import Object_Repository.VtigerLoginPage;
import Object_Repository.homePage;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Generic_Utilities.ListenerImplementations.class)
public class CreateCampaignsWithProductsTest extends BaseClass {	
	
	@Test
	public void CreateCampaignsWithProducts() throws Throwable {
//		FileUtility flib= new FileUtility();
//		WebDriver_Utility wlib= new WebDriver_Utility();
//		Excel_Utility elib= new Excel_Utility();
//		Java_Utility jlib = new  Java_Utility();
//		
//		String URL= flib.getKeyAndValuePair("url");
//		String USERNAME =flib.getKeyAndValuePair("username");
//		String PASSWORD= flib.getKeyAndValuePair("password");
//		
//		WebDriverManager.edgedriver().setup();
//		WebDriver dr = null;
//		String BROWSER = flib.getKeyAndValuePair("browser");
//		if(BROWSER.equalsIgnoreCase("edge")) {
//			dr= new EdgeDriver();
//		}
//		
		//dr.get(URL);
		//wlib.maximizingWindow(dr);
		//dr.manage().window().maximize();
		//wlib.implicitly_Wait(dr);
		//dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
//		VtigerLoginPage vlogin = new VtigerLoginPage(dr);
//		vlogin.getUserTextField().sendKeys(USERNAME);
//		vlogin.getPassWordTextField().sendKeys(PASSWORD);
//		vlogin.getLoginButton().click();
//		vlogin.loginToVtigerApp(USERNAME, PASSWORD);
//		dr.findElement(By.name("user_name")).sendKeys(USERNAME);
//		dr.findElement(By.name("user_password")).sendKeys(PASSWORD);
//		dr.findElement(By.id("submitButton")).click();
		
		//now naviagte to Product page
		homePage home = new homePage(dr);
		home.clickProductLink();
		
		//assertEquals(true, false);
		
		CreateProductPage prdPage = new CreateProductPage(dr);
		prdPage.clickOnPlusSign();
		
		//dr.findElement(By.linkText("Products")).click();
//		dr.findElement(By.cssSelector("[alt='Create Product...']")).click();
//		
//		FileInputStream fis = new FileInputStream("./src/test/resources/ExcelTestData.xlsx");
//		
//		Workbook book= WorkbookFactory.create(fis);
//		
//		Sheet sheet = book.getSheet("Products");
//		
//		Row row = sheet.getRow(0);
//		
//		Cell cell = row.getCell(0);
//		Random ran = new Random();
//		int ranNm=ran.nextInt();
		
//		String ProductName= cell.getStringCellValue()+ranNm;
//		
//		dr.findElement(By.xpath("//input[@name='productname']")).sendKeys(ProductName);
//		dr.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		
//		//now naviagte to Campaigns page
//		home.clickMoreLink();
//		home.clickCampaignsLink();
//		//dr.findElement(By.linkText("More")).click();
//		//dr.findElement(By.linkText("Campaigns")).click();
//		
//		dr.findElement(By.cssSelector("[alt='Create Campaign...']")).click();
//		
//		FileInputStream fisCamp = new FileInputStream("./src/test/resources/ExcelTestData.xlsx");
//		
//		Workbook bookCamp= WorkbookFactory.create(fisCamp);
//		
//		Sheet sheetCamp = bookCamp.getSheet("Campaigns");
//		
//		Row rowCamp = sheetCamp.getRow(0);
//		
//		Cell cellCamp = rowCamp.getCell(0);
//		//Random ran = new Random();
//		//int ranNm=ran.nextInt();
//		
//		String CampaignName= cell.getStringCellValue()+ranNm;
//		dr.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(CampaignName);
//		
//		//click on Product plus mark
//		dr.findElement(By.xpath("//img[@alt='Select']")).click();
		
		 // Get the main window handle
        //String mainWindowHandle = dr.getWindowHandle();
		
		//String mainId= dr.getWindowHandle();
		//System.out.println(mainId);

        // Get all window handles
//        Set<String> allWindowHandles = dr.getWindowHandles();
//        Iterator<String> it = allWindowHandles.iterator();
//        
//        while(it.hasNext())
//        {
//        	String win=it.next();
//        	dr.switchTo().window(win);
//        	String currentTitle = dr.getTitle();
//        	if(currentTitle.contains("Products&action")) {
//        		break;
//        	}
//        }
                
                 
//        Thread.sleep(5000);
//        
//		dr.findElement(By.name("search_text")).sendKeys(ProductName);
//		dr.findElement(By.name("search")).click();
//		
//		Thread.sleep(2000);
//		dr.findElement(By.xpath("//a[text()='"+ProductName+"']")).click();
		
		//dr.switchTo().window(mainId);
//		Set<String> wins1 = dr.getWindowHandles();
//        Iterator<String> it1 = wins1.iterator();
//        
//        while(it1.hasNext())
//        {
//        	String win1=it1.next();
//        	dr.switchTo().window(win1);
//        	String mainTitle = dr.getTitle();
//        	if(mainTitle.contains("Campaigns&action")) {
//        		break;
//        	}
//        }
		//wlib.windowHandling(dr, CampaignName);
		
		Thread.sleep(3000);
		
//		dr.findElement(By.xpath("//input[@class='crmButton small save']")).click();
//		 dr.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		
		 int ranNum = jlib.getRandomNum();
	     
		    String prdData = elib.getExcelData("Products", 0, 0)+ ranNum;  
				         
		    prdPage.enterProductName(prdData);
		    prdPage.clickOnSaveButton();
		        
		    home.clickMoreLink();
		    home.clickCampaignsLink();
			
			CreateCampaignPage campPage = new CreateCampaignPage(dr);
			campPage.clickOnPlusSign();
		
			String campData = elib.getExcelData("Campaigns", 0, 0)+ranNum;
			campPage.enterCampaignName(prdData);
		
			CampWithPrdWindowSwitching Switching = new CampWithPrdWindowSwitching(dr);
			Switching.clickOnPrdPlusSign();
			
	        wlib.windowHandling(dr, "Products&action");
		    
	        Switching.enterPrdName(prdData);
	        Switching.searchPrdName();
		
	        Switching.prdDynamicElement(dr, prdData);
	    	
		    wlib.windowHandling(dr, "Campaigns&action");
		    
		    campPage.clickOnSaveButton();
				
			Thread.sleep(2000);
//			home.logOut(dr);
		
		
	}

}
