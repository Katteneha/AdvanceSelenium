package Generic_Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utility {
	
	
	public void maximizingWindow(WebDriver dr) {
		dr.manage().window().maximize();
	}
	
	/**
	 * This method is used for wait elements to get loaded in webpage
	 * @param 
	 */
	public void implicitly_Wait(WebDriver dr)
	{
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	/**
	 *   it's an Explicitly wait Always wait for Page to be loaded & available in GUI
	 * @param driver
	 * @param partailPageURL
	 */
	public void waitForPage(WebDriver dr , String partailPageURL) {
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlContains(partailPageURL));
	}
	
	/**
	 *   it's an Explicitly wait Always wait for Page to be loaded & available in GUI
	 * @param driver
	 * @param partailPageURL
	 */
	public void waitForElement (WebDriver dr , WebElement element) {
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * this method is used to accept the alert popup
	 * @param driver
	 */
	public void alertAccept(WebDriver dr)
	{
		dr.switchTo().alert().accept();
	}
	
	/** this method is used to dismiss the alert popup
	 * 
	 * @param driver
	 */
	public void alertDismiss(WebDriver dr)
	{
		dr.switchTo().alert().dismiss();
	}
	
	/**
	 * This method is used for windowSwitching
	 * @param dr
	 * @param particalTitle
	 */
	
	public void windowHandling(WebDriver dr, String particalTitle) {
		Set<String> wins1 = dr.getWindowHandles();
        Iterator<String> it1 = wins1.iterator();
        
        while(it1.hasNext())
        {
        	String win1=it1.next();
        	dr.switchTo().window(win1);
        	String mainTitle = dr.getTitle();
        	if(mainTitle.contains(particalTitle)) {
        		break;
        	}
        }
	}

	public void moveToElement(WebDriver dr, WebElement element) {
		Actions actions = new Actions(dr);
        actions.moveToElement(element).perform();
		
	}
	public void closeBrowser(WebDriver dr) {
		dr.close();
	}
	 public static String takeScreenshot(WebDriver dr, String screenShotName) throws Throwable {
		
		 TakesScreenshot ts = (TakesScreenshot)BaseClass.sDriver;
		 File src= ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./ScreenshotVTiger/"+screenShotName+".png");
		 FileUtils.copyFile(src, dest);
					
		 return dest.getAbsolutePath();
		 
	 }

	
}
