package exemplo;

import org.springframework.stereotype.Component;


@Component
public class VendasService  {

	public void processar(Venda venda) {
		System.out.println(venda);
		System.out.println("Venda efetuada com sucesso!");
	}
}
