import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class AutoSujjestivedropdn 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//Checkboxes
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	    //System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	    driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	    System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	    //Count no. of checkboxes
	    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	    /*
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	    for(WebElement option : options)
	    {
	    	if(option.getText().equalsIgnoreCase("india"))
	    	{
	    		option.click();
	    		break;
	    	}
	    }*/
	 }
}
