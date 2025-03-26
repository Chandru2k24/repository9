package com.test_basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Group2103 {
  @Test(alwaysRun=true,groups= {"regressiontest"})
  public void f() {
	  System.out.println("Login the application");
  }
  @Test(alwaysRun=true,groups={"regressiontest","smoketest"})
	public void d() {
	  System.out.println("Launch the app");
  }
  @Test(alwaysRun=true,groups= {"regressiontest","smoketest","sanitarytest"})
  public void e() {
	  System.out.println("Login the application");
  }

}
