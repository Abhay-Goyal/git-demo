package booking;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MakemytripTest extends DriverInitialization {

	@Test

	public void MMT() {
		WebDriver driver = driverInitialization();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='specialFare']/li[2]")));
		driver.findElement(By.xpath("//ul[@class='specialFare']/li[2]")).click();

		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mum");

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[text()='More']"))).build().perform();

		String attribute = driver.findElement(By.xpath("//ul[@class='specialFare']/li[2]")).getAttribute("class");
		if (attribute.contains("active")) {
			System.out.println("Student Fare is selected");
		}

		driver.close();

	}
}
