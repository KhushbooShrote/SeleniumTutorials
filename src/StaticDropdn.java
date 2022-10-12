import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class StaticDropdn 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		// How to handle static Dropdown--tag name is select -->static
        WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 
		Select dropdown=new Select(staticDropdown);	
		dropdown.selectByVisibleText("INR");
		
		
	}
}
