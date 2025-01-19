package browserinitialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckRadio extends Base {
	
	public void checkBox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.id("gridCheck"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		
}
	public void enabled() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmessage=driver.findElement(By.id("button-one"));
		showmessage.click();
		System.out.println(showmessage.isEnabled());
	}
	public void display() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessage=driver.findElement(By.id("button-one"));
		System.out.println(showMessage.isDisplayed());
	}
	public void radioButton() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio=driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
		radio.click();
		System.out.println(radio.isSelected());
	WebElement showselectedvalue=driver.findElement(By.id("button-one"));
		showselectedvalue.click();
	}
	public static void main(String[] args) {
		CheckRadio checkboxAndRadiobutton=new CheckRadio();
	    checkboxAndRadiobutton.initialisation();
	   checkboxAndRadiobutton.checkBox();
		checkboxAndRadiobutton.enabled();
		checkboxAndRadiobutton.display();
	   checkboxAndRadiobutton.radioButton();
	}

}