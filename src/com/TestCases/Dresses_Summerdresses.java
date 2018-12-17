package com.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.GenericMethods1.Generic_New;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Dresses_Summerdresses extends Generic_New
{
@Given("launch the firefox browser and application link is opened and maximize")
public static boolean LaunchBrowser2(DataTable data)
{
	List<List<String>> url=data.raw();
	Generic_New.LaunchBrowser("firefox", url.get(0).get(0));
	return true;
}
@When("dresses should contain summer dresses") 
public static void Dresses1()
{	
	boolean status=true;
	WebElement dress=driver.findElement(By.xpath("//div[@class='sf-contener clearfix col-lg-12']/ul/li[2]/a"));
	status=overClick(dress);
	System.out.println("dresses page opend successfully");
	if(status=true)
	{
		String SummerDressesSection=driver.findElement(By.xpath("//div[@id='categories_block_left']/h2")).getText();
	if(SummerDressesSection.equalsIgnoreCase("Dresses"))
	{
		System.out.println("dresses page opened successfully and dresses section is present");
		
		
	}
	else
	{
		System.out.println("unable to find dresses");
		
	}
	WebElement b1=driver.findElement(By.xpath("//div[@id='categories_block_left']/div/ul[1]/li[3]/a"));
	String s1=b1.getText().trim();
	{
	if(s1.equalsIgnoreCase("Summer Dresses"))
			{
	System.out.println(" summer Dresses menu is present");
	
	}
boolean status1 = overClick(b1);
System.out.println("summer dresses clicked");
	}
}
	
	 
	



	

	}		
	}

