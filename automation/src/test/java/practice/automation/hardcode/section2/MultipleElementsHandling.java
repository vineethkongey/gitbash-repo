package practice.automation.hardcode.section2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElementsHandling {
	@Test
	public void ElementsCapture() {
		
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
		
		/**
		 * explicit wait for particular condition to be satisfy
		 */
		List<WebElement> list = driver.findElements(By.xpath("/a"));
		int count=0;
		for(WebElement wb:list) {
			System.out.println(wb.getText());
			count++;
		}
		System.out.println("total "+count);
		driver.close();
	}

}
