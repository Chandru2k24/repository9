package com.test_basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
    
public class dependson {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("login");
  }
  @Test()
  public void c() {
	  System.out.println("login2");
  }
  @Test(dependsOnMethods= {"c"})
 
  public void b() {
	  System.out.println("Login3");
  }

 

}
