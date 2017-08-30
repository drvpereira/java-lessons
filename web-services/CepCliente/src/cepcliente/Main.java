/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cepcliente;

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
            cep.ws.BuscaCepService service = new cep.ws.BuscaCepService();
            cep.ws.BuscaCep port = service.getBuscaCepPort();
            // TODO initialize WS operation arguments here
            java.lang.String cep = "59076590";
            // TODO process result here
            cep.ws.Logradouro result = port.getLogradouro(cep);



            System.out.println(result.getTipo() + " " + result.getNome());
            System.out.println(result.getBairro().getNome());
            System.out.println(result.getBairro().getLocalidade().getNome());
            System.out.println(result.getBairro().getLocalidade().getEstado().getNome());

        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
  // TODO code application logic here
    }

}
