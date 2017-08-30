package cep.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import cep.dao.CepDao;
import cep.dominio.Logradouro;

public class CepWsServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cep = request.getParameter("cep");
		Logradouro logradouro = new CepDao().buscarLogradouroPorCep(cep);
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("logradouro", Logradouro.class);
		xstream.toXML(logradouro, response.getOutputStream());
	}

}
