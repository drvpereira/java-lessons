package versao5;

public class Computador {

	private Monitor monitor;
	private Teclado teclado;
	private Impressora impressora;
	
	public Computador(Monitor monitor, Teclado teclado, Impressora impressora) {
		this.monitor = monitor;
		this.teclado = teclado;
		this.impressora = impressora;
	}
	
	public void ligar() {
		monitor.exibir("Digite um texto.");
		String texto = teclado.ler();
		impressora.imprimir(texto);
	}

}
