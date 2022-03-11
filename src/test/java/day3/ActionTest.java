package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://demowebshop.tricentis.com/build-your-cheap-own-computer");
		driver.findElement(By.name("q")).sendKeys("computer");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.name("q")))
		.pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build().perform();
		driver.close();
		

		// fetch html source and browser navigation commands
		
		/*driver.get("http://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		System.out.println("title is:"+title);
		if(title.equals("Demo Web Shop"))
		{
			System.out.println("title is correct");
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.close();*/

	}

}
