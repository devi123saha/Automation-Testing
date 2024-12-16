package browserinitialisation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	
	public void initialisation() {
		
		//opening different browsers
		
		driver = new ChromeDriver();
		//driver = new EdgeDriver();
		//driver = new FirefoxDriver();
		
		
		//how to launch a url
		driver.get("https://selenium.qabible.in/index.php");
		//to maximise window
		driver.manage().window().maximize();
		
		
	}
	
	public void closequit() {
		
		//to close the browser
		driver.close();
		//driver.quit();
		
	}

	
	public static void main(String[] args) {
		
		Base base = new Base();
		base.initialisation();
		base.closequit();
		

	}

}
