package com.TestCases;

import org.openqa.selenium.By;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericMethods1.Generic_New;

import comApplication_pages.HomePage;
import comApplication_pages.Recruiter;
//==========================methods of recruiter page====================
	 //* method name:validateregisterlink
	 //purpose:to get clicked on register
	 //input parameters:
	 //return type:boolean(true)
	 //dependency:
	 //date of creation:
	 //reviewed by:
	 //modified date:
public class TC1_ValidateRegisterLink extends Generic_New {
	@Test
	public static void validateRegisterLink() {
		
		// WebDriver driver=new FirefoxDriver();
		// driver.get("https://www.talentzing.com/");
		// driver.manage().window().maximize();
		//LaunchBrowser("firefox", "https://www.talentzing.com/");
		//driver.manage().window().maximize();
		//LaunchBrowser("chrome", "https://www.talentzing.com/");
		
		
		//launch browser and enter url
		LaunchBrowser("firefox","https://www.talentzing.com/");
		boolean status = true;
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		
		//click on register
		homepage.ClickRegister();
		driver.findElement(By.id("lblRecruiterReg"));
		Recruiter recruiter = PageFactory.initElements(driver, Recruiter.class);
		
		//click on recruiter
		recruiter.ClickRecruiter();
	}

}
