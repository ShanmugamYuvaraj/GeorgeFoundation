package com.AdjunoGeorgeFoundation.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage {
	@FindBy(xpath=".//*[@class='GSPgJx']/div[2]/h1/span/span") WebElement searchResultText;

	public WebElement getSearchResultText() {
		return searchResultText;
	}
	
	

}
