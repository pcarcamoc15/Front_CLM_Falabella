package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
	

	public static void downScrollBarUntilElement(WebDriver driver, WebElement element){
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].scrollIntoView();", element);
	}
}
