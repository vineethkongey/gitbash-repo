package practice.automation.hardcode.section2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionHandling {
	
	@Test
	public void Suggestions() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		//WebElement ele = driver.findElement(By.xpath("//button[text()='No thanks']"));
		//Actions act = new Actions(driver);
		//act.moveToElement(ele).click().perform();
		driver.findElement(By.name("q")).sendKeys("java");
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until
		(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='sbct']//span[starts-with(text(),'java')]")));
		
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']//span[starts-with(text(),'java')]"));
		
		for(WebElement wb: list)
		{
			String text=wb.getText();
			System.out.println(text);
			
			if(text.equals("javatpoint"))
			{
				wb.click();
				break;
			}
		}
		
		////li[@class='sbct']//b[text()='tpoint']/parent::span[text()='java']
	}

}
