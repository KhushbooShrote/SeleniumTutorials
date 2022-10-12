import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class Spicejet 
{
	public static void main(String[] args) throws InterruptedException
	{
		String text="Rahul";
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(o);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		//System.out.println(driver.switchTo().alert().getText());
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
	}
}