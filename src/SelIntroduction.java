import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SelIntroduction 
{
	static public void  main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys("Rahul");
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.cssSelector("body >"+ " main > div > div.bodySmall.m-b-3-"+ "xs.text-center-xs.auth-flash-error")).getText());
	    driver.findElement(By.linkText("Forgot Password")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("form-input p-v-1-xs p-l-2-"
		+ "xs p-r-4-xs col-12-xs bodyMain error")).sendKeys("khushi");

	}
}
