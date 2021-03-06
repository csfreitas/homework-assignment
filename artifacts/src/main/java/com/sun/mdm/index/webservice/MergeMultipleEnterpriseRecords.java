
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de mergeMultipleEnterpriseRecords complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="mergeMultipleEnterpriseRecords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="sourceEUIDs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="destinationEO" type="{http://webservice.index.mdm.sun.com/}enterprisePerson" minOccurs="0"/&gt;
 *         &lt;element name="srcRevisionNumbers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="destRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calculateOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="setSourceSystemStatusToMerged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergeMultipleEnterpriseRecords", propOrder = {
    "callerInfo",
    "sourceEUIDs",
    "destinationEO",
    "srcRevisionNumbers",
    "destRevisionNumber",
    "calculateOnly",
    "setSourceSystemStatusToMerged"
})
@XmlRootElement(name = "mergeMultipleEnterpriseRecords")
public class MergeMultipleEnterpriseRecords
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    @XmlElement(nillable = true)
    protected List<String> sourceEUIDs;
    protected EnterprisePerson destinationEO;
    @XmlElement(nillable = true)
    protected List<String> srcRevisionNumbers;
    protected String destRevisionNumber;
    protected boolean calculateOnly;
    protected boolean setSourceSystemStatusToMerged;

    /**
     * Obtém o valor da propriedade callerInfo.
     * 
     * @return
     *     possible object is
     *     {@link CallerInfo }
     *     
     */
    public CallerInfo getCallerInfo() {
        return callerInfo;
    }

    /**
     * Define o valor da propriedade callerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CallerInfo }
     *     
     */
    public void setCallerInfo(CallerInfo value) {
        this.callerInfo = value;
    }

    public boolean isSetCallerInfo() {
        return (this.callerInfo!= null);
    }

    /**
     * Gets the value of the sourceEUIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceEUIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceEUIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSourceEUIDs() {
        if (sourceEUIDs == null) {
            sourceEUIDs = new ArrayList<String>();
        }
        return this.sourceEUIDs;
    }

    public boolean isSetSourceEUIDs() {
        return ((this.sourceEUIDs!= null)&&(!this.sourceEUIDs.isEmpty()));
    }

    public void unsetSourceEUIDs() {
        this.sourceEUIDs = null;
    }

    /**
     * Obtém o valor da propriedade destinationEO.
     * 
     * @return
     *     possible object is
     *     {@link EnterprisePerson }
     *     
     */
    public EnterprisePerson getDestinationEO() {
        return destinationEO;
    }

    /**
     * Define o valor da propriedade destinationEO.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterprisePerson }
     *     
     */
    public void setDestinationEO(EnterprisePerson value) {
        this.destinationEO = value;
    }

    public boolean isSetDestinationEO() {
        return (this.destinationEO!= null);
    }

    /**
     * Gets the value of the srcRevisionNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcRevisionNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcRevisionNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSrcRevisionNumbers() {
        if (srcRevisionNumbers == null) {
            srcRevisionNumbers = new ArrayList<String>();
        }
        return this.srcRevisionNumbers;
    }

    public boolean isSetSrcRevisionNumbers() {
        return ((this.srcRevisionNumbers!= null)&&(!this.srcRevisionNumbers.isEmpty()));
    }

    public void unsetSrcRevisionNumbers() {
        this.srcRevisionNumbers = null;
    }

    /**
     * Obtém o valor da propriedade destRevisionNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestRevisionNumber() {
        return destRevisionNumber;
    }

    /**
     * Define o valor da propriedade destRevisionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestRevisionNumber(String value) {
        this.destRevisionNumber = value;
    }

    public boolean isSetDestRevisionNumber() {
        return (this.destRevisionNumber!= null);
    }

    /**
     * Obtém o valor da propriedade calculateOnly.
     * 
     */
    public boolean isCalculateOnly() {
        return calculateOnly;
    }

    /**
     * Define o valor da propriedade calculateOnly.
     * 
     */
    public void setCalculateOnly(boolean value) {
        this.calculateOnly = value;
    }

    public boolean isSetCalculateOnly() {
        return true;
    }

    /**
     * Obtém o valor da propriedade setSourceSystemStatusToMerged.
     * 
     */
    public boolean isSetSourceSystemStatusToMerged() {
        return setSourceSystemStatusToMerged;
    }

    /**
     * Define o valor da propriedade setSourceSystemStatusToMerged.
     * 
     */
    public void setSetSourceSystemStatusToMerged(boolean value) {
        this.setSourceSystemStatusToMerged = value;
    }

    public boolean isSetSetSourceSystemStatusToMerged() {
        return true;
    }

}
