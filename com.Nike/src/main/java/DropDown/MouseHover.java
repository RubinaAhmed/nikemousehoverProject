package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	public WebDriver driver;
	
	@BeforeTest 
	public void openBrowser () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.nike.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void mousehover () throws InterruptedException {
		WebElement kids = driver.findElement(By.xpath("//*[@class='pre-desktop-menu-link headline-5 prl3-lg pt4-sm d-sm-b no-outline']"));
		Actions act = new Actions(driver);
		act.moveToElement(kids).build().perform();
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
