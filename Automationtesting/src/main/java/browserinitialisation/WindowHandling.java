package browserinitialisation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public WebDriver driver;
	
	public void window() {
		
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://webdriveruniversity.com/");	
		WebElement element = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		element.click();
		WebElement element1 = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		element1.click();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allwindow =  driver.getWindowHandles();
		String title="";
		for(String allwindows:allwindow) {
			
			if(!allwindows.equals(parent)) {
				
				System.out.println(allwindows);
				driver.switchTo().window(allwindows);
				title=driver.getTitle();
				System.out.println(driver.getTitle());
				
			}
			
			if(title.equals("WebDriver | Login Portal")) {
				
				WebElement user = driver.findElement(By.id("text"));
				user.sendKeys("Devika");
				WebElement pass = driver.findElement(By.id("password"));
				user.sendKeys("123456");
				
			}
			
			if(title.equals("WebDriver | Contact Us")) {
				
				WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
				firstname.sendKeys("Devi123saha");
				
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		WindowHandling windhand = new WindowHandling();
		windhand.window();

	}

}
