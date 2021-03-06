
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de undoAssumedMatch complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="undoAssumedMatch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="assumedMatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "undoAssumedMatch", propOrder = {
    "callerInfo",
    "assumedMatchId"
})
@XmlRootElement(name = "undoAssumedMatch")
public class UndoAssumedMatch
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    protected String assumedMatchId;

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
     * Obtém o valor da propriedade assumedMatchId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssumedMatchId() {
        return assumedMatchId;
    }

    /**
     * Define o valor da propriedade assumedMatchId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssumedMatchId(String value) {
        this.assumedMatchId = value;
    }

    public boolean isSetAssumedMatchId() {
        return (this.assumedMatchId!= null);
    }

}
