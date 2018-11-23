package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class webconnector {
	// intitalising files and driver
	public static WebDriver driver = null;
	public static String browser = null;
	public static FileInputStream configfile = null;
	public static Properties prop = null;
	public static FileInputStream fis = null;
	public static Workbook wb = null;
	public static Sheet sheetdata = null;
	public static Actions action =null;
	
	// intialise the config file

	public static void intialise() throws IOException, BiffException {
		configfile = new FileInputStream("src\\main\\java\\resource\\Config.properties");
		prop = new Properties();
		prop.load(configfile);

	}

	// getting browser from config file

	public static String getbrowser() {
		return browser = prop.getProperty("browser");

	}

	/////////////////////////////////////// OPEN
	/////////////////////////////////////// BROWSER////////////////////////////////////////////////////////
	public static WebDriver open_browser() throws MalformedURLException {

		if (driver == null) {

			// firefox browser
			if (getbrowser().equalsIgnoreCase("Firefox")) {

				// Firefox browswe
				// Chrome browser
			} else if (getbrowser().equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver", "src\\main\\java\\resource\\chromedriver.exe");
				driver = new ChromeDriver();

				// IE browser
			} else if (getbrowser().equalsIgnoreCase("IE")) {

				// ie browser
			}

		}

		return driver;
	}

	// navigating to website
	public static void gotowebsite() {
		if (!webconnector.driver.getCurrentUrl().contains("amazon")) {
			try {
				webconnector.driver.manage().window().maximize();
                webconnector.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                webconnector.driver.get(prop.getProperty("url"));
				
				
			} catch (Exception e) {
				System.out.println(e.getStackTrace());
			}

		}
	}

	// quit browser
	public static void quitbrowser() {
		webconnector.driver.quit();
	}

}
