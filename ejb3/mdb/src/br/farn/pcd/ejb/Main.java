package br.farn.pcd.ejb;

import java.util.Properties;

import javax.naming.InitialContext;

public class Main {

	public static void main(String[] args) throws Exception {

		Properties p = new Properties();
		p.put("org.omg.CORBA.ORBInitialHost", "10.14.10.148");
		p.put("org.omg.CORBA.ORBInitialPort", "3700");
		
		InitialContext ic = new InitialContext(p);
		
		GeradorNomes gerador = (GeradorNomes) ic.lookup("GeradorNomes");
		//GeradorNomes gerador = (GeradorNomes) ic.lookup("br.farn.pcd.ejb.GeradorNomes");
		
		System.out.println("Hello, " + gerador.gerar() + "!");
		
		
	}
	
}
