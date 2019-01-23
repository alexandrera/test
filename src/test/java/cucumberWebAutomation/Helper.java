package cucumberWebAutomation;

import java.util.Date;

public class Helper {

	public static int timestamp1 = (int) ((new Date().getTime() / 1000) - 2000);
	public static final String url = "http://www.automationpractice.com";
	public static final String pathProperty = "C:/drivers/chromedriver.exe";
	public static final String userEmail = "userfortest" + timestamp1 + "@nonexistingmailprovider.com";
	public static final String userPassword = "loremipsumdolor";
	public static final String defaultAddress = "Nice Avenue, 10955, Umbrella Corporation, third floor";
	public static final String defaultPostalCode = "10955";

}
