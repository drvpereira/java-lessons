package cep.main;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JOptionPane;

import cep.dominio.Logradouro;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Main {

	public static void main(String[] args) throws IOException {
		String cep = JOptionPane.showInputDialog("Digite um CEP");
		
		URL url = new URL("http://10.9.0.94:8080/WsCep/CepWsServlet?cep=" + cep);
		URLConnection con = url.openConnection();
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("logradouro", Logradouro.class);
		Logradouro logradouro = (Logradouro) xstream.fromXML(con.getInputStream());
		
		System.out.println(logradouro.getTipo() + " " + logradouro.getNome());
		System.out.println(logradouro.getCep());
		System.out.println(logradouro.getBairro().getNome());
		System.out.println(logradouro.getBairro().getLocalidade().getNome());
		System.out.println(logradouro.getBairro().getLocalidade().getEstado().getSigla());
	}
	
}
