//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.10 at 08:54:45 AM IST 
//


package com.bharatthippireddy.patient;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="cash" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="insurance" type="{http://www.bharatthippireddy.com/Patient}Insurance"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", propOrder = {
    "insurance",
    "cash"
})
public class PaymentType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Insurance insurance;
    protected Integer cash;

    /**
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link Insurance }
     *     
     */
    public Insurance getInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Insurance }
     *     
     */
    public void setInsurance(Insurance value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCash(Integer value) {
        this.cash = value;
    }

}
