package Ejecución;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.Contacto;
import Pages.Home;
import Pages.Empresa;
import Pages.Recursos;
import Pages.Servicios;



public class TestCLM{
	private WebDriver driver;

	 @BeforeClass
	  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
		driver =  new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://clmconsultores.cl/");
	  }
	 // Test 1 Acceso a Sitio CLM Consultores
	 @Test(priority=1)
	 public void paginaprincipalclm() {
		Home Acceso = new Home(driver, 10);
		Acceso.capturaTextoMenu();
		Assert.assertEquals(Acceso.capturaTextoMenu(), "Inicio");
	 }
	 
	// Test 2 Acceso a menú contacto ingreso de datos y envío de formulario
	 @Test(priority=2)
	 public void contactoclm() {
		 Contacto IngresoContacto = new Contacto(driver, 10);
		 IngresoContacto.clicMenuContacto();
		 IngresoContacto.nombre("Pamela Vanessa Cárcamo Cárcamo");
		 IngresoContacto.email("pcarcamoc15@gmail.com");
		 IngresoContacto.telefono("756488490");
		 IngresoContacto.empresa("CLM Pruebas");
		 IngresoContacto.cargo("Analista");
		 IngresoContacto.seleccioneservicio("Pruebas Mobile");
		 IngresoContacto.consulta("Prueba Falabella QA Automation");
		 IngresoContacto.presioneBotonEnviar();	 
		 Assert.assertEquals(IngresoContacto.contactoEnviado(), "Gracias por tu mensaje. Ha sido enviado.");
	 }
	 
	// Test 3 Acceso a Menú Recursos
		 @Test(priority=3)
		 public void recursosclm() {
			Recursos IngresoMenuRecursos = new Recursos(driver, 10);
			IngresoMenuRecursos.capturaMenuRecursos();
			Assert.assertEquals(IngresoMenuRecursos.capturaMenuRecursos(), "Recursos");
		 }	
		 
		// Test 4 Acceso a Menú Servicios
		 @Test (priority=4)
		 public void serviciosclm() {
			Servicios IngresoMenuServicios = new Servicios(driver, 10);
			IngresoMenuServicios.campturaMenuServicios();
			Assert.assertEquals(IngresoMenuServicios.campturaMenuServicios(), "Servicios");	 
		 }
		
		// Test 5 Acceso a Menú Empresa
		 @Test(priority=5) 
		 public void empresaclm() {
			Empresa IngresoMenuEmpresa = new Empresa(driver, 10);
			IngresoMenuEmpresa.capturaMenuEmpresa();
			Assert.assertEquals(IngresoMenuEmpresa.capturaMenuEmpresa(), "Empresa");
		 }
		 
 @AfterClass
 public void afterClass() {
	driver.close();
	
 }
}