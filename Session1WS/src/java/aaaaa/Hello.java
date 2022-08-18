/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaaaa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "Hello")
public class Hello {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "say")
    public String say(String name) {
        return "Hello " + name + " !";
    }
}
