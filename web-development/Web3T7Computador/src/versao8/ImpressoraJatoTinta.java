package versao8;

import org.springframework.stereotype.Component;

@Component
public class ImpressoraJatoTinta implements Impressora {

	@Override
	public void imprimir(String msg) {
		System.out.println("[Impressora Jato de Tinta] " + msg);
	}

}
