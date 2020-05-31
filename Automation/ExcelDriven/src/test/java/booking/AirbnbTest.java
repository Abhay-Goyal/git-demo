package booking;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentCardsReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class AirbnbTest extends DriverInitialization {

	@Test(groups= {"Smoke"})
	public void access() throws Exception {

		driver = driverInitialization();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.airbnb.co.in/");

		// Login

		driver.findElement(By.xpath("//a[@href='/login']")).click();
	}

	// SignUp

	@Test(dataProvider="getData",enabled=false)
	public void signup(String Country,String Number) {
		driver = driverInitialization();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.airbnb.co.in/");
		driver.findElement(By.xpath("//a[@href='/signup_login']")).click();
		Select s = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		s.selectByVisibleText(Country);
		driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys(Number);

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Denmark (+45)";
		data[0][1] = "9556565515";
		data[1][0] = "India (+91)";
		data[1][1] = "8699446624";

		return data;
	}
}
