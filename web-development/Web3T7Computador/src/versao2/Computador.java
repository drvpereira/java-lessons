package versao2;


// OPEN-CLOSED PRINCIPLE


public class Computador {

	private Monitor monitor = new Monitor();
	private Teclado teclado = new Teclado();
	private Impressora impressora = new Impressora();
	
	public void ligar() {
		monitor.exibir("Digite um texto.");
		String texto = teclado.ler();
		impressora.imprimir(texto);
	}
	
}
