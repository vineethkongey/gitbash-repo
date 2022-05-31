package practice.automation.hardcode.section2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlternateCheckBox {
	
	@Test
	public void checkBox() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		/*implicitly wait*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/**webdriver menthod manage writtens options in options
		 * we have method called window which returns window
		 * in window we have method called maximize*/
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[text()='Brand']/parent::div[@class='_213eRC _2ssEMF']/ancestor::section[@class='_167Mu3 _2hbLCH']/descendant::input[@type='checkbox']"));
		
//		for(WebElement wb:list) {
//			JavascriptExecutor jse= (JavascriptExecutor)driver;
//			jse.executeScript("arguments[0].click();", wb);
//			//wb.click();
				int count =0;
		for(WebElement li:list) {
			if(count%2==0) {
				JavascriptExecutor jse= (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", li);
				
			}
			count++;
			
		}
	
		
		
		
		
		
	}

}
