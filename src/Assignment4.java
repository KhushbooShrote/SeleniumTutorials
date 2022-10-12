import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Assignment4 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']//following-sibling::span")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement user=driver.findElement(By.xpath("//span[@class='checkmark']"));
		user.click();
		WebElement staticDropdown=driver.findElement(By.cssSelector("select[data-style='btn-info']"));
		Select dropdown=new Select(staticDropdown);	
		dropdown.selectByVisibleText("Teacher");
		driver.findElement(By.cssSelector("input[name='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-link.btn.btn-primary")));
		List<WebElement> Addtocart=driver.findElements(By.cssSelector(".btn.btn-info"));
		for(int i=0;i<Addtocart.size();i++)
		{
			driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();
		}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
	}
}
