package versao1;

import java.util.Scanner;

public class Computador {

	public void exibirNoMonitor(String msg) {
		System.out.println("[Monitor] " + msg);
	}
	
	public String lerDoTeclado() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public void enviarParaImpressora(String msg) {
		System.out.println("[Impressora] " + msg);
	}
	
	public void ligar() {
		exibirNoMonitor("Digite um texto.");
		String texto = lerDoTeclado();
		enviarParaImpressora(texto);
	}

}
