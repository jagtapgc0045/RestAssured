package Tradingview;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass
{
	POM1 pom1;
	@BeforeClass
	public void tolauchbrowser()
	{
		Lauchbrowser();
		pom1=new POM1( driver);
	}
	
	@BeforeMethod
	public void toperformactions() throws InterruptedException
	{
		pom1.pom1actions();
	}
	
	@Test 
	public void totest()
	{
		
	}

}
