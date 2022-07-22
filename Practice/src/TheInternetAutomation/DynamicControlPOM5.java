package TheInternetAutomation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DynamicControlPOM5 
{
	@FindBy(xpath="//a[text()='Dynamic Controls']")private WebElement clickondynamiccontrol;
	@FindBy(xpath="//input[@type='checkbox']")private WebElement checkbox;
	@FindBy(xpath="//button[text()='Remove']")private WebElement clickonremove;
	@FindBy(xpath="//button[text()='Add']")private WebElement clickonadd;
	
	@FindBy(xpath="//button[text()='Enable']")private WebElement clickonenable;
	@FindBy(xpath="//input[@type='text']")private WebElement textfield;


	
	//button[text()='Enable']
	
	
	//constructor initialization
	public DynamicControlPOM5(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void pom5actions(WebDriver driver) throws InterruptedException
	{
		clickondynamiccontrol.click();
		checkbox.click();
		clickonremove.click();
		clickonadd.click();
		Thread.sleep(1000);
		clickonremove.click();
		clickonadd.click();
		Thread.sleep(5000);

		
	}
	
	public void pom5actions2(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException
	{
		clickonenable.click();
		textfield.sendKeys(UtilityClass.getTD(0, 1));
		Thread.sleep(1000);
		driver.navigate().back();

	}


}
