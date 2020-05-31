package consumercare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://courses.rahulshettyacademy.com/sign_in']")
	WebElement Login;

	@FindBy(xpath = "//a[@href='https://courses.rahulshettyacademy.com/courses']")
	WebElement Courses;

	public WebElement Login() {
		return Login;
	}

	public WebElement Courses() {
		return Courses;
	}
}