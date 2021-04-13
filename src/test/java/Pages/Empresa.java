package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Ayuda.PagePrincipal;

public class Empresa extends PagePrincipal {
	
	//Atributos
		private final By menuEmpresa;

		
		//Constructores
		
		public Empresa(WebDriver driver, int seconds) {
			super(driver, seconds);
			this.menuEmpresa = By.xpath("//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[4]/a[1]");
		}
		
		
		// Metodos
		
		public String capturaMenuEmpresa() {
			String empresa;
			empresa = wait.until(ExpectedConditions.visibilityOf(driver.findElement(menuEmpresa))).getText();
			return empresa;
		}

}
