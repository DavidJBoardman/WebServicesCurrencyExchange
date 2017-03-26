
package Services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CurrencyConverter", targetNamespace = "http://WebServices/", wsdlLocation = "http://localhost:8080/Coursework2/CurrencyConverter?wsdl")
public class CurrencyConverter_Service
    extends Service
{

    private final static URL CURRENCYCONVERTER_WSDL_LOCATION;
    private final static WebServiceException CURRENCYCONVERTER_EXCEPTION;
    private final static QName CURRENCYCONVERTER_QNAME = new QName("http://WebServices/", "CurrencyConverter");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Coursework2/CurrencyConverter?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CURRENCYCONVERTER_WSDL_LOCATION = url;
        CURRENCYCONVERTER_EXCEPTION = e;
    }

    public CurrencyConverter_Service() {
        super(__getWsdlLocation(), CURRENCYCONVERTER_QNAME);
    }

    public CurrencyConverter_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CURRENCYCONVERTER_QNAME, features);
    }

    public CurrencyConverter_Service(URL wsdlLocation) {
        super(wsdlLocation, CURRENCYCONVERTER_QNAME);
    }

    public CurrencyConverter_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CURRENCYCONVERTER_QNAME, features);
    }

    public CurrencyConverter_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CurrencyConverter_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CurrencyConverter
     */
    @WebEndpoint(name = "CurrencyConverterPort")
    public CurrencyConverter getCurrencyConverterPort() {
        return super.getPort(new QName("http://WebServices/", "CurrencyConverterPort"), CurrencyConverter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyConverter
     */
    @WebEndpoint(name = "CurrencyConverterPort")
    public CurrencyConverter getCurrencyConverterPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebServices/", "CurrencyConverterPort"), CurrencyConverter.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CURRENCYCONVERTER_EXCEPTION!= null) {
            throw CURRENCYCONVERTER_EXCEPTION;
        }
        return CURRENCYCONVERTER_WSDL_LOCATION;
    }

}
