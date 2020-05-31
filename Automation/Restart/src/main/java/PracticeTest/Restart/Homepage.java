package PracticeTest.Restart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

	WebDriver driver;

	public Homepage(WebDriver driver) {
		driver = this.driver;
	}

	By Login = By.xpath("");

	public WebElement Login() {

		return driver.findElement(Login);

	}

}
