package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ClientsPage;
import pages.HomePage;
import pages.LoginPage;

public class ClientTest extends Base{
	ClientsPage client;
	HomePage home;
  @Test
  public void verifySearch() {
	  LoginPage logins=new LoginPage(driver);
	  logins.enterUsernameOnUsernameField("Carol").enterPassword("1q2w3e4r");
	  home=logins.clickbutton();
	  client=home.clientclick();
	  client.enterClientNameOnField("Sam").enterClientIdOnField("3").clickOnSearchButton();
	  
	 /* logins.enterUsernameOnUsernameField("carol");
		logins.enterPasswordField("1q2w3e4r");
		logins.clickonLoginButton();
	  
	  
	  ClientsPage clientspage=new ClientsPage(driver);
	  clientspage.clientclick();
	  clientspage.enterClientNameOnField("Sam");
	  clientspage.enterClientIdOnField("3");
	  clientspage.clickOnSearchButton();*/
	//  boolean clientAddressLoaded=clientspage.isclientAddressDisplayed();
	//	Assert.assertTrue(clientAddressLoaded," client address is not loaded");
	  
  }
}