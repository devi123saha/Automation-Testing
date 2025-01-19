package testscript;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Base {
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://www.qabible.in/payrollapp/site/login");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}