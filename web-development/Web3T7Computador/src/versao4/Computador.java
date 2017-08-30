package versao4;

public class Computador {

	private Monitor monitor = Fabrica.novoMonitor();
	private Teclado teclado = Fabrica.novoTeclado();
	private Impressora impressora = Fabrica.novaImpressora();
	
	public void ligar() {
		monitor.exibir("Digite um texto.");
		String texto = teclado.ler();
		impressora.imprimir(texto);
	}

	public static void main(String[] args) {
		Computador c = new Computador();
		c.ligar();
	}
	
}
