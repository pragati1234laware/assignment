package Automation.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElements {
	
	
	
public WebDriver driver;
	
	public WebElements(WebDriver driver)
	{
		this.driver=driver;
	}

	By zero = By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]");
	By one = By.xpath("//tbody/tr[2]/td[2]/div[1]/div[3]/span[1]");
	By two = By.xpath("//span[contains(text(),'2')]");
	By three = By.xpath("//span[contains(text(),'3')]");
	By four = By.xpath("//span[contains(text(),'4')]");
	By five =By.xpath("//span[contains(text(),'5')]");
	By six =  By.xpath("//span[contains(text(),'6')]");
	By seven =By.xpath("//span[contains(text(),'7')]");
	By eight  = By.xpath("//span[contains(text(),'8')]");
	By nine = By.xpath("//span[contains(text(),'9')]");
	
	By divide = By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]");
	By multiply = By.xpath("//span[contains(text(),'×')]");
	By add = By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]");
	By sub = By.xpath("//span[contains(text(),'–')]");
	By equal = By.xpath("//span[contains(text(),'=')]");
	By box = By.xpath("//div[@id='sciOutPut']");
	
	By clear = By.xpath("//span[contains(text(),'AC')]");
	
	
	public WebElement zero()
	{
		return driver.findElement(zero);
	}

	public WebElement one()
	{
		return driver.findElement(one);
	}

	public WebElement two()
	{
		return driver.findElement(two);
	}

	public WebElement three()
	{
		return driver.findElement(three);
	}

	public WebElement four()
	{
		return driver.findElement(four);
	}

	public WebElement five()
	{
		return driver.findElement(five);
	}

	public WebElement six()
	{
		return driver.findElement(six);
	}

	public WebElement seven()
	{
		return driver.findElement(seven);
	}

	public WebElement eight()
	{
		return driver.findElement(eight);
	}

	public WebElement nine()
	{
		return driver.findElement(nine);
	}
	public WebElement add()
	{
		return driver.findElement(add);
	}
	public WebElement sub()
	{
		return driver.findElement(sub);
	}
	public WebElement multiply()
	{
		return driver.findElement(multiply);
	}
	public WebElement divide()
	{
		return driver.findElement(divide);
	}
	public WebElement equal()
	{
		return driver.findElement(equal);
	}
	public WebElement box()
	{
		return driver.findElement(box);
	}
	public WebElement clear()
	{
		return driver.findElement(clear);
	}
	

}
