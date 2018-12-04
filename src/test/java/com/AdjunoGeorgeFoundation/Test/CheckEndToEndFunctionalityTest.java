package com.AdjunoGeorgeFoundation.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.AdjunoGeorgeFoundation.CommonLib.Baseclass;
import com.AdjunoGeorgeFoundation.CommonLib.UtilityClass;
import com.AdjunoGeorgeFoundation.CommonLib.WebDriverCommonLib;
import com.AdjunoGeorgeFoundation.POM.HomePage;
import com.AdjunoGeorgeFoundation.POM.LoginPage;
import com.AdjunoGeorgeFoundation.POM.SearchResultPage;

public class CheckEndToEndFunctionalityTest extends Baseclass{
	boolean bFlag;
	String strMessage="";
	String txtErrorMessageForInValidLogin;
	String txtAccountHolderName;
		
	WebDriverCommonLib commonLib=new WebDriverCommonLib();
	
	public static LoginPage loginpage;
	public static HomePage homePage;
	public static SearchResultPage searchPage;
	
	@Test(priority=1)
	public void test_1_LaunchTheBrowser() throws InterruptedException{
		SoftAssert objSoftAssert=new SoftAssert();
		loginpage=PageFactory.initElements(Baseclass.driver, LoginPage.class);
		bFlag=loginpage.navigateURL();
		System.out.println(bFlag);
		objSoftAssert.assertEquals(bFlag, true,"***** test_1_The Login Popup for FlipKart application is not displayed");
		objSoftAssert.assertAll();
	}
	
	@Test(priority=5)
	public void test_2_LoginWithIncorrectCredentials() throws InterruptedException{
		SoftAssert objSoftAssert=new SoftAssert();
		loginpage=PageFactory.initElements(Baseclass.driver, LoginPage.class);
		loginpage.inValidLogin();
		txtErrorMessageForInValidLogin=loginpage.getTxtInvalidMessage().getText();
		
		objSoftAssert.assertEquals(txtErrorMessageForInValidLogin.equalsIgnoreCase("Your username or password is incorrect"), true,"***** test_2_In FlipKart application when we are login by using invalid credentials, The error message is not displayed *****");
		objSoftAssert.assertAll();
	}
	
	@Test(priority=10)
	public void test_3_LoginWithCorrectCredentials() throws InterruptedException{
		SoftAssert objSoftAssert=new SoftAssert();
		Thread.sleep(3000);
		loginpage=PageFactory.initElements(Baseclass.driver, LoginPage.class);
		loginpage.validLogin();
		homePage=PageFactory.initElements(Baseclass.driver, HomePage.class);
		commonLib.waitForElementPresent(homePage.getTxtAccountHolderName());
		txtAccountHolderName=homePage.getTxtAccountHolderName().getText();
		
		objSoftAssert.assertEquals(txtAccountHolderName.equalsIgnoreCase("Shannu35"), true,"***** test_3_ In FlipKart application the user name is incorrect *****");
		objSoftAssert.assertAll();
	}
	
	@Test(priority=15)
	public void test_4_SearchProductFromAutosuggestionBox() throws InterruptedException{
		SoftAssert objSoftAssert=new SoftAssert();
		Thread.sleep(3000);
		
		homePage.getAutoSuggestionTextBox().sendKeys("Samsung mobile");
		Thread.sleep(3000);
		String mobileName =homePage.getAutosuggestionList().getText();
		homePage.getAutosuggestionList().click();
		
		searchPage=PageFactory.initElements(Baseclass.driver, SearchResultPage.class);
		String searchResultmobileName =searchPage.getSearchResultText().getText();
		System.out.println(mobileName+"--"+searchResultmobileName);
		objSoftAssert.assertEquals(mobileName, searchResultmobileName,"**** test-4- The Loaded page was wrong with compare to whatever suggestion would you selected *****_");
		
		objSoftAssert.assertAll();
		
	}
	
	

	@AfterMethod
	public void tearDown(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
			UtilityClass.captureScreenshot(driver, result.getName());
		}
		
	}

		

}
