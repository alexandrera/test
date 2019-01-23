package cucumberWebAutomation;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Stepdefs {
	public WebDriver driver;

	@Before
	public void startDriver() {
		System.setProperty("webdriver.chrome.driver", Helper.pathProperty);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	// Test Execution
	@Given("^usuario inicia uma compra$")
	public void usuario_inicia_uma_compra() {
		driver.get(Helper.url);
		PageObject.SearchField(driver).sendKeys("Yellow");
		PageObject.SearchButtonAction(driver).click();
	}

	@And("^adiciona um produto ao carrinho e prossegue$")
	public void adicionar_um_produto_ao_carrinho_e_prossegue() {

		// Mouse over element
		Actions action = new Actions(driver);
		WebElement we = PageObject.MouseOverProduct(driver);
		action.moveToElement(we).build().perform();

		PageObject.AddToCartButton(driver).click();
		PageObject.ProceedToCheckoutButton(driver).click();
		// PageObject.ViewShoppingCart(driver).click();
		Actions action2 = new Actions(driver);
		WebElement we2 = PageObject.ViewShoppingCart(driver);
		action2.moveToElement(we2).build().perform();
		PageObject.ProductName(driver).getText().equals("Printed Summer Dress");

	}

	@When("^verifica endereco, termos de servico e valor total da compra$")
	public void verifica_os_dados_da_compra() {

		// Summary
		PageObject.ProceedToCheckoutButtonOnSummary(driver).click();
		PageObject.EmailAddressFirstAccessField(driver).sendKeys(Helper.userEmail);
	}

	@And("^cria um novo usuario$")
	public void cria_um_novo_usuario() {
		PageObject.CreateNewAccountButton(driver).click();
		PageObject.TitleMrRadioButton(driver).click();
		PageObject.FirstNameField(driver).sendKeys("John");
		PageObject.LastNameField(driver).sendKeys("Smith");
		PageObject.PasswordField(driver).sendKeys(Helper.userPassword);

		int countDay = 0; // Set Day 21
		while (countDay < 21) {
			PageObject.DayOfBirthDropdown(driver).sendKeys(Keys.DOWN);
			countDay++;
		}

		int countMonth = 0; // Set month 09
		while (countMonth < 9) {
			PageObject.MonthOfBirthDropdown(driver).sendKeys(Keys.DOWN);
			countMonth++;
		}

		int countYear = 0; // Set Year 1985
		while (countYear < 35) {
			PageObject.YearOfBirthDropdown(driver).sendKeys(Keys.DOWN);
			countYear++;
		}

		// Your Address
		PageObject.FirstNameAddress(driver).clear();
		PageObject.FirstNameAddress(driver).sendKeys("John");
		PageObject.LastNameAddress(driver).clear();
		PageObject.LastNameAddress(driver).sendKeys("Smith");
		PageObject.AddressField(driver).sendKeys(Helper.defaultAddress);
		PageObject.CityField(driver).sendKeys("Vernon Hills");
		PageObject.StateDropdown(driver).click();
		PageObject.StateDropdown(driver).sendKeys(Keys.DOWN);
		PageObject.PostalCodeField(driver).sendKeys(Helper.defaultPostalCode);
		PageObject.HomePhoneField(driver).sendKeys("551199884355");
		PageObject.MobilePhoneField(driver).sendKeys("551132143242");
		PageObject.AddressAliasField(driver).clear();
		PageObject.AddressAliasField(driver).sendKeys("My Address Alias");
		PageObject.RegisterNewAccount(driver).click();

	}

	@Then("seleciona o pagamento e finaliza com sucesso$")
	public void finaliza_com_sucesso() {

		PageObject.ProceedToCheckoutButtonOnAddress(driver).click();

		// Breadcrumb on Shipping
		PageObject.AgreeToTermsCheckbox(driver).click();
		PageObject.ProceedToCheckoutButtonOnShipping(driver).click();
		assertEquals("$32.22", PageObject.TotalPrice(driver).getText());
		PageObject.SelectPayByBankWireButton(driver).click();
		PageObject.ConfirmOrder(driver).click();
		PageObject.ValidateOrderIsCompleted(driver).isDisplayed();
	}

	@After
	public void closeDriver() {
		driver.close();
	}

}