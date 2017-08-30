/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cep.ws;

import cep.dao.CepDao;
import cep.dominio.Logradouro;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author david
 */
@WebService()
public class BuscaCep {

    /**
     * Operação de serviço web
     */
    @WebMethod(operationName = "getLogradouro")
    public Logradouro getLogradouro(@WebParam(name = "cep") String cep) {
        return new CepDao().buscarLogradouroPorCep(cep);
    }

}
