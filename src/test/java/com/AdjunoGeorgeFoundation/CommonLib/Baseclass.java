package com.AdjunoGeorgeFoundation.CommonLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.AdjunoGeorgeFoundation.POM.LoginPage;

public class Baseclass implements Constants{
	 public static WebDriver driver;
	 @Parameters("browser")
	 @BeforeClass
	 public void launchBrowser(String browser){
		 if(browser.equalsIgnoreCase("chrome")){
			 System. setProperty("webdriver.chrome.driver", "C://MavenProject//AdjunoGeorgeFoundation//src//test//resources//Resources//chromedriver.exe");
	  	        driver = new ChromeDriver();
	  	        driver.manage().window().maximize();
			 
		 }else if(browser.equalsIgnoreCase("firefox")){
			 System. setProperty("webdriver.gecko.driver", "C://MavenProject//AdjunoGeorgeFoundation//src//test//resources//Resources//geckodriver.exe");		 
			 driver=new FirefoxDriver();
			 driver.manage().window().maximize();
		 }
	 }
	
	 @AfterMethod
	 public void logoutMethod(){
		 
	 }
	 
	 @AfterClass
	 public void closeBrowser(){
		 
	 }

}
