package StepDefinitions;

import java.time.Duration;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {

	WebDriver driver;
	Select select;
	WebDriverWait wait;

	@Given("^user is present on Login Page$")
	public void user_present_on_Login_page() {
		System.setProperty("chromedriver", "/Users/Mohammad/Desktop/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("^title of the page is Account Login$")
	public void title_of_the_page_is_Account_Login() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		String title = driver.getTitle();
		wait.until(ExpectedConditions.titleContains(title));
	}

	// regular expression:
	// \"([^\"]*)\"
	// or
	// \"(.*)\
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);

	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	}

	@Then("^user is on Account Page$")
	public void user_is_on_Account_Page() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		String title = driver.getTitle();
		wait.until(ExpectedConditions.titleContains(title));
	}

	@Then("^user clicks on address book link$")
	public void user_clicks_on_address_book_link() {
		driver.findElement(By.linkText("Address Book")).click();
	}

	@Then("^user is present on address book page$")
	public void user_is_present_on_address_book_page() {
		String addTitle = driver.getTitle();
		Assert.assertEquals("Address Book", addTitle);
	}

	@Then("^user double clicks on new address button$")
	public void user_double_clicks_on_new_address_button() {
		driver.findElement(By.linkText("New Address")).click();
	}

	@Then("^user enters \"([^\"]*)\" , \"([^\"]*)\" ,\"([^\"]*)\", \"([^\"]*)\", and \"([^\"]*)\"$")
	public void user_enters_and(String name, String lastname, String address, String city, String postalCode) {
		driver.findElement(By.id("input-firstname")).sendKeys(name);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-address-1")).sendKeys(address);
		driver.findElement(By.id("input-city")).sendKeys(city);
		driver.findElement(By.id("input-postcode")).sendKeys(postalCode);

	}

	@Then("^user selects \"([^\"]*)\" from dropdown list$")
	public void user_selects_country_from_dropdown_list(String country) throws InterruptedException {
//		WebElement option = driver.findElement(By.id("input-country"));
//		select = new Select(option);
//		select.selectByVisibleText(country);
		List<WebElement> list=driver.findElements(By.cssSelector("select#input-country option"));
		for(int i =0;i<list.size();i++) {
			String text=list.get(i).getText();
			if(text.equals(country)) {
				list.get(i).click();
				Thread.sleep(5000);
				break;
			}
		
		}
	}

	@Then("^he chooses \"([^\"]*)\" from the list$")
	public void he_chooses_zone_from_the_list(String state) {
		List<WebElement> list=driver.findElements(By.xpath("//select[@id='input-zone']/option"));
		for(int i =0;i<list.size();i++) {
			String text=list.get(i).getText();
			if(text.equals(state)) {
				list.get(i).click();
				break;
			}
		}
	}

	@Then("^user clicks on continue and check if new address is created$")
	public void user_clicks_on_continue_and_check_if_new_address_is_created() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(".fa-check-circle")).isDisplayed());
	}

	@And("^close the browser$")
	public void close_the_browser() {
//		driver.close();
	}

//	@Given("^user is already on Account Page$")
//	public void user_is_already_on_Account_Page() {
////		user_is_on_Account_Page();
//	}
//	@When("^title of the page is My Account$")
//	public void title_of_the_page_is_My_Account() {
////		String title1 = driver.getTitle();
////		System.out.println(title1);
////		Assert.assertEquals("My Account", title1);
//	}
//	@Then("^user search for an item$")
//	public void user_search_for_an_item() {
////		driver.findElement(By.xpath("//div[@id='search']/input[@name='search']")).sendKeys("macbook");;
//	}
//	@Then("^user clicks on search button$")
//	public void user_clicks_on_search_button() {
////		driver.findElement(By.xpath("//div[@id='search']//span[@class='input-group-btn']")).click();;
//
//	}
//	@Then("^user is on ProductInfoPage$")
//	public void user_is_on_ProductInfoPage() {
////		Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Search')]")).isDisplayed());
//	}

}
