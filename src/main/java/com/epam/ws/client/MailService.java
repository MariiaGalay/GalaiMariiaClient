
package com.epam.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MailService", targetNamespace = "http://service.SOAPService.epam.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MailService {


    /**
     * 
     * @param subject
     * @return
     *     returns com.epam.ws.client.MailWSResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    public MailWSResponse getAllBySubject(
        @WebParam(name = "subject", partName = "subject")
        String subject);

    /**
     * 
     * @param id
     * @return
     *     returns com.epam.ws.client.MailWSResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    public MailWSResponse getMailById(
        @WebParam(name = "id", partName = "id")
        int id);

    /**
     * 
     * @param id
     * @return
     *     returns com.epam.ws.client.MailWSResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    public MailWSResponse deleteMail(
        @WebParam(name = "id", partName = "id")
        int id);

    /**
     * 
     * @param newLetter
     * @return
     *     returns com.epam.ws.client.MailWSResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    public MailWSResponse addMail(
        @WebParam(name = "newLetter", partName = "newLetter")
        Mail newLetter);

    /**
     * 
     * @return
     *     returns com.epam.ws.client.MailWSResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    public MailWSResponse getAllLetters();

}
