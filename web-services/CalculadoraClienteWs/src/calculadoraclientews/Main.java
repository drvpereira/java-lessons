/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraclientews;

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
            br.farn.ws.CalculadoraService service = new br.farn.ws.CalculadoraService();
            br.farn.ws.Calculadora port = service.getCalculadoraPort();
            // TODO initialize WS operation arguments here
            int a = 5;
            int b = 7;
            // TODO process result here
            int result = port.somar(a, b);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }

}
