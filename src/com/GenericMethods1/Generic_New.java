package com.GenericMethods1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//==========================methods of launching page====================
	 //* method name:launch browser
	 //purpose:launching
	 //input parameters:
	 //return type:boolean(true)
	 //dependency:
	 //date of creation:
	 //reviewed by:
	 //modified date:
public class Generic_New {

	public static WebDriver driver;
	public static void LaunchBrowser(String browser,String url)
		{
		
			boolean status=true;
			try
			{
		switch(browser.toLowerCase().trim())
		{
		case "firefox":
			driver=new FirefoxDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TM\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			break;
		case "internetexplorer":
			System.setProperty("webdriver.ie.driver", "C:\\Users\\TM\\Desktop\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			break;
			default:
				System.out.println("unable to launch browser");
		}
		
				
		}
			
		catch(Exception e)	
		{
			status=false;
		System.out.println(e.getMessage());
		}
		}
	//=====================click recruiter================
		 //* method name:clickrecr
		 //purpose:to get clicked on recruiter
		 //input parameters:
		 //return type:boolean(true)
		 //dependency:
		 //date of creation:
		 //reviewed by:
		 //modified date:

	public static boolean overClick(WebElement element) {
		boolean status = true;
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
			Actions actn = new Actions(driver);
			actn.moveToElement(element).click(element).build().perform();
		}

		catch (Exception e) {
			status = false;
			System.out.println(e.getMessage());
		
		}
		return status;
			
		}
	//=====================click sending data================
	 //* method name:click and send data
	 //purpose:send data
	 //input parameters:
	 //return type:boolean(true)
	 //dependency:
	 //date of creation:
	 //reviewed by:
	 //modified date:

private static boolean ClickAndSendData(WebElement element,String data) 
	{
		boolean status = true;
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
			
		}
		

catch (Exception e) {
			status = false;
			System.out.println(e.getMessage());
			
			
}
	return status;
	}	

}

