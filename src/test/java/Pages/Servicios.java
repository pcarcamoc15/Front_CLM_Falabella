package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import Ayuda.PagePrincipal;

public class Servicios extends PagePrincipal {

	//Atributos
	private final By menuServicios;
	private final By seleccionserviciomobile;
	
	//Constructores
	
	public Servicios(WebDriver driver, int seconds) {
		super(driver, seconds);
		this.menuServicios = By.xpath("//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]");
		this.seleccionserviciomobile = By.xpath("//h1[contains(text(),'Pruebas Mobile')]");
	}
	
	
	// Metodos
	
	public String campturaMenuServicios() {
		String servicios;
		servicios = wait.until(ExpectedConditions.visibilityOf(driver.findElement(menuServicios))).getText();
		return servicios;
		
	}

	public void seleccioneservicio(String servicio) {
		Select seleccionarServicio = new Select(driver.findElement(seleccionserviciomobile));
		seleccionarServicio.selectByVisibleText(servicio);
	}
}
	
	

