package com.test_basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest1 {
	@Test
	public void z()
	{
		System.out.println("log in z successfully");
	}
	
	@Test
	public void c()
	{
		System.out.println("Log in c successfully");
	}
  @Test(priority=5,enabled=false)
  public void f() {
	  System.out.println("Log in  f successfully");
  }
  @ignore
  
  @Test(priority=4,)
  public void a()
  {
	  System.out.println("log in a successfully");
  }
}