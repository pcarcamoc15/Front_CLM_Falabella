package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Ayuda.PagePrincipal;


public class Home extends PagePrincipal {

	//Atributos
	private final By menuInicio;

	
	//Constructores
	
	public Home(WebDriver driver, int seconds) {
		super(driver, seconds);
	
		this.menuInicio = By.xpath("//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[1]/a[1]/span[1]");
		
	}
	
	
	// Metodos
	
	public String capturaTextoMenu() {
		
		String inicio;
		inicio = wait.until(ExpectedConditions.visibilityOf(driver.findElement(menuInicio))).getText();
		return inicio;
		
	}
	
	
}
