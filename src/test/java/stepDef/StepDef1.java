package stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class StepDef1 {

	WebDriver driver;

	@Given("User Launch Chrome browser")
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@When("User opens URL {string}")
	public void launchApp(String appURL) {

		driver.get(appURL);

	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String pass) {

		driver.findElement(By.cssSelector("input#Email")).clear();
		driver.findElement(By.cssSelector("input#Email")).sendKeys(email);

		driver.findElement(By.cssSelector("input#Password")).clear();
		;
		driver.findElement(By.cssSelector("input#Password")).sendKeys(pass);
	}

	@When("Click on Login")
	public void click_on_Login() {

		driver.findElement(By.tagName("button")).click();

	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String expTitle) throws Exception {
		Thread.sleep(3000);
		Assert.assertEquals(expTitle, driver.getTitle());

	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() {

		driver.findElement(By.partialLinkText("Logout")).click();

	}

	@Then("close browser")
	public void close_browser() throws Exception {

		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}
