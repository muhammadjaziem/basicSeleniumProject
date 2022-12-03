package healthCheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import productCart.PO_Search;
import utils.BrowserManager;

public class TC_HealthCheck {

	@Test
	
	public void t_01_cscart_search()
	{
		WebDriver driver = BrowserManager.getDriver("chrome","https://electronics.demos.mv.cs-cart.com/4dc1c88e4fe36f88/?_ga=2.200140142.1504236807.1660864797-236615256.1659200917");
		
		
		PO_Search obj = PageFactory.initElements(driver,PO_Search.class);
		
		
	}

}
