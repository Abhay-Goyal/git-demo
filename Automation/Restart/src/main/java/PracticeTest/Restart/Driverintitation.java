package PracticeTest.Restart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driverintitation {

	public WebDriver driver;

	public WebDriver driverStart() throws IOException {
		Properties p = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\abhay\\Desktop\\Automation Setup\\Automation\\Restart\\src\\main\\java\\PracticeTest\\Restart\\data.properties");

		p.load(fis);

		if (p.getProperty("browser").equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (p.getProperty("browser").equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "E://chromedriver.exe");
			driver = new FirefoxDriver();

		}

		else {
			System.setProperty("webdriver.ie.driver", "E://chromedriver.exe");
			driver = new InternetExplorerDriver();
		}

		return driver;
	}

}