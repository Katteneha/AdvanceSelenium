package Practice;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utilities.Excel_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderEx3 {
	@Test(dataProvider = "getReadData")
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
		
		Random ran = new Random();
		int ranNm= ran.nextInt(1000);
		driver.findElement(By.name("accountname")).sendKeys(orgName+ranNm);
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
	public Object[][] getReadData() throws Throwable{
		Excel_Utility elib = new Excel_Utility();
		Object[][] values= elib.readDataUsingExcelforDataProvider("Data");
		return values;
		
	}
}
