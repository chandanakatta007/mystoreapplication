package com.EmailIdTestcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.GenericMethods1.Generic_New;

import comApplication_pages.AutomationPracticeHomepage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmailCaseStudy extends  AutomationPracticeHomepage {
	AutomationPracticeHomepage autohp=PageFactory.initElements(driver,AutomationPracticeHomepage.class);
	
	@Given("launch the firefox browser and application link is opened and maximize it")
	public static void LaunchBrwsr(DataTable data)
	{
		
		List<List<String>> url=data.raw();
		Generic_New.LaunchBrowser("firefox", url.get(0).get(0));
	}
	
	@When("verify signin link is present in homepage if exists click and navigate to page")
	public static void SignIn() 
	{
		AutomationPracticeHomepage autohp=PageFactory.initElements(driver,AutomationPracticeHomepage.class);
		
		
		boolean status = lnk_signin.isDisplayed();
		//System.out.println(lnk_signin.getText().trim());
			{
		if(status=true)
		{
		System.out.println( "signin is displayed");	
		autohp.overClick(lnk_signin);
		}
		else
			try
		{
				if(status)
				{
					String s=lnk_signin.getText().trim();
					System.out.println(s);
					if(s.equalsIgnoreCase("sign in"));
					
				}
					
		}		catch(Exception e)
		{System.out.println("signin is not displayed");
	}}}
	//===========================================================
	@Then("verify  email address  under create an account and enter valid emailid")
	public static void emailId(DataTable data)
	{
		List<List<String>> url=data.raw();
	driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(url.get(0).get(0));

		System.out.println("emailid is entered");
		driver.findElement(By.xpath("//div[@class='submit']/button[@type='submit']")).click();
		WebElement eid=driver.findElement(By.xpath("//h3[text()='Your personal information']"));
		System.out.println(eid.getText());
	}

	//===============================================================
	@Then("verify you entered into your personal information page")
	public static void resigtrationPage() throws InterruptedException
	{
	System.out.println("resigtrationPage is running.....................");
	Thread.sleep(5000);
	WebElement ele_gender=	driver.findElement(By.xpath("//*[@id='uniform-id_gender1']/span"));
	boolean gen = ele_gender.isDisplayed();
	if(gen)
		ele_gender.click();
	else
		System.out.println("element not found");
	}
	
	//=======================================
	@And("verify 'First name' 'Last name' and 'Password'")
	public static void Fields(DataTable data)
	{
   List<List<String>> url=data.raw();
driver.findElement(By.xpath("//input[@class='is_required validate form-control']")).sendKeys(url.get(0).get(0));
driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys(url.get(1).get(0));;
driver.findElement(By.xpath("//input[@data-validate='isPasswd']")).sendKeys(url.get(2).get(0));
	}
}
