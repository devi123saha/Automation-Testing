package browserinitialisation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		   JavascriptExecutor js = (JavascriptExecutor) driver;  
			((org.openqa.selenium.JavascriptExecutor) js).executeScript("window.scrollBy(0,550)","");
			//js.executeScript("window.scrollBy(0,-100)", "");
			//WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
			//js.executeScript("arguments[0].click();",searchbutton);
			//searchbutton.click();
	}

}

