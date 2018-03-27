
package cliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Echo", targetNamespace = "http://control/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Echo {


    /**
     * 
     * @param frase
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Echo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Echo", targetNamespace = "http://control/", className = "cliente.Echo_Type")
    @ResponseWrapper(localName = "EchoResponse", targetNamespace = "http://control/", className = "cliente.EchoResponse")
    @Action(input = "http://control/Echo/EchoRequest", output = "http://control/Echo/EchoResponse")
    public String echo(
        @WebParam(name = "frase", targetNamespace = "")
        String frase);

}