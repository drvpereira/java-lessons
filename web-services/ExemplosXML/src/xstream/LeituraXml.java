package xstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LeituraXml {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException {
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("clientes", ArrayList.class);
		xstream.alias("cliente", Cliente.class);
		
		List<Cliente> clientes = (List<Cliente>) xstream.fromXML(
				new FileInputStream("src/xstream/cliente.xml"));
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
			System.out.println(cliente.getCpf());
			System.out.println(cliente.getEndereco().getLogradouro());			
		}
		
		
	}
	
}









