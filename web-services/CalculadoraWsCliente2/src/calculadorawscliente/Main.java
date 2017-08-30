/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadorawscliente;

/**
 *
 * @author david
 */
public class Main {

    /**  // TODO code application logic here
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try { // Call Web Service Operation
            calculadora.CalculadoraServiceService service = new calculadora.CalculadoraServiceService();
            calculadora.CalculadoraService port = service.getCalculadoraServicePort();
            // TODO initialize WS operation arguments here
            double a = 3.0d;
            double b = 4.0d;
            // TODO process result here
            double result = port.somar(a, b);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }

}
