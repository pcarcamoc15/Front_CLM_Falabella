package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Ayuda.PagePrincipal;

public class Servicios extends PagePrincipal {

	//Atributos
	private final By menuServicios;

	
	//Constructores
	
	public Servicios(WebDriver driver, int seconds) {
		super(driver, seconds);
	
		this.menuServicios = By.xpath("//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]");
		
	}
	
	
	// Metodos
	
	public String campturaMenuServicios() {
		
		String servicios;
		servicios = wait.until(ExpectedConditions.visibilityOf(driver.findElement(menuServicios))).getText();
		return servicios;
		
	}
	


}
	
	

