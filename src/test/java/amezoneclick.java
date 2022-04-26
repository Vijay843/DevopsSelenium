

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amezoneclick {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void Amezoneclick1(){
		
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
	}
		
	@AfterTest	
	public void Amezoneclick2() {
			
			driver.close();
			
	}
			
	
	@Test
	public void amezoneclick3() {
				
		driver.findElement(By.xpath("//input[@class=\"a-button-input\"]")).click();
		
			
			
			
		}
		
		
		
		
		
	}
	
	


