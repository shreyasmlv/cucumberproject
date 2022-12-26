package stepdefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {
	public WebDriver driver;

	@Given("^Intialize the web driver$")
	public void intialize_the_web_driver() throws Throwable {
     driver=new ChromeDriver();
	}

	@When("^user navaigates to \"([^\"]*)\"$")
	public void user_navaigates_to_something(String strArg1) throws Throwable {
		driver.get(strArg1);

	}

	@And("^user enter (.+) and (.+) and clicks on login button$")
	public void user_enter_and_and_clicks_on_login_button(String username, String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='Login']")).click();

	}

	@Then("^user should be able to login sucessfully$")
	public void user_should_be_able_to_login_sucessfully() throws Throwable {

	}

}
