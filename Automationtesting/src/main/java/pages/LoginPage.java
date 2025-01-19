package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id="loginform-username") private WebElement usernamefield;
	@FindBy(id="loginform-password") private WebElement passwordfield;
	@FindBy(name="login-button") private WebElement clickbutton;
	@FindBy(xpath="//a[contains(@data-toggle,'dropdown')]") private WebElement dashboard;
	
	
	
	
	public LoginPage enterUsernameOnUsernameField(String username) {
		
		usernamefield.sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		
		passwordfield.sendKeys(password);
		return this;
	}
	
    public HomePage clickbutton() {
		
		clickbutton.click();
		return new HomePage(driver);
	}
    
    public boolean isDAshboardIsLoaded() {
    	return dashboard.isDisplayed();
    }
	
	

}
