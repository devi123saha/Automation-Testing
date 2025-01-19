package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	  public HomePage(WebDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[@class='dropdown-toggle']")private WebElement logoutcarolclick;
@FindBy(xpath="//a[@class='logout-btn']")private WebElement logoutbuttonclick;
@FindBy(name="login-button")private WebElement clickloginButton;

@FindBy(xpath="//a[text()='Clients']") private WebElement clientsclick;
@FindBy(xpath="(//a[text()='Workers'])[1]")  private WebElement workersClick;



public ClientsPage clientclick() {
	  driver.navigate().to("https://www.qabible.in/payrollapp/client/index");
	  clientsclick.click();	
	 return new ClientsPage(driver);
}
public WorkersPage workerclick(){
	driver.navigate().to("https://www.qabible.in/payrollapp/client/index");
	workersClick.click();
	return new WorkersPage(driver);
	
}

public HomePage logout() {
	//driver.navigate().to("https://www.qabible.in/payrollapp/site/index");
	logoutcarolclick.click();
	logoutbuttonclick.click();
	return this;
}
public boolean isLoginPageDisplayed() {
	return clickloginButton.isDisplayed();
	
}
}