package browserinitialisation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	
	public WebDriver driver;
	
	public void upload() {
		
		driver =  new ChromeDriver();
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement file = driver.findElement(By.id("pickfiles"));
		//file.click();
		file.sendKeys("\"C:\\Users\\devika saha\\Downloads\\EXTRA SMALL NOTES .pdf\"");
		
	}
	
	public void robofileupoad() throws AWTException {
		driver =  new ChromeDriver();
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement file = driver.findElement(By.id("pickfiles"));
		file.click();
		StringSelection str_selection = new StringSelection("\"C:\\Users\\devika saha\\Downloads\\EXTRA SMALL NOTES .pdf\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str_selection,null); //cpaste to clipboard
		Robot robot = new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) throws AWTException {
		
		FileUpload fileupload = new FileUpload();
		fileupload.upload();
		fileupload.robofileupoad();
		
		

	}

}
