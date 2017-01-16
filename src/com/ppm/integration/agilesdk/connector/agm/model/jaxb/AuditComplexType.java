//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.06.12 at 10:29:05 PM CST
//


package com.ppm.integration.agilesdk.connector.agm.model.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;


/**
 * <p>Java class for EntityComplexType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AuditComplexType {

    @XmlElement(name = "Properties")
    protected Properties properties;

    @XmlElement(name = "Id", required = true)
    protected String Id;

    @XmlElement(name = "Action", required = true)
    protected String Action;

    @XmlElement(name = "Time", required = true)
    protected String Time;

    @XmlElement(name = "ParentId")
    protected String parentId;

    @XmlElement(name = "ParentType")
    protected String parentType;

    @XmlElement(name = "User")
    protected String user;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Properties {

        @XmlElement(name = "Property")
        protected List<Property> property;

        public List<Property> getProperty() {
            return property;
        }

        public void setProperty(List<Property> property) {
            this.property = property;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        public static class Property {

            @XmlAttribute(name = "Label")
            protected String label;

            @XmlAttribute(name = "Name")
            protected String name;

            @XmlElement(name = "NewValue")
            protected String newValue;

            @XmlElement(name = "OldValue")
            protected String oldValue;

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNewValue() {
                return newValue;
            }

            public void setNewValue(String newValue) {
                this.newValue = newValue;
            }

            public String getOldValue() {
                return oldValue;
            }

            public void setOldValue(String oldValue) {
                this.oldValue = oldValue;
           }
      }

    }

}