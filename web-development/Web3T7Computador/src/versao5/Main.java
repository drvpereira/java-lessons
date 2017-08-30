package versao5;

public class Main {

	public static void main(String[] args) {
		
		Computador c = 
			new Computador(new DoisMonitores(), new TecladoUsb(), new ImpressoraJatoTinta());
		
		c.ligar();
		
	}
	
}
