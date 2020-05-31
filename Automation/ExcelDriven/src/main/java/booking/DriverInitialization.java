package booking;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverInitialization {

	public WebDriver driver;

	public static void main(String[] args) {

	}

	public WebDriver driverInitialization() {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.acceptInsecureCerts();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(dc);

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver(c);
		return driver;
		
		
	}

}
