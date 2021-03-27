//package StepDefinitions;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class AffiliateStepDefinition {
//
//	WebDriver driver;
//	WebDriverWait wait;
//	@Given("^user is present on Login Page$")
//	public void user_present_on_Login_page() {
//		System.setProperty("chromedriver", "/Users/Mohammad/Desktop/chromedriver");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://demo.opencart.com/index.php?route=account/login");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	}
//	@When("^title of the page is Account Login$")
//	public void title_of_the_page_is_Account_Login() {
//		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		String title = driver.getTitle();
//		wait.until(ExpectedConditions.titleContains(title));
//	}
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) {
//		List<List<String>> data=credentials.raw();
//		driver.findElement(By.id("input-email")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.id("input-password")).sendKeys(data.get(0).get(1));	
//
//	}
//
//	@Then("^user click on login button$")
//	public void user_click_on_login_button() {
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
//	}
//
//	@Then("^user is on Account Page$")
//	public void user_is_on_Account_Page() {
//		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		String title = driver.getTitle();
//		wait.until(ExpectedConditions.titleContains(title));
//	}
//	@Then("^user clicks on Affiliate account link$")
//	public void user_clicks_on_Affiliate_account_link()  {
//	    driver.findElement(By.xpath("(//a)[63]")).click();
//	}
//
//	@Then("^user fills out affilate details$")
//	public void user_fills_out_affilate_details(DataTable details)  {
//	  List<List<String>> data=details.raw();
//	  driver.findElement(By.id("input-company")).clear();
//	  driver.findElement(By.id("input-website")).clear();
//	  driver.findElement(By.id("input-tax")).clear();
//	  driver.findElement(By.id("input-cheque")).clear();
//	  driver.findElement(By.id("input-company")).sendKeys(data.get(0).get(0));
//	  driver.findElement(By.id("input-website")).sendKeys(data.get(0).get(1));
//	  driver.findElement(By.id("input-tax")).sendKeys(data.get(0).get(2));
//	  driver.findElement(By.id("input-cheque")).sendKeys(data.get(0).get(3));
//
//	}
//
//	@Then("^agreement option is clicked and continue is clicked$")
//	public void agreement_option_is_clicked_and_continue_is_clicked()  {
//		
//		if(driver.findElement(By.linkText("About Us")).isDisplayed()==false) {
//		    driver.findElement(By.xpath("(//div[@class='pull-right']/input)[1]")).click();
//		    driver.findElement(By.className("btn-primary")).click();
//
//		}else {
//	    driver.findElement(By.className("btn-primary")).click();
//		}
//	}
//
//	@Then("^success message should be displayed$")
//	public void success_message_should_be_displayed()  {
//		Assert.assertTrue(driver.findElement(By.cssSelector(".fa-check-circle")).isDisplayed());
//
//	}
//	@And("^close the browser$")
//	public void close_the_browser() {
////		driver.close();
//	}
//
//}
