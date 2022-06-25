package Resources;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	
	public WebDriver driver;
		
	public  WebDriver initilizeDriver() throws Exception
	{		
		System.setProperty("webdriver.chrome.driver", "src/main/java/Resources/chromedriver.exe");
		driver = new ChromeDriver();
		
		return driver;
	}
	
	

}
