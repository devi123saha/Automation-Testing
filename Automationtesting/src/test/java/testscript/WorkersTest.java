package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.WorkersPage;

public class WorkersTest extends Base {
	WorkersPage worker;
	HomePage homes;
  @Test
  public void verifyWorkerSearch() {
	  LoginPage logins=new LoginPage(driver);
	  logins.enterUsernameOnUsernameField("Carol").enterPassword("1q2w3e4r");
	  homes=logins.clickbutton();
	  worker=homes.workerclick();
	  worker.enterWorkerFirstNameOnField("Dennis").enterWorkerLastnameOnField("Benny").enterWorkerPostCodeOnField("695").enterNiNumberOnField("6955810").searchButtonClick();
	  boolean employmentloaded=worker.isEmploymentDisplayed();
	  Assert.assertTrue(employmentloaded, "workers page is not loaded");
  }
}