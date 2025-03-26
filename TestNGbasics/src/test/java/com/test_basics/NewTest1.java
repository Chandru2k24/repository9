package com.test_basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest1 {
  @Test
  public void f() {
	 
	  	  String str1 = new String("TestNG");
	  	  String str2=new String("TestNG");
	  	  String str3=null;
	  	  String str4="TestNG";
	  	  String str5="TestNG";
	  	  String str6=new String("Not_TestNG");
	  	  int val1=5;
	  	  int val2=6;
	  	  Assert.assertEquals(str1, str2);
	  	  System.out.println("Equals Assertio is successful");
	  	 // Assert.assertNotEquals(str1, str2);
	  	  System.out.println("Not Equals Assertio is successful");
	  	  Assert.assertTrue(val1<val2);
	  	  System.out.println("True Assertion is successfull");
	  	 Assert.assertEquals(str4, str5);
	  	  System.out.println("Equals Assertio is successful");
	  	  
	    }
	  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
