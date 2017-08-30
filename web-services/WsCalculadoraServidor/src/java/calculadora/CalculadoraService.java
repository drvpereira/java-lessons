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
public class CalculadoraService {

    /**
     * Operação de serviço web
     */
    @WebMethod(operationName = "somar")
    public double somar(@WebParam(name = "a")
    double a, @WebParam(name = "b")
    double b) {
        return a + b;
    }

    /**
     * Operação de serviço web
     */
    @WebMethod(operationName = "subtrair")
    public double subtrair(@WebParam(name = "a")
    double a, @WebParam(name = "b")
    double b) {
        return a - b;
    }

    /**
     * Operação de serviço web
     */
    @WebMethod(operationName = "multiplicar")
    public double multiplicar(@WebParam(name = "a")
    double a, @WebParam(name = "b")
    double b) {
        return a * b;
    }

    /**
     * Operação de serviço web
     */
    @WebMethod(operationName = "dividir")
    public double dividir(@WebParam(name = "a")
    double a, @WebParam(name = "b")
    double b) {
        return a / b;
    }

}
