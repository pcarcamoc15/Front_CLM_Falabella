package Pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import Ayuda.PagePrincipal;

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
		private final By mensaje;

		
		//Constructores
		
		public Contacto(WebDriver driver, int seconds) {
			super(driver, seconds);
			this.menuContacto = By.xpath("//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[5]/a[1]");
			this.ingresarnombre = By.xpath("//input[@placeholder = 'Ingrese Nombre Completo']");
			this.ingresaremail = By.xpath("//input[@placeholder = 'Ingrese Email']");
			this.ingresartelefono = By.xpath("//input[@placeholder = 'Ingrese Telefono']");
			this.ingresarempresa = By.xpath("//input[@placeholder = 'Ingrese Empresa']");
			this.ingresarcargo = By.xpath("//input[@placeholder = 'Ingrese Cargo']");
			this.seleccionservicio = By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/span[6]/div[1]/select[1]");
			this.ingresarconsulta = By.tagName("textarea");
			this.clicenviar = By.xpath("//body/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]");
			this.mensaje = By.xpath("//div[@role= 'alert'][contains(@class,'response-output')]");
		}
		
		
		// Metodos
		
		public void clicMenuContacto() {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(menuContacto))).click();
			driver.findElement(menuContacto).click();
		}
		
		public void nombre(String ingresenombrecompleto) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(ingresarnombre))).sendKeys(ingresenombrecompleto);	
		}
		
		public void email(String ingreseemail) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(ingresaremail))).sendKeys(ingreseemail);
		}
		
		public void telefono(String ingresetelefono) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(ingresartelefono))).sendKeys(ingresetelefono);
		}
		
		public void empresa(String ingresenombreempresa) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(ingresarempresa))).sendKeys(ingresenombreempresa);
		}
		
		public void cargo(String ingresecargo) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(ingresarcargo))).sendKeys(ingresecargo);
		}
		
		public void seleccioneservicio(String servicio) {
			Select seleccionarServicio = new Select(driver.findElement(seleccionservicio));
			seleccionarServicio.selectByVisibleText(servicio);	
		}
		
		public void consulta(String ingreseconsulta) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(ingresarconsulta))).sendKeys(ingreseconsulta);	
		}
		
		public void presioneBotonEnviar() {
			driver.findElement(clicenviar).click();
		}
		
		public String contactoEnviado() {
	        String envioFormulario;
	        WebElement Elemento;
	        Elemento = driver.findElement(clicenviar);
	        Scroll.downScrollBarUntilElement(driver, Elemento);
	        if (!isExistsObject(driver, mensaje, 10))
	            return null;
	        envioFormulario = wait.until(ExpectedConditions.visibilityOf(driver.findElement(mensaje))).getText();
	        System.out.println(envioFormulario);
	        return envioFormulario;
	    }

	    public static boolean isExistsObject(WebDriver driver, By envioCorrecto, int seg) {
	        try {
	            List<WebElement> element;
	            int i = 0;
	            do {
	                element = driver.findElements(envioCorrecto);
	                i++;
	                System.out.println(element.size());
	            } while (element.size() == 0 && i < seg);
	            if (element.size() > 0)
	                return true;
	            return false;
	        } catch (Exception e) {
	            return false;
	        }
	    }
}
