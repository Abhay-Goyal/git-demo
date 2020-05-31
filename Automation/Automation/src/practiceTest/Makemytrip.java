package practiceTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.jna.platform.FileUtils;

public class Makemytrip {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String text = "return document.getElementById(\"toCity\").value";
		String result = (String) js.executeScript(text);
		
		while (!text.equalsIgnoreCase("New York, United States")) {

		}

		driver.close();
	}

}
