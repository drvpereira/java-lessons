package versao8;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component @Scope("prototype")
public class Computador {

 	@Inject @Qualifier("MeuMonitor")
	private Monitor monitor;
	@Inject
	private Teclado teclado;
	@Inject
	private Impressora impressora;
	
	public void ligar() {
		monitor.exibir("Digite um texto.");
		String texto = teclado.ler();
		impressora.imprimir(texto);
	}

}
