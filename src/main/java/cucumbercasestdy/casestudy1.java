package cucumbercasestdy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy1 {
	WebDriver driver;
	
	@When("user opens chrome browser and opens application")
	public void user_opens_chrome_browser_and_opens_application() {
    System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver.exe");
    driver= new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/");
	}
	
	@When("user clicks on signup button")
	public void user_clicks_on_signup_button() {
    driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	}

	
	@When("user enters the user name as {string} in user name field")
	public void user_enters_the_user_name_as_in_user_name_field(String string) {
	driver.findElement(By.name("userName")).sendKeys("deepika"); 
	}

	@Then("firstname as{string} and last name as {string} in user name field")
	public void firstname_as_and_last_name_as_in_user_name_field(String string, String string2) {
	driver.findElement(By.name("firstName")).sendKeys("deepika");
	driver.findElement(By.name("lastName")).sendKeys("deva");
	}

	@Then("password as {string}")
	public void password_as(String string) {
    driver.findElement(By.name("password")).sendKeys("123456");
    }

	@Then("confirm password as {string}")
	public void confirm_password_as(String string) {
	driver.findElement(By.name("confirmPassword")).sendKeys("123456");
    }

	@Then("selects gender as male")
	public void selects_gender_as_male() {
    Actions act1=new Actions(driver);
    act1.moveToElement(driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]"))).click().build().perform();
  
 
	}

	@Then("types the email address as {string} in email field")
	public void types_the_email_address_as_in_email_field(String string) {
    driver.findElement(By.name("emailAddress")).sendKeys("qwertyuiop@gmail.com");
	}

	@Then("enters the mobile number as {string}")
	public void enters_the_mobile_number_as(String string) {
    driver.findElement(By.name("mobileNumber")).sendKeys("1234567890");
	}

	@Then("DOB as {string}")
	public void dob_as(String string) {
    driver.findElement(By.name("dob")).sendKeys("08/01/2019");
	}

	@Then("type address as {string}")
	public void type_address_as(String string) {
	driver.findElement(By.name("address")).sendKeys("address 123");
	}

	@Then("user selects the security question as What is your Nick Name?")
	public void user_selects_the_security_question_as_What_is_your_Nick_Name() {
	Select nickName = new Select(driver.findElement(By.name("securityQuestion")));
    nickName.selectByVisibleText("What is your Nick Name?");
    
    }

	@Then("enters the answer as {string}")
	public void enters_the_answer_as(String string) {
	driver.findElement(By.name("answer")).sendKeys("DEEPI");
	}

	@Then("user clicks Register")
	public void user_clicks_Register() {
    driver.findElement(By.name("Submit")).click();
	}

	



}
