package br.com.caelum.estoque.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.13
 * 2020-08-05T22:36:21.552-03:00
 * Generated source version: 2.7.13
 * 
 */
@WebServiceClient(name = "EstoqueWSService", 
                  wsdlLocation = "file:/C:/Users/cw015/Documents/alura/aulas/soap/web/src/EstoqueWSServiceCap5.wsdl",
                  targetNamespace = "http://ws.estoque.caelum.com.br/") 
public class EstoqueWSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.estoque.caelum.com.br/", "EstoqueWSService");
    public final static QName EstoqueWSPort = new QName("http://ws.estoque.caelum.com.br/", "EstoqueWSPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/cw015/Documents/alura/aulas/soap/web/src/EstoqueWSServiceCap5.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EstoqueWSService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/cw015/Documents/alura/aulas/soap/web/src/EstoqueWSServiceCap5.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EstoqueWSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EstoqueWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EstoqueWSService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EstoqueWSService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EstoqueWSService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EstoqueWSService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns EstoqueWS
     */
    @WebEndpoint(name = "EstoqueWSPort")
    public EstoqueWS getEstoqueWSPort() {
        return super.getPort(EstoqueWSPort, EstoqueWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EstoqueWS
     */
    @WebEndpoint(name = "EstoqueWSPort")
    public EstoqueWS getEstoqueWSPort(WebServiceFeature... features) {
        return super.getPort(EstoqueWSPort, EstoqueWS.class, features);
    }

}
