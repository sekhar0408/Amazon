package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class util extends webconnector{

// waiting for element to appear	
public static WebElement waitforelementtoappear(WebElement element){
	
	WebDriverWait wait = new WebDriverWait(webconnector.driver, 10);
	 
	 return wait.until(ExpectedConditions.elementToBeClickable(element));
	
}

//actions move to element and click
public static void movetoelementandclick (WebElement header,WebElement subelement){
	
	 action = new Actions(webconnector.driver);
		action.moveToElement(header).moveToElement(subelement).click().build().perform();
}


}
