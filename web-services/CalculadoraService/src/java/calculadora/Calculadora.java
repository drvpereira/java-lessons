/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author david
 */
@WebService()
public class Calculadora {

    /**
     * Operação de serviço web
     */
    @WebMethod(operationName = "somar")
    public int somar(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a + b;
    }

    /**
     * Operação de serviço web
     */
    @WebMethod(operationName = "subtrair")
    public int subtrair(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a - b;
    }

    /**
     * Operação de serviço web
     */
    @WebMethod(operationName = "multiplicar")
    public int multiplicar(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a * b;
    }

    /**
     * Operação de serviço web
     */
    @WebMethod(operationName = "dividir")
    public int dividir(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a / b;
    }

}
