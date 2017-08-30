package calculadora;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Main {

	public static void main(String[] args) throws ServiceException, RemoteException {
		
		CalculadoraServiceImplServiceLocator locator = new CalculadoraServiceImplServiceLocator();
		CalculadoraServiceImpl service = locator.getCalculadoraServiceImpl();
		
		System.out.println(service.somar(2, 3));
		System.out.println(service.subtrair(3, 1));
		System.out.println(service.multiplicar(4, 4));
		System.out.println(service.dividir(10, 2));
		
		
	}
	
}
