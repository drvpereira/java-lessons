package br.jus.tjrn.dominio;

import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.binding.validation.ValidationContext;
import org.springframework.stereotype.Component;

@Component
public class VendaValidator {

	public void validateInformarPrecoNumeroItens(Venda venda, ValidationContext ctx) {
		MessageContext messages = ctx.getMessageContext();
		
		if (venda.getNumeroItens() <= 0) {
			messages.addMessage(new MessageBuilder().error()
					.source("numeroItens")
					.defaultText("O nœmero de itens deve ser maior que zero")
					.build());
		}
		
		if (venda.getPreco() <= 0) {
			messages.addMessage(new MessageBuilder().error()
					.source("preco")
					.defaultText("O preo deve ser maior que zero")
					.build());
		}
		
	}
	
}
