package PracticeTest.Restart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import PracticeTest.Restart.SecondTest;
import PracticeTest.Restart.*;

public class FirstTest extends Driverintitation {

	@Test
	public void test1() throws IOException {

		driver = driverStart();

		FirstTest ft = new FirstTest();
		String[] itemsadded = { "Cashews", "Almonds", "Pista" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		ft.greenMart(driver, itemsadded);

	}

	public void greenMart(WebDriver driver, String[] itemsadded) {

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");

			String formattedname = name[0].trim();

			List itemsneeded = Arrays.asList(itemsadded);

			if (itemsneeded.contains(formattedname)) {

				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsadded.length) {
					break;
				}

			}

		}

	}

}
