package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	   WebDriver driver;


	@Given("^Open the Firefox and launch the application$")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {	
		System.setProperty("webdriver.chrome.driver", "C://driver1//chromedriver.exe");					
	       WebDriver driver= new ChromeDriver();					
	       driver.get("www.demo.guru99.com/v4");	
	       driver.manage().window().maximize();			

        System.out.println("This Step open the Firefox and launch the application.");					
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {
    	driver.findElement(By.name("uid")).sendKeys("username12");							
        driver.findElement(By.name("password")).sendKeys("password12");								
	     					
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {  
        driver.findElement(By.name("btnReset")).click();	
       

        System.out.println("This step click on the Reset button.");					
    }		


}
