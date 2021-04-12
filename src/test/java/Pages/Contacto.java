package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import Ayuda.PagePrincipal;
import Ayuda.Utilitarios;


public class Contacto extends PagePrincipal {

	//Atributos
		private final By menuContacto;
		private final By ingresarnombre;
		private final By ingresaremail;
		private final By ingresartelefono;
		private final By ingresarempresa;
		private final By ingresarcargo;
		private final By seleccionservicio;
		private final By ingresarconsulta;
		private final By clicenviar;
		private final By envioCorrecto;

		
		//Constructores
		
		public Contacto(WebDriver driver, int seconds) {
			super(driver, seconds);
		
		
			this.menuContacto = By.xpath("//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[5]/a[1]");
			this.ingresarnombre = By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/span[1]/input[1]");
			this.ingresaremail = By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/span[2]/input[1]");
			this.ingresartelefono = By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/span[3]/input[1]");
			this.ingresarempresa = By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/span[4]/input[1]");
			this.ingresarcargo = By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/span[5]/input[1]");
			this.seleccionservicio = By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/span[6]/div[1]/select[1]");
			this.ingresarconsulta = By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/span[7]/textarea[1]");
			this.clicenviar = By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]");
			
		}
		
		
		// Metodos
		
		public void clicMenuContacto() {
			
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(menuContacto))).click();
			driver.findElement(menuContacto).click();

			
		}
		
		public void nombre(String ingresenombrecompleto) {
			driver.findElement(ingresarnombre).sendKeys(ingresenombrecompleto);
			
		}
		
		public void email(String ingreseemail) {
			driver.findElement(ingresaremail).sendKeys(ingreseemail);
			
		}
		
		public void telefono(String ingresetelefono) {
			driver.findElement(ingresartelefono).sendKeys(ingresetelefono);
			
		}
		
		public void empresa(String ingresenombreempresa) {
			driver.findElement(ingresarempresa).sendKeys(ingresenombreempresa);
			
		}
		
		public void cargo(String ingresecargo) {
			driver.findElement(ingresarcargo).sendKeys(ingresecargo);
			
		}
		
		public void seleccioneservicio(String servicio) {
			Select seleccionarServicio = new Select(driver.findElement(seleccionservicio));
			seleccionarServicio.selectByVisibleText(servicio);
		
			
		}
		
		public void consulta(String ingreseconsulta) {
			driver.findElement(ingresarconsulta).sendKeys(ingreseconsulta);
			
		}
		
		public void presioneBotonEnviar() {
			driver.findElement(clicenviar).click();
			
		}
		
		public String contactoEnviado(){
			String envioFormulario;
			WebElement Elemento;
			Elemento = driver.findElement(clicenviar);
			Scroll.downScrollBarUntilElement(driver, Elemento);		
			envioFormulario= wait.until(ExpectedConditions.visibilityOf(driver.findElement(envioCorrecto))).getText();			
			return envioFormulario;
			
		}
	
}
