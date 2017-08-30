package br.jus.tjrn.dominio;

import org.springframework.stereotype.Service;

@Service
public class VendaService {

	public void processar(Venda venda) {
		System.out.println(venda);
		System.out.println("Venda realizada com sucesso!");
	}
	
}
