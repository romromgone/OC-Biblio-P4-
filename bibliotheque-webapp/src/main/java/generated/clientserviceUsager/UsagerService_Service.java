
package generated.clientserviceUsager;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UsagerService", targetNamespace = "http://services.webservice.ocp4.com/", wsdlLocation = "http://localhost:8085/bibliotheque-webservice/UsagerService?wsdl")
public class UsagerService_Service
    extends Service
{

    private final static URL USAGERSERVICE_WSDL_LOCATION;
    private final static WebServiceException USAGERSERVICE_EXCEPTION;
    private final static QName USAGERSERVICE_QNAME = new QName("http://services.webservice.ocp4.com/", "UsagerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8085/bibliotheque-webservice/UsagerService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USAGERSERVICE_WSDL_LOCATION = url;
        USAGERSERVICE_EXCEPTION = e;
    }

    public UsagerService_Service() {
        super(__getWsdlLocation(), USAGERSERVICE_QNAME);
    }

    public UsagerService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), USAGERSERVICE_QNAME, features);
    }

    public UsagerService_Service(URL wsdlLocation) {
        super(wsdlLocation, USAGERSERVICE_QNAME);
    }

    public UsagerService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USAGERSERVICE_QNAME, features);
    }

    public UsagerService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UsagerService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UsagerService
     */
    @WebEndpoint(name = "UsagerServicePort")
    public UsagerService getUsagerServicePort() {
        return super.getPort(new QName("http://services.webservice.ocp4.com/", "UsagerServicePort"), UsagerService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UsagerService
     */
    @WebEndpoint(name = "UsagerServicePort")
    public UsagerService getUsagerServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.webservice.ocp4.com/", "UsagerServicePort"), UsagerService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USAGERSERVICE_EXCEPTION!= null) {
            throw USAGERSERVICE_EXCEPTION;
        }
        return USAGERSERVICE_WSDL_LOCATION;
    }

}
