package productCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class PO_Search {
	
	WebDriver driver;
	
	public PO_Search (WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.NAME,using="q")
	private WebElement txtbx_search;
	
	@FindBy(how=How.CLASS_NAME,using="ty-search-magnifier")
	private WebElement btn_search;
	
	public void SetSearchTextBox(String arg) {
		txtbx_search.sendKeys(arg);
		Reporter.log("Product entered in Search Box:" + arg,true);
	}
	
	public void ClickSearchButton()
	{
		btn_search.click();
		Reporter.log("Search Box Button Clicked",true);
	}
	
	@Test
	public void SearchAProduct(String arg) {
		SetSearchTextBox("Hello");
		ClickSearchButton();
		String actual = driver.getTitle();
		String expected ="Search results";
		Reporter.log("Able to Search for the Product Successfully",true);
		
	}

}
