package com.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.GenericMethods1.Generic_New;

import cucumber.api.java.en.Given;

public class TC_Dresses extends Generic_New {
@Given("dresses page opened")
public static  void Dresses()
{
	boolean status=true;
	WebElement dress=driver.findElement(By.xpath("//div[@class='sf-contener clearfix col-lg-12']/ul/li[2]/a"));
	status=overClick(dress);
	System.out.println("dresses page opend successfully");
	if(status=true)
	{
		String DressesSection=driver.findElement(By.xpath("//div[@id='categories_block_left']/h2")).getText();
	if(DressesSection.equalsIgnoreCase("Dresses"))
	{
		System.out.println("dresses page opened successfully and dresses section is present");
		
		
	}
	else
	{
		System.out.println("unable to find dresses");
	}
	}
	String a[]={"Casual Dresses","Evening Dresses","summer dresses"};
	List<WebElement> boxes=driver.findElements(By.xpath("//div[@id='categories_block_left']/div/ul[1]/li/a"));
	int n=boxes.size();
	String check[]=new String[n];
	for(int i=0;i<boxes.size();i++)
	{
		check[i]=boxes.get(i).getText().trim();
		System.out.println(check[i]);
		if(check[i].contains(a[i]))
		{
			System.out.println(a[i]+"option is present in dresses menu");
			
		}
	}
	
	
}
}

