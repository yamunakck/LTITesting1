package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadDataFromExcel {
static WebDriver driver;

@Test
public void LoginTC1() throws IOException, InterruptedException {
	FileInputStream fis =new FileInputStream (new File("E:\\data\\LoginData.xlsx"));
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheet("Sheet1");
	System.out.println("no of rows is:" +sh.getPhysicalNumberOfRows());
	for(int i=1; i<=sh.getPhysicalNumberOfRows(); i++)
	{
		String username = sh.getRow(i).getCell(0).getStringCellValue();
		String psd = sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println(username+"----"+psd);
		driver.findElement(By.name("userName")).sendKeys("username");
		  driver.findElement(By.name("password")).sendKeys("psd");
		  driver.findElement(By.name("submit")).click();
		  if(driver.getTitle().contains("Login")) {
			  System.out.println("valid credentials");
			  driver.findElement(By.linkText("SIGN-OFF")).click();
			  
		  }
		  else
		  {
			  System.out.println("Invalid Credentials");
		  }
	}
}
	
	 @BeforeClass
	  public static void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			//open application
			driver.get("https://demo.guru99.com/test/newtours/");
	  }
	  
	  @AfterClass
	  public static void afterClass() {
		  driver.close();
	  }
}
