package cucumberWebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {

	// wait some mili seconds
	public static void tinyWait() {
		try {
			Thread.sleep(550);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Pages mapping
	public static WebElement SignInButton(WebDriver driver) {
		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html//header[@id='header']//nav//a[@title='Log in to your customer account']")));

		return element;
	}

	public static WebElement EmailField(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

		return element;
	}

	public static WebElement PasswordField(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));

		return element;
	}

	public static WebElement SearchField(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='search_query_top']")));

		return element;
	}

	public static WebElement SearchButtonAction(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//form[@id='searchbox']/button[@name='submit_search']")));

		return element;
	}

	public static WebElement AddToCartButton(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@id='center_column']/ul/li[1]/div[@class='product-container']//a[@title='Add to cart']/span[.='Add to cart']")));

		return element;
	}

	public static WebElement MouseOverProduct(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@id='center_column']/ul/li[1]/div[@class='product-container']//div[@class='product-image-container']/a[@title='Printed Summer Dress']/img[@alt='Printed Summer Dress']")));

		return element;
	}

	public static WebElement TotalProductsValue(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html//div[@id='layer_cart']//span[@class='ajax_block_products_total']")));
		return element;
	}

	public static WebElement ProceedToCheckoutButton(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")));

		return element;
	}

	public static WebElement ProceedToCheckoutButtonOnSummary(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@id='center_column']//a[@title='Proceed to checkout']/span")));
		// div[@id='center_column']/form[@action='http://automationpractice.com/index.php?controller=order']//button/span

		return element;
	}

	public static WebElement ProceedToCheckoutButtonOnAddress(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='If you would like to add a comment about your order, please write it in the field below.'])[1]/following::span[1]")));

		return element;
	}

	public static WebElement ProceedToCheckoutButtonOnShipping(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//form[@id='form']//button[@name='processCarrier']/span")));

		return element;
	}

	public static WebElement ProceedToCheckoutButtonOnPayment(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

		return element;
	}

	public static WebElement CreateNewAccountButton(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='SubmitCreate']/span")));

		return element;
	}

	public static WebElement EmailAddressFirstAccessField(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='email_create']")));

		return element;
	}

	// Create new account with all required fields
	public static WebElement TitleMrRadioButton(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[for='id_gender1'] [type]")));

		return element;
	}

	public static WebElement FirstNameField(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='customer_firstname']")));

		return element;
	}

	public static WebElement LastNameField(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='customer_lastname']")));

		return element;
	}

	public static WebElement PasswordFieldCreate(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='passwd']")));

		return element;
	}

	public static WebElement FirstNameAddress(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='firstname']")));

		return element;
	}

	public static WebElement LastNameAddress(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='lastname']")));

		return element;
	}

	public static WebElement AddressField(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html//form[@id='account-creation_form']//input[@name='address1']")));

		return element;
	}

	public static WebElement CityField(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='city']")));

		return element;
	}

	public static WebElement StateDropdown(WebDriver driver) {

		tinyWait();

		WebElement element = driver.findElement(By.xpath("/html//select[@id='id_state']"));

		return element;
	}

	public static WebElement PostalCodeField(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='postcode']")));

		return element;
	}

	public static WebElement CountryDropdown(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//select[@id='id_country']")));

		return element;
	}

	public static WebElement HomePhoneField(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='phone']")));

		return element;
	}

	public static WebElement MobilePhoneField(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='phone_mobile']")));

		return element;
	}

	public static WebElement AddressAliasField(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='alias']")));

		return element;
	}

	public static WebElement DayOfBirthDropdown(WebDriver driver) {

		WebElement element = driver.findElement(By.id("days"));
		return element;
	}

	public static WebElement MonthOfBirthDropdown(WebDriver driver) {

		WebElement element = driver.findElement(By.id("months"));

		return element;
	}

	public static WebElement YearOfBirthDropdown(WebDriver driver) {

		WebElement element = driver.findElement(By.id("years"));

		return element;
	}

	public static WebElement RegisterNewAccount(WebDriver driver) {

		tinyWait();
		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.name("submitAccount")));
		return element;

	}

	public static WebElement AgreeToTermsCheckbox(WebDriver driver) {
		tinyWait();

		WebElement element = driver.findElement(By.id("cgv"));

		return element;
	}

	// Proceed to checkout
//	public static WebElement PaymentUnitPriceCheck(WebDriver driver) {
//
//		tinyWait();
//
//		WebElement element = (new WebDriverWait(driver, 30))
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cart_total .price")));
//
//		return element;
//	}

//	public static WebElement PaymentTotalPriceCheck(WebDriver driver) {
//
//		tinyWait();
//
//		WebElement element = (new WebDriverWait(driver, 30))
//				.until(ExpectedConditions.visibilityOfElementLocated(By.id("total_price")));
//
//		return element;
//	}

	public static WebElement SelectPayByBankWireButton(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html//div[@id='HOOK_PAYMENT']//a[@title='Pay by bank wire']")));

		return element;
	}

	public static WebElement ConfirmOrder(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='cart_navigation']//span")));

		return element;
	}

	public static WebElement ValidateOrderIsCompleted(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html//div[@id='center_column']//strong[@class='dark']")));

		return element;
	}

	public static WebElement ViewShoppingCart(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("/html//header[@id='header']/div[3]/div[@class='container']//a[@title='View my shopping cart']")));

		return element;
	}

	public static WebElement ProductName(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("/html//header[@id='header']/div[3]/div[@class='container']/div[@class='row']/div[3]/div/div//dt[@class='first_item']//div[@class='product-name']/a[@title='Printed Summer Dress']")));

		return element;
	}

	public static WebElement TotalPrice(WebDriver driver) {

		tinyWait();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("total_price")));

		return element;
	}

}
