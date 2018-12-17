package comApplication_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.GenericMethods1.Generic_New;
//==========================recruiter==============================
public class Recruiter extends Generic_New{
	@FindBy(how=How.CSS,using="span[id=lblRecruiterReg]")
	public static WebElement lnk_Recruiter;
	 //==========================methods of recruiter page====================
	 //* method name:clickrecruiter
	 //purpose:to get clicked on recruiter
	 //input parameters:
	 //return type:boolean(true)
	 //dependency:
	 //date of creation:
	 //reviewed by:
	 //modified date:
	 public static boolean ClickRecruiter()
	 {
		 boolean status=true;
		 try
		 {
			 lnk_Recruiter.click();
		 }
			 catch(Exception e)
			 {
				 status=false;
				 System.out.println(e.getMessage());
			 
			}
			 return false;
	 }
}
		 
	 

