package TheInternetAutomation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass
{
	AddRemoveElementPOM1 pom1;
	contextmenuPOM2 pom2;
	DragDropPOM3 pom3;
	DropdownPOM4 pom4;
	DynamicControlPOM5 pom5;
	@BeforeClass
	public void Toopenbrowser()
	{
		openbrowser();
		pom1=new AddRemoveElementPOM1(driver);
		pom2=new contextmenuPOM2(driver);
		pom3=new DragDropPOM3(driver);
		pom4=new DropdownPOM4(driver);
		pom5=new DynamicControlPOM5(driver);
	}
	@BeforeMethod
	public void Toperformactions() throws InterruptedException, EncryptedDocumentException, IOException
	{
		pom1.pom1actions(driver);
		pom2.pom2actions(driver);
		pom3.pom3actions(driver);
		pom4.pom4actions(driver);
		pom5.pom5actions(driver);
		pom5.pom5actions2(driver);
	}
	
	@Test
	public void Totest()
	{
		
	}

}
