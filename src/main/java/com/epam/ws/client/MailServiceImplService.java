
package com.epam.ws.client;

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
@WebServiceClient(name = "MailServiceImplService", targetNamespace = "http://service.SOAPService.epam.com/", wsdlLocation = "http://localhost:4444/service/mailservice?wsdl")
public class MailServiceImplService
    extends Service
{

    private final static URL MAILSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException MAILSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName MAILSERVICEIMPLSERVICE_QNAME = new QName("http://service.SOAPService.epam.com/", "MailServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:4444/service/mailservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MAILSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        MAILSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public MailServiceImplService() {
        super(__getWsdlLocation(), MAILSERVICEIMPLSERVICE_QNAME);
    }

    public MailServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MAILSERVICEIMPLSERVICE_QNAME, features);
    }

    public MailServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, MAILSERVICEIMPLSERVICE_QNAME);
    }

    public MailServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MAILSERVICEIMPLSERVICE_QNAME, features);
    }

    public MailServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MailServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MailService
     */
    @WebEndpoint(name = "MailServiceImplPort")
    public MailService getMailServiceImplPort() {
        return super.getPort(new QName("http://service.SOAPService.epam.com/", "MailServiceImplPort"), MailService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MailService
     */
    @WebEndpoint(name = "MailServiceImplPort")
    public MailService getMailServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.SOAPService.epam.com/", "MailServiceImplPort"), MailService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MAILSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw MAILSERVICEIMPLSERVICE_EXCEPTION;
        }
        return MAILSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
