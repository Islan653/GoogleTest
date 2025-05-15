package teste.navegadores;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import teste.drivers.Drivers;

public class Navegadores extends Drivers {

	public void setup() {

		ChromeOptions option = new ChromeOptions();
		// option.addArguments("--headless--");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.google.com.br/?hl=pt-BR");

	}

	public void tearDown() {

		if(driver != null) {
			
			driver.quit();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
