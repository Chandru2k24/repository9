package Dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProviders2 {
	
	
	@DataProvider(name ="testData",parallel= true)
	public Object[][] dataProv(){
//		return new Object[][] {{"Selenium"},{"Automation"}};
		return new Object[][] {{"Automation Tester","2-5 years"},
			{"Performance Tester","3+years"},
			{"Devops", "5+ years"}};
		}
	}
	
