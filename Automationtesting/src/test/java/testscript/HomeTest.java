package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends Base{
	HomePage home;
  @Test
  @Parameters({"username","password"})
  public void verifyLogOut(String username,String password) {
	 
	  LoginPage login=new LoginPage(driver);
	  //login.enterUsernameOnUsernameField("Carol").enterPassword("1q2w3e4r");
	  login.enterUsernameOnUsernameField(username).enterPassword(password);
	  home=login.clickbutton();
	  home.logout();
	/*  login.enterUsernameOnUsernameField("carol");
		login.enterPasswordField("1q2w3e4r");
		login.clickonLoginButton();
	  
	  HomePage homepage=new HomePage(driver);
	    homepage.logout(); */
	  boolean loginpageloaded=home.isLoginPageDisplayed();
		Assert.assertTrue(loginpageloaded, "login page  is not loaded");
	  
	  
	  
	  
	  
  }
  
}