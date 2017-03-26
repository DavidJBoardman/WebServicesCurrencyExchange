
package Services;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CurrencyConverter", targetNamespace = "http://WebServices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CurrencyConverter {


    /**
     * 
     * @param input
     * @param inCurrency
     * @param outCurrency
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convert", targetNamespace = "http://WebServices/", className = "Services.Convert")
    @ResponseWrapper(localName = "convertResponse", targetNamespace = "http://WebServices/", className = "Services.ConvertResponse")
    @Action(input = "http://WebServices/CurrencyConverter/convertRequest", output = "http://WebServices/CurrencyConverter/convertResponse")
    public double convert(
        @WebParam(name = "input", targetNamespace = "")
        double input,
        @WebParam(name = "inCurrency", targetNamespace = "")
        double inCurrency,
        @WebParam(name = "outCurrency", targetNamespace = "")
        double outCurrency);

}
