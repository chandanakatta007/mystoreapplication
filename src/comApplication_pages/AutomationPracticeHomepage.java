package comApplication_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericMethods1.Generic_New;

public class AutomationPracticeHomepage extends Generic_New {
	@FindBy(how=How.XPATH,using="//a[@title='Log in to your customer account']")
	 public static WebElement lnk_signin;
	@FindBy(how=How.XPATH,using="//input[@id='email_create']")
	 public static WebElement emailcr;
	@FindBy(how=How.XPATH,using="//div[@class='submit']/button[@type='submit']")
	 public static WebElement submit;
	@FindBy(how=How.XPATH,using="//h3[text()='Your personal information']")
	 public static WebElement txtpr;
	@FindBy(how=How.XPATH,using="//*[@id='uniform-id_gender1']/span")
	 public static WebElement Mr_btn;
	@FindBy(how=How.XPATH,using="//input[@class='is_required validate form-control']")
	 public static WebElement Frst_N;
	@FindBy(how=How.XPATH,using="//input[@id='customer_lastname']")
	 public static WebElement Lst_N;
	@FindBy(how=How.XPATH,using="//input[@data-validate='isPasswd']")
	 public static WebElement psswd ;
	@FindBy(how=How.XPATH,using="//select[@id='days']/option[13]")
	 public static WebElement day_dp ;
	@FindBy(how=How.XPATH,using="//select[@id='months']/option[12]")
	 public static WebElement mnth_dp ;
	@FindBy(how=How.XPATH,using="//select[@id='years']/option[2]")
	 public static WebElement yr_dp ;
	
}
