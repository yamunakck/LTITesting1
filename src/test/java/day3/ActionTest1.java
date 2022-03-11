package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	/*	driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("samsung");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.name("field-keywords")))
		.pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build().perform();
		driver.close();  */
		
		driver.get("https://jqueryui.com/droppable/");
	//	Actions act = new Actions(driver);
	//	act.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable")))
		//		.build().perform();
		
		
		driver.findElement(By.linkText("Droppable"));
		//for mouse and keyboard actions
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions act=new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("draggable")),
		driver.findElement(By.id("droppable"))).build().perform();
		driver.close();

	


		

	}

}
