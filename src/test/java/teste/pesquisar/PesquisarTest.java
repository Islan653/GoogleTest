package teste.pesquisar;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import teste.drivers.Drivers;
import teste.elementos.ElementosTest;
import teste.metodos.Metodos;
import teste.navegadores.Navegadores;

public class PesquisarTest extends Drivers {

	Metodos metodo = new Metodos();
	Navegadores executa = new Navegadores();
	ElementosTest el = new ElementosTest();

	@BeforeEach
	public void antesDosTestes() {
		executa.setup();

	}

	@AfterEach
	public void depoisDosTestes() {
		executa.tearDown();

	}

	@Test
	public void Pesquisar() {
		el.pagePesquisar("clima hoje");

	}

	@Test
	public void pesquisarEmBranco() {
		el.pagePesquisar("");

	}

}
