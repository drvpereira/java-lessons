package versao3;

public class ImpressoraJatoTinta implements Impressora {

	@Override
	public void imprimir(String msg) {
		System.out.println("[Impressora Jato de Tinta] " + msg);
	}

}
