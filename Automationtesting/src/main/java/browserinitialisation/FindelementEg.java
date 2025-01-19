package browserinitialisation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindelementEg extends Base {
	
	public void element() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> find = driver.findElements(By.xpath("//input[@type='text']"));
	    for(WebElement element:find)
		element.sendKeys("hello");
	}
	
	
	
	public void check() {
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> find1 = driver.findElements(By.xpath("//input[@class ='check-box-list']"));
		for(WebElement check:find1)
		check.click();
		
		
	}

	public static void main(String[] args) {
		
		FindelementEg eg = new FindelementEg();
		eg.initialisation();
		eg.element();
		eg.check();
		
		
		

	}

}
