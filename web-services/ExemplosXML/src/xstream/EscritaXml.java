package xstream;

import java.util.Date;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class EscritaXml {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		c.setId(1);
		c.setNome("Fulano de Tal");
		c.setCpf("123.456.789-10");
		c.setDataNascimento(new Date());
		c.setEndereco(new Endereco());
		c.getEndereco().setId(2);
		c.getEndereco().setLogradouro("Rua Mossor—");
		c.getEndereco().setNumero("1234");
		c.getEndereco().setBairro("Petr—polis");
		c.getEndereco().setCidade("Natal/RN");
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("cliente", Cliente.class);
		String clienteXml = xstream.toXML(c);
		System.out.println(clienteXml);
		
	}
	
}











