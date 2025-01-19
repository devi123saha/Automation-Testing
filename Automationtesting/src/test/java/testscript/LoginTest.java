package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends Base{
	
	
	HomePage home;
	
  @Test(dataProvider = "credentials")
  public void verify_valid_credentials(String username,String password) {
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUsernameOnUsernameField(username).enterPassword(password);
	  home=loginpage.clickbutton();
	  //loginpage.enterUsernameOnUsernameField("carol");
	  
	  //LoginPage loginpass = new LoginPage(driver);
	  //loginpass.enterPassword("1q2w3e4r");
	  
	  
	  //LoginPage loginbutton = new LoginPage(driver);
	  //loginbutton.clickbutton();
	  
	  boolean dashboardloaded = loginpage.isDAshboardIsLoaded();
	  Assert.assertTrue(dashboardloaded, "Dashboard is not loaded");
	  
	  //Assert.assertEquals(driver.getTitle(),"CAROL THOMAS", "dashboard is not loaded");
	  
	  
 }
  @DataProvider(name="credentials")
  public Object[][] testData(){
	  Object data[][]= {{"Carol","1q2w3e4r"},{"Devika","devi123saha"}};
	  return data;
  }
}