package browserinitialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgCheckRadDrop{
	
	public WebDriver driver;
	
	public void checkraddrop() {
		
		driver = new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();		
		WebElement check = driver.findElement(By.xpath("//input[@value='option-1']"));
		check.click();
		System.out.println(check.isSelected());
		
		
		
		//input[@value='green']
		
	}
	
	public void radio() {
		
		
	}

	public static void main(String[] args) {
		
		AssgCheckRadDrop box= new AssgCheckRadDrop();
		box.checkraddrop();

	}

}
