package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkersPage {
	public WebDriver driver;
	  public WorkersPage(WebDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="workersearch-first_name") private WebElement workerFirstName;
	@FindBy(id="workersearch-last_name") private WebElement workerLastName;
	@FindBy(id="workersearch-postcode") private WebElement workerPostCode;
	@FindBy(id="workersearch-ni_number") private WebElement workerNiNumber;
	@FindBy(xpath="//button[@type='submit']") private WebElement workerSearchButton;
	@FindBy(xpath="//a[@data-sort='employment_type']") private WebElement employmentType;
	
	  
	  
	  public WorkersPage enterWorkerFirstNameOnField(String firstname) {
		  workerFirstName.sendKeys(firstname);	
		  return this;
	  }
	  public WorkersPage enterWorkerLastnameOnField(String lastname) {
		  workerLastName.sendKeys(lastname);
		  return this;
	  }
	  public WorkersPage enterWorkerPostCodeOnField(String postcode) {
		  workerPostCode.sendKeys(postcode); 
		  return this;
	  }
	  public WorkersPage enterNiNumberOnField(String ninumber) {
		  workerNiNumber.sendKeys(ninumber);
		  return this;
	  }
public WorkersPage searchButtonClick() {
	workerSearchButton.click();
	return this;
}
public boolean isEmploymentDisplayed() {
	return employmentType.isDisplayed();
}
}