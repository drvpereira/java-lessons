package versao3;

import java.util.Scanner;

public class TecladoUsb implements Teclado {

	@Override
	public String ler() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

}
