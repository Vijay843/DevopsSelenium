package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	
	WebDriver driver;

    @BeforeTest
    public void launchApp() {

        
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        
    }

    @AfterTest
    public void closeApp() throws Exception {
        Thread.sleep(4000); 
        driver.close();

    }
    
}

