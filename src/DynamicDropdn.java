import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdn 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.className("css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu")).click();
		driver.findElement(By.id(""));
		
	}
}
