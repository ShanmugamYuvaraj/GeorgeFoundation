package com.AdjunoGeorgeFoundation.CommonLib;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass {
		
	public static void captureScreenshot(WebDriver driver,String ScreenshotName){
		try{
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			File source=screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/"+ScreenshotName+".png"));
			System.out.println("Screenshot taken");
				
		}catch(Exception e){
			System.out.println("Exception handled..."+e.getMessage());
		}
	}
	
}
