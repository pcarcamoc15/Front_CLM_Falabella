package Ayuda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilitarios {

	private static WebDriver driver;
	private static WebDriverWait wait;
	private static int seconds;
	
	public static void Espera() {
	
	wait = new WebDriverWait(driver, seconds); 
	
	}
	
}
