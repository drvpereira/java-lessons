package versao8;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class TecladoUsb implements Teclado {

	@Override
	public String ler() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

}
