package versao7;

public class Computador {

	private Monitor monitor;
	private Teclado teclado;
	private Impressora impressora;
	
	private String marca;
	
	public void ligar() {
		System.out.println("---- Ligando computador " + marca + " ---");
		monitor.exibir("Digite um texto.");
		String texto = teclado.ler();
		impressora.imprimir(texto);
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public void setImpressora(Impressora impressora) {
		this.impressora = impressora;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
