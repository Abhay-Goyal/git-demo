package PracticeTest.Restart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;

public class ThirdTest {

	@Test(dataProvider="getData")
	public void tableTest(String project) {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));

		List<WebElement> course = table.findElements(By.xpath("//tr //td[2]"));

		for (int i = 0; i < course.size(); i++) {

			String Lesson = course.get(i).getText();

			if (Lesson.contains(project)) {
				System.out.println(Lesson);
				break;

			}
		}

	}
	
	@DataProvider
	public Object[] getData() {
	
		Object[] data= new Object[2];
		
		data[0]="JMETER";
		data[1]="SQL";
				
		return data;
	}
	
		
	}
	

