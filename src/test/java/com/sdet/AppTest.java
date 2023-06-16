package com.sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
  
  @Test
  public void TestLogin1()
  {
    App myApp=new App();
    Assert.assertEquals(0,myApp.userLogin("abc","abc123"));
    
  
  }
  @Test
  
  public void TestLogin2()
  {
    App myApp=new App();
    Assert.assertEquals(1,myApp.userLogin("abc","abc@123"));
    
}
}