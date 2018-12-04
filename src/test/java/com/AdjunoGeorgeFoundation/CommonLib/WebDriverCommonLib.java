package com.AdjunoGeorgeFoundation.CommonLib;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverCommonLib extends Baseclass{
	public static WebDriver driver;
	
	public void waitForPageLoad(){
		Baseclass.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void waitForElementPresent(WebElement wb){
		WebDriverWait wait=new WebDriverWait(Baseclass.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(wb));
	}

	public boolean setTextFieldValue(WebElement wb,String value){
		boolean bFlag=false;
		if(value.isEmpty()){
			wb.sendKeys(value);
			bFlag=true;
		}
		return bFlag;
	}
	
	public int generateRandomNumber(List<WebElement> wb){
		int size=wb.size();
		Random rand = new Random();
		int randomPo;
		int rand_int = rand.nextInt(size);
		randomPo =rand_int;
		return randomPo;

	}
	public void selectValueRandomly(List<WebElement> wb){
		
		
	}
}
