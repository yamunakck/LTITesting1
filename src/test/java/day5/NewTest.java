package day5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void Testcase1() {
	  System.out.println("welcome");
  }
  
  @Test
  public void Testcase2() {
	  System.out.println("guys");
  }
  @BeforeMethod//equivalent to @Before in Junits
  public void beforeMethod() {
	  System.out.println("hi");
  }

  @AfterMethod//equivalent to @After in Junits
  public void afterMethod() {
	  System.out.println("bye");
  }

  @BeforeClass//execute once before the class gets loaded
  public void beforeClass() {
	  System.out.println("hello");
  }

  @AfterClass//executes once after all the class test gets executed
  public void afterClass() {
	  System.out.println("cu");
  }

  @BeforeTest//execute once before @BeforeClass
  public void beforeTest() {
	  System.out.println("hey");
  }

  @AfterTest//execute once after@AfterClass executed
  public void afterTest() {
	  System.out.println("tata");
  }  

}
