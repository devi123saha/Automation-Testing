package browserinitialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop extends Base {
	
	public void drop1() {
		
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag =driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(drag).click();
		//used if a element needs to be double clicked to drag
		actions.doubleClick(drag).perform();
		//to right cick
		//actions.contextClick(drag).perform();
		WebElement drop = driver.findElement(By.id("mydropzone"));
		actions.dragAndDrop(drag, drop).build().perform();
		
	}

	public static void main(String[] args) {
		
		DragDrop dg =new DragDrop();
		dg.initialisation();
		dg.drop1();
	

	}

}
