package com.test_basics;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Paramenter2103 {
  
  @Parameters({"val1","val2"})
  @Test
 public void Sum(int v1,int v2) {
	  int finalsum=v1+v2;
	  System.out.println("The final sum of the given values is"+finalsum);
  }
  
  @Parameters({"val3","val4"})
  @Test
  public void Sum2(int v3,int v4) {
	  int finalsum=v3+v4;
	  System.out.println("The final sum of the given values is"+finalsum);
  }
}
