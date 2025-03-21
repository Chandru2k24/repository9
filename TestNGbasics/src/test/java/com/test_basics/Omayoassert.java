package com.test_basics;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Omayoassert {
	WebDriver driver=new ChromeDriver();
  @Test
  public void f() {
	  SoftAssert obj=new SoftAssert();
	  driver.findElement(By.xpath("//a[@title=\"My Account\"]")).click();
	  driver.findElement(By.xpath("//ul[@class=\"dropdown-menu dropdown-menu-right\"]//li[1]//a")).click();
	  String actual="Register Accoun";
	  String exp=driver.getTitle();
	  obj.assertEquals(actual, exp,"incorrect page title");
	  System.out.println("TITLE ARE SAME IN REGISTER");
	  driver.findElement(By.xpath("//div[@id=\"logo\"]//h1//a")).click();
	  String actual1="Your Store";
	  String exp1=driver.getTitle();
	  Assert.assertEquals(actual1, exp1);
	  System.out.println("title are same in home page");
	  obj.assertAll();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	 
		  driver.manage().window().maximize();
		  driver.get("https://tutorialsninja.com/demo/");
  }

  @AfterTest
  public void afterTest() {
  }

}
