//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.10.16 at 11:08:08 ���� CST
//


package com.ppm.integration.agilesdk.connector.agm.model.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Row complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Row">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Values" type="{http://www.hp.com/ppm/integration/}Values"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Row", namespace = "http://www.hp.com/ppm/integration/", propOrder = {
    "name",
    "values"
})
public class Row {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Values", required = true)
    protected Values values;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the values property.
     *
     * @return
     *     possible object is
     *     {@link Values }
     *
     */
    public Values getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     *
     * @param value
     *     allowed object is
     *     {@link Values }
     *
     */
    public void setValues(Values value) {
        this.values = value;
    }

}
