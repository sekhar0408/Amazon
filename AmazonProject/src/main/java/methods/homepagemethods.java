package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Utilities.util;
import Utilities.webconnector;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class homepagemethods extends webconnector{

	//repository for elements
	
	@FindBy(css="span.nav-icon.nav-arrow")
    public static WebElement dropdown;
	
	@FindBy(css="#nav-flyout-ya-signin > a > span")
    public static WebElement sign;
	
	@FindBy(id="ap_email")
	 public static WebElement emailtext;
	
	@FindBy(id="signInSubmit")
	 public static WebElement signin_emailpage;
	
	@FindBy(css="#auth-password-missing-alert > div")
	 public static WebElement Error_message;
	
	
	
	//click sign in
	public static void click_sigin(){
try {

	util.movetoelementandclick(dropdown,sign);

	
} catch ( Exception e) {
	
	e.printStackTrace();
}
		
	}

	// enter text in email
	public static void email_text1(String arg){
try {

	emailtext.sendKeys(arg);
} catch ( Exception e) {
	
	e.printStackTrace();
}
		
	}

	
	// click signin
	public static void clicksignin_emailpage(){
try {

	signin_emailpage.click();
} catch ( Exception e) {
	
	e.printStackTrace();
}
		
	}

	
	
	// verify errormessage page
	public static void error_emailsiginPage(String arg2){
try {
	
System.out.println(	Error_message.getText());
Assert.assertEquals(arg2, Error_message.getText());

} catch ( Exception e) {
	
	e.printStackTrace();
}
		
	}
	
	
	
}
