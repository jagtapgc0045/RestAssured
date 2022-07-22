package Tradingview;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 
{
	@FindBy(xpath="//i[@data-field='Recommend.All']")private WebElement ratingsel1;
	@FindBy(xpath="//i[@class='tv-screener-inplace-editor__selectbox-dropdown-toggle']")private WebElement ratingsel2;
	@FindBy(xpath="(//span[@class='tv-control-checkbox__ripple js-ripple'])[211]")private WebElement ratingsel3;
	@FindBy(xpath="//div[@class='tv-screener__standalone-title-wrap']")private WebElement ratingsel4;
	@FindBy(xpath="//a[@class='tv-screener__symbol apply-common-tooltip']")private List<WebElement> daystocks;
	@FindBy(xpath="//div[@data-name='screener-time-interval']")private WebElement changeinterval;
	@FindBy(xpath="//div[@data-interval='1W']")private WebElement selectweek;
	@FindBy(xpath="//a[@class='tv-screener__symbol apply-common-tooltip']")private List<WebElement> weekstocks;
	@FindBy(xpath="//div[@data-name='screener-time-interval']")private WebElement changeinterval2;
	@FindBy(xpath="//div[@data-interval='1M']")private WebElement selectmonth;
	@FindBy(xpath="//a[@class='tv-screener__symbol apply-common-tooltip']")private List<WebElement> monthstocks;


	//div[@data-name='screener-time-interval']
	//div[@data-interval='1W']
	//div[@data-name='screener-time-interval']
	//a[@class='tv-screener__symbol apply-common-tooltip']
	//div[@class='tv-screener__standalone-title-wrap']
	public POM1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void pom1actions() throws InterruptedException
	{
		ratingsel1.click();
		Thread.sleep(500);
		ratingsel2.click();
		Thread.sleep(500);
		ratingsel3.click();
		Thread.sleep(500);
		Thread.sleep(500);
		ratingsel4.click();
		ArrayList<String>c=new ArrayList();

		for(WebElement s1:daystocks) 
		{
			String a=s1.getText();
			c.add(a);
		}
		System.out.println("Total Stocks in day timeframe="+c.size());

		Thread.sleep(3000);

		changeinterval.click();
		selectweek.click();
		Thread.sleep(500);
		
		ArrayList<String>d=new ArrayList();
		 for(WebElement s2:weekstocks) 
		{
			String b=s2.getText();
			d.add(b);
			
		}
			System.out.println("Total Stocks in week timeframe="+d.size());


		Thread.sleep(500);
		/*
		for(int i=0;i<c.size();i++)
		{
			for(int j=0;j<d.size();j++)
			{
				if(c.get(i)==d.get(j))
				{
					System.out.println(c.get(i));
				}
			}
		}
		*/
		c.retainAll(d);
		ArrayList<String>u=new ArrayList<>();
		for(String p:c) 
		{
			u.add(p);
		}
		System.out.println("common stock in day and week timeframe="+u);
		System.out.println(u.size());
		
		Thread.sleep(3000);

		changeinterval2.click();
		selectmonth.click();
		ArrayList<String>x=new ArrayList();
		for(WebElement y:monthstocks)
		{
			String p=y.getText();
			x.add(p);
		}
		u.retainAll(x);
		System.out.println("common stocks in day,week and month timeframe="+u);
		System.out.println(u.size());
		
	}
	
	
}
