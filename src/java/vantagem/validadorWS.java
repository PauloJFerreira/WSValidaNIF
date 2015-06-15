/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vantagem;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Formação
 */
@WebService(serviceName = "validadorWS")
public class validadorWS {

    /**
     * Web service operation
     * @param parameter
     * @return 
     */
    @WebMethod(operationName = "operation")
    public Boolean operation(@WebParam(name = "parameter") final String parameter) throws NumberFormatException {
       
        
        return validador.validarContribuinte(parameter);
    }
}
