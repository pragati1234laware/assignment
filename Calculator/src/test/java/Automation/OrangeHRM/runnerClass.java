package Automation.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class runnerClass extends BaseClass{

	JavascriptExecutor js;
	Select userRole;
	Select status;
	
	@Test(priority = 1)
	void login() throws Exception
	{
		driver = initilizeDriver();
		
		driver.get("https://www.calculator.net/");
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElements obj = new WebElements(driver);
		obj.four().click(); obj.two().click(); obj.three().click();
		obj.multiply().click();
		obj.five().click();obj.two().click();obj.five().click();
		obj.equal().click();
		System.out.println(obj.box().getText());
		
		obj.four().click();obj.zero().click();obj.zero().click();obj.zero().click();
		obj.divide().click();
		obj.two().click();obj.zero().click();obj.zero().click();
		obj.equal().click();
		System.out.println(obj.box().getText());
		obj.clear().click();
		
		obj.sub().click();
		obj.two().click();obj.three().click();obj.four().click();
		obj.two().click();obj.three().click();obj.four().click();
		obj.add().click();
		obj.three().click();obj.four().click();obj.five().click();
		obj.three().click();obj.four().click();obj.five().click();
		obj.equal().click();
		System.out.println(obj.box().getText());
		obj.clear().click();
		
		obj.two().click();obj.three().click();obj.four().click();
		obj.eight().click();obj.two().click();obj.three().click();
		obj.sub().click();
		obj.sub().click();obj.two().click();obj.three().click();
		obj.zero().click();obj.nine().click();obj.four().click();
		obj.eight().click();obj.two().click();obj.three().click();
		obj.equal().click();
		System.out.println(obj.box().getText());
		
		
		
		
		
		
		
	}
		
}
