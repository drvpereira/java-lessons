package versao4;

public class Fabrica {

	public static Monitor novoMonitor() {
		return new DoisMonitores();
	}
	
	public static Impressora novaImpressora() {
		return new ImpressoraLaser();
	}
	
	public static Teclado novoTeclado() {
		return new TecladoUsb();
	}
	
}
