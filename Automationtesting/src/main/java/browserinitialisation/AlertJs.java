package browserinitialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertJs extends Base {
	
	public void alert() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		button.click();
		driver.switchTo().alert().accept();
		WebElement button2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		button2.click();
		driver.switchTo().alert().dismiss();
		WebElement button3 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		button3.click();
		driver.switchTo().alert().sendKeys("Devika");
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		AlertJs alerts = new AlertJs();
		alerts.initialisation();
		alerts.alert();
		

	}

}
