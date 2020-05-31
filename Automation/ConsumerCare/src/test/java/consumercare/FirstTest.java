package consumercare;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Driverstart;

public class FirstTest extends Driverstart {
	public static Logger log = LogManager.getLogger(Driverstart.class.getName());

	public WebDriver driver;
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
		log.info("Browser is closed");
	}

	@Test(dataProvider = "getData")
	public void start(String Uname, String pwd) throws IOException {

		driver = getDriver();
		log.info("Driver is initialized");

		driver.get(p.getProperty("url"));
		log.info("Url is accessible");

		HomePage hp = new HomePage(driver);
		hp.Login.click();

		LoginPage lp = new LoginPage(driver);
		lp.email().sendKeys(Uname);
		log.info("username has been entered");
		lp.password().sendKeys(pwd);
		log.info("password has been entered");
		lp.login().click();
		log.info("Clicked on Login button");

	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[2][2];
		data[0][0] = "abc@yopmail.com";
		data[0][1] = "yesman";
		data[1][0] = "def@yopmail.com";
		data[1][1] = "noman";

		return data;
	}

}
