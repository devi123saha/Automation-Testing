package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SampleTest {
  @Test
  public void samp() {
	  System.out.println("Hello");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After");
  }

}
