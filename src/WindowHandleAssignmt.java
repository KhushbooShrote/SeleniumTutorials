import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandleAssignmt 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E://ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		//System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		System.out.println(driver.findElement(By.cssSelector("h3")).getText().trim());
		driver.switchTo().window(parentId);
		//System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		//System.out.println(driver.findElement(By.cssSelector("h3")).getText().trim());
		System.out.println(driver.findElement(By.xpath("//*[text()='Opening a new window']")).getText());
	}
}
