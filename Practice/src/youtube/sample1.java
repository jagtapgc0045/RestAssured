package youtube;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.youtube.com");
		driver.findElement(By.xpath("(//tp-yt-paper-button[@id='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ashishkumar.aj.77@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		
		
	}

}
