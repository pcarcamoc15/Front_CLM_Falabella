package Ayuda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PagePrincipal {
	
	// Atributos
	
	protected WebDriver driver;
	//protected ExtentTest test;
	//protected Boolean TAKE_SS;
	protected WebDriverWait wait;
	public PagePrincipal (WebDriver driver, int seconds) {
	   this.driver = driver;
	  // this.test = test;
	  // this.TAKE_SS = TAKE_SS;
	   wait = new WebDriverWait(driver, seconds);
	}

}
