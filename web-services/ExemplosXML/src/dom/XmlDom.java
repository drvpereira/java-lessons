package dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlDom {

	public static void main(String[] args) throws Exception {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		Document doc = builder.parse("src/dom/teste.xml");
		
		NodeList clientes = doc.getElementsByTagName("cliente");
		for (int i = 0; i < clientes.getLength(); i++) {
			Element cliente = (Element) clientes.item(i);	
			String nome = cliente.getAttribute("nome");
			System.out.println(nome);
			
			NodeList compras = cliente.getElementsByTagName("compra");
			for (int j = 0; j < compras.getLength(); j++) {
				Element compra = (Element) compras.item(j);
				System.out.println("- Compra No. " + (j+1));
				
				NodeList itens = compra.getElementsByTagName("item");
				for (int k = 0; k < itens.getLength(); k++) {
					Element item = (Element) itens.item(k);
					String nomeItem = item.getAttribute("nome");
					String valorItem = item.getAttribute("valor");
					System.out.println("  **" + nomeItem + " - R$ " + valorItem);
				}
			}
		}
		
	}
	
}









