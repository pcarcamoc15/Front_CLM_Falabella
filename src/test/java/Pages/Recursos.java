package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Ayuda.PagePrincipal;

public class Recursos extends PagePrincipal {

	//Atributos
	private final By menuRecursos;

	
	//Constructores
	
	public Recursos(WebDriver driver, int seconds) {
		super(driver, seconds);
	
		this.menuRecursos = By.xpath("//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[3]/a[1]");
		
	}
	
	
	// Metodos
	
	public String capturaMenuRecursos() {
		
		String recursos;
		recursos = wait.until(ExpectedConditions.visibilityOf(driver.findElement(menuRecursos))).getText();
		return recursos;
	
	}
}
