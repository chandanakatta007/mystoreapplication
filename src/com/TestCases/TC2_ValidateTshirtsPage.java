package com.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;

import com.GenericMethods1.Generic_New;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC2_ValidateTshirtsPage extends Generic_New 

{
public static boolean stepstatus;
@Given("launch the firefox browser and application link is opened and maximize it")
public static boolean LaunchBrowser1(DataTable data)
{
	List<List<String>> url=data.raw();
	Generic_New.LaunchBrowser("firefox", url.get(0).get(0));
	//driver.findElement(By.linkText("T-shirts")).click();
	return stepstatus=true;
}
@When("verify T-shirts clicked")
public static void TshirtsAvail()
{
	
	driver.findElement(By.xpath("(//a[text()='T-shirts'])[last()]")).click();
	//driver.findElement(By.xpath("//*[@*='T-shirts']")).click();
	

//driver.findElement(By.xpath("//ul[@id='ul_layered_id_attribute_group_1']/li//input")).click();;
//	driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_2']")).click();
	List<WebElement> chkb=driver.findElements(By.className("checkbox"));
	System.out.println(chkb.size());
	for(int i = 0;i<chkb.size();i++)
	{
	boolean b=chkb.get(i).isDisplayed();
	if(b=true)
	{
		System.out.println(b);
		System.out.println(chkb.get(i).getAttribute("type"));
	}

	}	
driver.navigate().back();

}
}



	

