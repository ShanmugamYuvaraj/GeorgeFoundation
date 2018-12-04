package com.AdjunoGeorgeFoundation.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath=".//*[@class='_20yN1P qt4LQw']/span[@class='_2cyQi_']") WebElement txtAccountHolderName;
	
	public WebElement getTxtAccountHolderName(){
		return txtAccountHolderName;
	}

	@FindBy(xpath=".//*[@title='Search for products, brands and more']")WebElement autoSuggestionTextBox;

	public WebElement getAutoSuggestionTextBox() {
		return autoSuggestionTextBox;
	}
	
	@FindBy(xpath="(.//*[@class='_1WMLwI header-form-search']/ul/li/a)[4]")WebElement autosuggestionList;

	public WebElement getAutosuggestionList() {
		return autosuggestionList;
	} 
	
	
}
