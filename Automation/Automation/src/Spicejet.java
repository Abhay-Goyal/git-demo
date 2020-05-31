import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.platform.FileUtils;
import com.sun.jna.platform.win32.Wdm.KEY_INFORMATION_CLASS;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhay\\Desktop\\Automation Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();

		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		it.next();
		// Drop downs--->>with select tagname static dropdown and option have options
		// tag

		Select s = new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']")));
		s.selectByValue("USD");

		// updated x path for passengers--->

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		/*
		 * int i=1; while(i<3) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */

		for (int i = 1; i < 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='AIP'])[2]")).click();
		// picking the current date from calender
		// driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today")).click();

		// to check any element is enabled or disabled
		// System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		// System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			;
		{
			System.out.println("its enabled");
		}

	}

}
