package versao6;

public class ImpressoraLaser implements Impressora {

	@Override
	public void imprimir(String msg) {
		System.out.println("[Impressora Laser] " + msg);
	}

}
