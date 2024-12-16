package browserinitialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assg  extends Base{
	
	
	public void value(){
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgfield = driver.findElement(By.id("value-a"));
		msgfield.sendKeys("12");
		WebElement msgfield2 = driver.findElement(By.id("value-b"));
		msgfield2.sendKeys("14");
		WebElement button = driver.findElement(By.id("button-two"));
		button.click();
		
	}


	public static void main(String[] args) {
		
		Assg form = new Assg();
		form.initialisation();
		form.value();
		
	}

}
