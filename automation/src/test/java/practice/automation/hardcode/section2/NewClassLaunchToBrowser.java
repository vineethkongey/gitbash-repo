package practice.automation.hardcode.section2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewClassLaunchToBrowser {
	
	public static void main(String[] args) {
		
		BrowserLaunch bl=new BrowserLaunch();
		
		bl.launch(new ChromeDriver());
		
		bl.launch(new EdgeDriver());
	}

}
