package comApplication_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.GenericMethods1.Generic_New;
//===================webelements=====================
//===================creating homepage==================
public class HomePage extends Generic_New {
 @FindBy(how=How.CSS,using="span[id=lnkRegistration]")
 public static WebElement lnk_Register;
 
 //==========================methods of home page====================
 //* method name:clickregister
 //purpose:to get clicked on register
 //inputparameters:
 //return type:boolean(true)
 //dependency:
 //date of creation:
 //reviewed by:
 //modified date:
 public static boolean ClickRegister()
 {
	 boolean status=true;
	 try
	 {
		 overClick(lnk_Register);
	 }
	 catch(Exception e)
	 {
		 status=false;
		 System.out.println(e.getMessage());
	 
	}
	 return false;
 }
 
}
