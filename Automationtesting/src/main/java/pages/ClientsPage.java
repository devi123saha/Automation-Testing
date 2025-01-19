package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class ClientsPage {
	public WebDriver driver;
	  public ClientsPage(WebDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  @FindBy(id="clientsearch-client_name") private WebElement clientNameClick;
	  @FindBy(id="clientsearch-id") private WebElement clientIdClick;
	 
	  @FindBy(xpath="//button[@type='submit']") private WebElement searchClick;
	  @FindBy(xpath="//a[@data-sort='client_address']") private WebElement clientAddress;
	  
	  
	  
	  
	  
	  public ClientsPage enterClientNameOnField(String clientname) {
		  clientNameClick.sendKeys(clientname); 
		  return this;
		   }
	  public ClientsPage enterClientIdOnField(String id) {
		  clientIdClick.sendKeys(id);
		  return this;
	  }
public ClientsPage clickOnSearchButton() {
	searchClick.click();
	return this;
}
	  
public boolean isclientAddressDisplayed() {
	return clientAddress.isDisplayed();  
	  
	  
	  
	  
	  
	  
	  
}}