/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoracliente;

/**
 *
 * @author david
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try { // Call Web Service Operation
            calculadora.CalculadoraService service = new calculadora.CalculadoraService();
            calculadora.Calculadora port = service.getCalculadoraPort();
            // TODO initialize WS operation arguments here
            int a = 3;
            int b = 4;
            // TODO process result here
            int result = port.multiplicar(a, b);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    }

}
