package booking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	


	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By Flights = By.xpath("//a[@id='booking_engine_flights']");
	By Hotels = By.xpath("//a[@id='booking_engine_hotels']");

	public WebElement Flights() {
		return driver.findElement(Flights);
	}
	
	
	public WebElement Hotels() {
		return driver.findElement(Hotels);
		
		
	}
}
