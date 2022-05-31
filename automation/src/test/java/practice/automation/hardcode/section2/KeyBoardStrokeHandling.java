package practice.automation.hardcode.section2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardStrokeHandling {
	
	@Test
	public void KeyboardHandle() {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.get("https://demo.actitime.com/login.do");
//		
//		driver.findElement(By.id("username"))
//					.sendKeys("admin", Keys.TAB,"manager", Keys.ENTER);
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username"))
				.sendKeys("admin", Keys.TAB,"manager", Keys.TAB, Keys.SPACE);
		
		
		
	}

}
