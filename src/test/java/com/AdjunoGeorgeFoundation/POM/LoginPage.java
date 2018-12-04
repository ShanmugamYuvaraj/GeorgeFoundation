package com.AdjunoGeorgeFoundation.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.AdjunoGeorgeFoundation.CommonLib.Baseclass;
import com.AdjunoGeorgeFoundation.CommonLib.Constants;
import com.AdjunoGeorgeFoundation.CommonLib.WebDriverCommonLib;

public class LoginPage extends WebDriverCommonLib {
	@FindBy(xpath=".//*[@type='text' and @class='_2zrpKA']")WebElement txtUserName;
	@FindBy(xpath=".//*[@class='_2zrpKA _2rqcw- _2VUCMV F_Atl2']")WebElement txtUserNameFieldAfterInvalidLogin;
	@FindBy(xpath=".//*[@type='password']")WebElement txtPassword;
	@FindBy(xpath=".//*[@class='_2AkmmA _1LctnI _7UHT_c' and @type='submit']")WebElement clkLoginBtn;
	@FindBy(xpath=".//*[@class='Og_iib col col-2-5 _3SWFXF']")WebElement checkLoginPopupDisplayed;
	@FindBy(xpath=".//*[@class='ZAtlA-']/span") WebElement txtInvalidMessage;

	public WebElement getTxtInvalidMessage(){
		return txtInvalidMessage;
	}

	public boolean navigateURL(){
		waitForPageLoad();
		Baseclass.driver.get(Constants.url);
		return checkLoginPopupDisplayed.isDisplayed();
	}
	
	public void validLogin(){
		txtUserNameFieldAfterInvalidLogin.clear();
		txtPassword.clear();
		txtUserName.sendKeys(Constants.userName);
		txtPassword.sendKeys(Constants.passWord);
		clkLoginBtn.click();	
	}
	
	public void inValidLogin(){

		txtUserName.sendKeys(Constants.userName);
		txtPassword.sendKeys(Constants.inCorrectPassword);
		clkLoginBtn.click();
			
	}
	

}
