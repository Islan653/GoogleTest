package teste.elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import teste.drivers.Drivers;
import teste.metodos.Metodos;

public class ElementosTest extends Drivers {

	Metodos metodo = new Metodos();

	private By campoPesquisar = By.name("q");

	private By button = By.xpath("//input[@name='btnK']");

	/*
	 * msg de sugestao
	 */
	private By mensagemTradutor = By.xpath("//p[contains(text(),'Exibindo resultados para tradutor')]");
	private By mensagemSugestao = By.xpath("//span[contains(text(),'Em vez disso, pesquisar por')]");

	public void pagePesquisar(String pesquisar) {

		metodo.escrever(campoPesquisar, pesquisar);

		if (pesquisar.isBlank()) {

		} else {

			driver.findElement(campoPesquisar).sendKeys(Keys.ENTER);
		}
	}

	public By getMensagemTradutor() {
		return mensagemTradutor;
	}

	public By getMensagemSugestao() {
		return mensagemSugestao;
	}

	public By getcampoPesquisar() {
		return campoPesquisar;
	}

	public By getButton() {
		return button;
	}

}
