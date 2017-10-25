
package com.epam.ws.client;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for mailWSResponse complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="mailWSResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://service.web.lab.epam.com/}mail"/>
 *         &lt;element ref="{http://service.web.lab.epam.com/}mail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://service.web.lab.epam.com/}success"/>
 *           &lt;element ref="{http://service.web.lab.epam.com/}fault"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mailWSResponse", propOrder = {
        "status", "result"
})
public class MailWSResponse {

    @XmlElements({
            //  @XmlElementRef(name = "mail", namespace = "http://service.web.lab.epam.com/", type = JAXBElement.class, required = false),
            @XmlElement(name = "fault", namespace = "http://service.web.lab.epam.com/", type = MailWSStatusFault.class),
            @XmlElement(name = "success", namespace = "http://service.web.lab.epam.com/", type = MailWSStatusSuccess.class)
    })
    private MailWSStatus status;
    @XmlElement(name = "mail", namespace = "http://service.web.lab.epam.com/", type = Mail.class)
    protected List<Object> result;
    /**
     * Gets the rest of the content model.
     *
     * <p>
     * You are getting this "catch-all" property because of the following reason:
     * The field name "Mail" is used by two different parts of a schema. See:
     * line 12 of http://localhost:8080/service?xsd=1
     * line 11 of http://localhost:8080/service?xsd=1
     * <p>
     * To get rid of this property, apply a property customization to one
     * of both of the following declarations to change their names:
     * Gets the value of the content property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MailWSStatusFault }{@code >}
     * {@link JAXBElement }{@code <}{@link Mail }{@code >}
     * {@link JAXBElement }{@code <}{@link MailWSStatusSuccess }{@code >}
     *
     *
     */
    public List<Object> getResult() {
        return this.result;
    }

    public MailWSStatus getStatus(){
        return this.status;
    }

}
