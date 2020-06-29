package testmaven.testmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;

@Test
public class AppTest {
WebDriver driver;


@Test
public void test()
{
	//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize(); 
	System.out.println(driver.getTitle());
	driver.close();
//	driver.findElement(By.className("image-image undefined image-hand")).click();
//	driver.findElement(By.className("desktop-linkButton")).click();
 //   driver.findElement(By.className("desktop-input")).sendKeys("Jack"); 
//	driver.findElement(By.className("seerch-icon")).click(); 
//	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS); 
}



}
