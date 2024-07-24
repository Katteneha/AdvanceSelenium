package Contacts;

import java.io.FileInputStream;
import java.time.Duration;
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
import Generic_Utilities.Java_Utility;
import Object_Repository.CreateOrganizationPage;
import Object_Repository.ValidationAndVerificationPage;
import Object_Repository.homePage;
import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(Generic_Utilities.ListenerImplementations.class)
public class CreateContactWithOrganizationTest extends BaseClass {
	
	@Test
	public void CreateContactWithOrganization() throws Throwable {
		
		homePage home = new homePage(dr);
		home.clickOrganizationLink();
		
		CreateOrganizationPage createOrg =new CreateOrganizationPage(dr);
		createOrg.clickPlusImg();
		
		int ranNum = jlib.getRandomNum();
        String orgData = elib.readExcelDataUsingDataFormatter("Organizations", 0, 0)+ranNum;
        String phoneNum = elib.readExcelDataUsingDataFormatter("Organizations", 1, 0);
        String emailId = elib.readExcelDataUsingDataFormatter("Organizations", 2, 0);
        createOrg.createOrgData(orgData, phoneNum, emailId);
        createOrg.clickOnSaveButton();
		
        Thread.sleep(2000);
		
		ValidationAndVerificationPage orgValid = new ValidationAndVerificationPage(dr);
		orgValid.orgValidation(dr, orgData);
		
		
		
//		FileInputStream fis = new FileInputStream("./src/test/resources/ExcelTestData.xlsx");
//		
//		Workbook book= WorkbookFactory.create(fis);
//		Sheet sheet= book.getSheet("Organizations");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		
//		String OrgName = cell.getStringCellValue()+ranNum;
//		
//		dr.findElement(By.xpath("//input[@name='accountname']")).sendKeys(OrgName);
//		dr.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		
//		Thread.sleep(2000);
		
		
		
		
		
//		//Now navigate to Contact page
//		dr.findElement(By.linkText("Contacts")).click();
//		dr.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		
//		home.clickContactsLink();
//		
//		FileInputStream fis1 = new FileInputStream("./src/test/resources/ExcelTestData.xlsx");
//		
//		Workbook book1= WorkbookFactory.create(fis1);
//		Sheet sheet1= book1.getSheet("Contacts");
//		Row row1 = sheet1.getRow(0);
//		Cell cell1 = row1.getCell(0);
//		
//		String ContactName = cell1.getStringCellValue()+ranNum;
//		
//		dr.findElement(By.name("lastname")).sendKeys(ContactName);
//		dr.findElement(By.xpath("(//img[@src='themes/softed/images/select.gif'])[1]")).click();
//		
//		Set<String> allWindows = dr.getWindowHandles();
//		Iterator<String> it = allWindows.iterator();
//		
//		while(it.hasNext()) {
//			String win = it.next();
//			dr.switchTo().window(win);
//			String currentTitle = dr.getTitle();
//			if(currentTitle.contains("Accounts&action")) 
//			{
//				break;
//			}
//		}
//		
//		Thread.sleep(2000);
//		dr.findElement(By.name("search_text")).sendKeys(OrgName);;
//		dr.findElement(By.name("search")).click();
//		
//		dr.findElement(By.xpath("//a[text()='"+OrgName+"']")).click();
//		
//		Set<String> mainWindow = dr.getWindowHandles();
//		Iterator<String> it1 = mainWindow.iterator();
//		
//		while(it1.hasNext()) {
//			String win1 = it1.next();
//			dr.switchTo().window(win1);
//			String mainId = dr.getTitle();
//			if(mainId.contains("Contacts&action")) {
//				break;
//			}
//		}
//		
//		Thread.sleep(3000);
//		
//		dr.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		
//		Thread.sleep(2000);
//		dr.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//		dr.findElement(By.linkText("Sign Out")).click();
		
	}

}
