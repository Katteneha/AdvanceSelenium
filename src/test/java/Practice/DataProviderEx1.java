package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderEx1 {
	
	@Test(dataProvider = "getReadDataUsingExcel")
	public void ClickOrganization(String orgName, String phnum , String emailId) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.cssSelector("[alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.id("phone")).sendKeys(phnum);
		driver.findElement(By.id("email1")).sendKeys(emailId);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(1000);
		driver.quit();
	}

	@DataProvider
	public Object[][] getReadData(){
		Object[][] objArr = new Object[3][3];
		Random ran = new Random();
		int ranNum = ran.nextInt(100);
		
		objArr[0][0]="AAA"+ranNum;
		objArr[0][1]="8692626525";
		objArr[0][2]="mailto:abc@gmail.com";
		
		objArr[1][0]="BBB"+ranNum;
		objArr[1][1]="8692626525";
		objArr[1][2]="mailto:psq@gmail.com";
		
		objArr[2][0]="CCC"+ranNum;
		objArr[2][1]="8692626525";
		objArr[2][2]="mailto:xyz@gmail.com";
		
		return objArr;
		
	}
	
	
}
