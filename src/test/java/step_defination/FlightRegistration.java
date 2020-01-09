package step_defination;


import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import Pages.Home;
import Pages.Register;

public class FlightRegistration {

	 String url = "http://newtours.demoaut.com/";
	public Home hm;
	public Register rp;
	public WebDriver driver;
		  
	    public FlightRegistration()
		    {
		      driver=Hooks.driver;
		       
		    }

		 
	 @Given("^I Open Mercury Flight Application$")
		public void navigatetotheflightapplication() throws InterruptedException, Throwable
		{
	   	driver.get(url);
			
			}
		 @When("^Click on the Register link in the Home page$")
		 public void clickonregisterlink() throws InterruptedException
		 {

			 System.out.println( "clickregisterlink");
			
			  hm=new Home(driver);
			 hm.clickonregisterlink();
			Thread.sleep(2000);
		 
		 }
		 @Then("^Register page should displayed$")
		 public void verifyregisterpagedispay()
		 {
			 String ExpectedValue = "Register: Mercury Tours";
			String ActualValue= driver.getTitle();
			System.out.println( "expected"+ExpectedValue);
			System.out.println( "actual"+ActualValue);
			Assert.assertEquals(ExpectedValue, ActualValue);
		 }
		 
		 @And("^Close the browser$")
		 public void closethebrowser()
		 {
			 driver.close();
			 driver.quit();
		 }
		 @And("^Enter \"(.*?)\" ,\"(.*?)\" and \"(.*?)\"$")
		 public void entervalues(String value1,String value2,String value3) throws InterruptedException
		 {

			//	driver.findElement(By.name("email")).sendKeys(value1);
		 	 //   driver.findElement(By.name("password")).sendKeys(value2);
		 	 //   driver.findElement(By.name("confirmPassword")).sendKeys(value3);
			 
			  rp=new Register(driver);
		 	   rp.createuserwithonly3fields(value1, value2, value3);
		 }
		
		 
		 @Then("^I verify the \"(.*?)\" created sucessfully$")
		 public void verifyusercreation(String value1 )
		 {
			// String  sActualValue=driver.findElement(By.tagName("Body")).getText();
			 rp=new Register(driver);
			 String  sActualValue=rp.getbodytext();
			 	System.out.println( "check the actual value:"+sActualValue);
			 	   String expected = "Your user name is "+value1; 
			 	   Assert.assertTrue(sActualValue.contains(expected)); 
			 	
		 }
}
