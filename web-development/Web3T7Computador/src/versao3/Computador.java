package versao3;


public class Computador {

	private Monitor monitor;
	private Teclado teclado;
	private Impressora impressora;
	
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
