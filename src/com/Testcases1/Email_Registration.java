package com.Testcases1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.GenericMethods1.Generic_New;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Email_Registration extends Generic_New 
{
@Given("launch the firefox browser and application link is opened and maximize it")
public static void LaunchBrwsr(DataTable data)
{
	
	List<List<String>> url=data.raw();
	Generic_New.LaunchBrowser("firefox", url.get(0).get(0));
}
@When("verify signin link is present in homepage if exists click and navigate to page")
public static void SignIn() 
{
	
	
	WebElement signin=driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
	boolean status = signin.isDisplayed();
	System.out.println(signin.getText());
		{
	if(status=true)
	{
	System.out.println(signin.getText() +" is displayed");	
signin.click();

	}
	else
		System.out.println("signin is not displayed");
}}
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
@And("verify you entered into your 'personal information page'")
public static void resigtrationPage(DataTable data)
{
//	List<List<String>> n=data.raw();
//List<WebElement> rdo=driver.findElements(By.name("id_gender"));
//System.out.println(rdo.size());
driver.findElement(By.xpath("//*[@id ='uniform-id_gender1']/span/input")).click();
//driver.findElement(By.xpath("//input[@class='is_required validate form-control']")).sendKeys(n.get(1).get(0));
//driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys(n.get(2).get(0));;
//driver.findElement(By.xpath("//input[@data-validate='isPasswd']")).sendKeys(n.get(3).get(0));
}


}
