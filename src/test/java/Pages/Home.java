package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	 WebDriver driver;
	
	
	@FindBy(linkText="REGISTER")
	WebElement registerlink;


	@FindBy(linkText="Flights")
	WebElement flightlink;
	
	
	
	
	//WebElement registerlink=By.linkText("REGISTER");
	//WebElemnt flightlink=By.linkText("Flights");
	//CONSTRUCTOR
	public Home(WebDriver driver)
	{
		this.driver=driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonregisterlink()
	{
		//driver.findElement(registerlink).click();
		registerlink.click();
	}
	
	public void clickonflightlink()
	{
		//driver.findElement(flightlink).click();
		flightlink.click();
		
	}
	
}
