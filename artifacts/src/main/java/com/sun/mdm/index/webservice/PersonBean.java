
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de personBean complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="personBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://webservice.index.mdm.sun.com/}addressBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addressHistory" type="{http://webservice.index.mdm.sun.com/}addressHistoryBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alias" type="{http://webservice.index.mdm.sun.com/}aliasBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="authFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="auxId" type="{http://webservice.index.mdm.sun.com/}auxIdBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="birthOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="citizenship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="class1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="class2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="class3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="class4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="class5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://webservice.index.mdm.sun.com/}commentBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://webservice.index.mdm.sun.com/}contactBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="death" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deathCertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="districtOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driversLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driversLicenseExp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driversLicenseSt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dummyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://webservice.index.mdm.sun.com/}emailBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ethnic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fatherPhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="images" type="{http://webservice.index.mdm.sun.com/}imagesBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastServiceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lgaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maiden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maidenPhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="militaryBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="militaryRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="militaryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherMNPhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherPhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multipleBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pensionExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pensionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personCatCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://webservice.index.mdm.sun.com/}phoneBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="phoneHistory" type="{http://webservice.index.mdm.sun.com/}phoneHistoryBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pobCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pobCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pobState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="races" type="{http://webservice.index.mdm.sun.com/}racesBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repatriationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spousePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VIPFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personBean", propOrder = {
    "addresses",
    "addressHistories",
    "alias",
    "authFlag",
    "auxIds",
    "birthOrder",
    "citizenship",
    "class1",
    "class2",
    "class3",
    "class4",
    "class5",
    "comments",
    "contacts",
    "dob",
    "date1",
    "date2",
    "date3",
    "date4",
    "date5",
    "death",
    "deathCertificate",
    "degree",
    "districtOfResidence",
    "dod",
    "driversLicense",
    "driversLicenseExp",
    "driversLicenseSt",
    "dummyDate",
    "emails",
    "ethnic",
    "fatherName",
    "fatherPhoneticCode",
    "firstName",
    "fnamePhoneticCode",
    "gender",
    "images",
    "language",
    "lastName",
    "lastServiceDate",
    "lgaCode",
    "lnamePhoneticCode",
    "mStatus",
    "maiden",
    "maidenPhoneticCode",
    "middleName",
    "militaryBranch",
    "militaryRank",
    "militaryStatus",
    "mnamePhoneticCode",
    "motherMN",
    "motherMNPhoneticCode",
    "motherName",
    "motherPhoneticCode",
    "multipleBirth",
    "nationality",
    "pensionExpDate",
    "pensionNo",
    "personCatCode",
    "personId",
    "phones",
    "phoneHistories",
    "picture",
    "pobCity",
    "pobCountry",
    "pobState",
    "prefix",
    "race",
    "races",
    "religion",
    "repatriationNo",
    "ssn",
    "ssn4",
    "spouseName",
    "spousePhoneticCode",
    "stdFirstName",
    "stdLastName",
    "stdMiddleName",
    "string1",
    "string10",
    "string2",
    "string3",
    "string4",
    "string5",
    "string6",
    "string7",
    "string8",
    "string9",
    "suffix",
    "title",
    "vipFlag",
    "vetStatus"
})
public class PersonBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "address", nillable = true)
    protected List<AddressBean> addresses;
    @XmlElement(name = "addressHistory", nillable = true)
    protected List<AddressHistoryBean> addressHistories;
    @XmlElement(nillable = true)
    protected List<AliasBean> alias;
    protected String authFlag;
    @XmlElement(name = "auxId", nillable = true)
    protected List<AuxIdBean> auxIds;
    protected String birthOrder;
    protected String citizenship;
    protected String class1;
    protected String class2;
    protected String class3;
    protected String class4;
    protected String class5;
    @XmlElement(name = "comment", nillable = true)
    protected List<CommentBean> comments;
    @XmlElement(name = "contact", nillable = true)
    protected List<ContactBean> contacts;
    @XmlElement(name = "DOB")
    protected String dob;
    protected String date1;
    protected String date2;
    protected String date3;
    protected String date4;
    protected String date5;
    protected String death;
    protected String deathCertificate;
    protected String degree;
    protected String districtOfResidence;
    protected String dod;
    protected String driversLicense;
    protected String driversLicenseExp;
    protected String driversLicenseSt;
    protected String dummyDate;
    @XmlElement(name = "email", nillable = true)
    protected List<EmailBean> emails;
    protected String ethnic;
    protected String fatherName;
    protected String fatherPhoneticCode;
    protected String firstName;
    protected String fnamePhoneticCode;
    protected String gender;
    @XmlElement(nillable = true)
    protected List<ImagesBean> images;
    protected String language;
    protected String lastName;
    protected String lastServiceDate;
    protected String lgaCode;
    protected String lnamePhoneticCode;
    @XmlElement(name = "MStatus")
    protected String mStatus;
    protected String maiden;
    protected String maidenPhoneticCode;
    protected String middleName;
    protected String militaryBranch;
    protected String militaryRank;
    protected String militaryStatus;
    protected String mnamePhoneticCode;
    protected String motherMN;
    protected String motherMNPhoneticCode;
    protected String motherName;
    protected String motherPhoneticCode;
    protected String multipleBirth;
    protected String nationality;
    protected String pensionExpDate;
    protected String pensionNo;
    protected String personCatCode;
    protected String personId;
    @XmlElement(name = "phone", nillable = true)
    protected List<PhoneBean> phones;
    @XmlElement(name = "phoneHistory", nillable = true)
    protected List<PhoneHistoryBean> phoneHistories;
    protected String picture;
    protected String pobCity;
    protected String pobCountry;
    protected String pobState;
    protected String prefix;
    protected String race;
    @XmlElement(nillable = true)
    protected List<RacesBean> races;
    protected String religion;
    protected String repatriationNo;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "SSN4")
    protected String ssn4;
    protected String spouseName;
    protected String spousePhoneticCode;
    protected String stdFirstName;
    protected String stdLastName;
    protected String stdMiddleName;
    protected String string1;
    protected String string10;
    protected String string2;
    protected String string3;
    protected String string4;
    protected String string5;
    protected String string6;
    protected String string7;
    protected String string8;
    protected String string9;
    protected String suffix;
    protected String title;
    @XmlElement(name = "VIPFlag")
    protected String vipFlag;
    protected String vetStatus;

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressBean }
     * 
     * 
     */
    public List<AddressBean> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<AddressBean>();
        }
        return this.addresses;
    }

    public boolean isSetAddresses() {
        return ((this.addresses!= null)&&(!this.addresses.isEmpty()));
    }

    public void unsetAddresses() {
        this.addresses = null;
    }

    /**
     * Gets the value of the addressHistories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressHistories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressHistories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressHistoryBean }
     * 
     * 
     */
    public List<AddressHistoryBean> getAddressHistories() {
        if (addressHistories == null) {
            addressHistories = new ArrayList<AddressHistoryBean>();
        }
        return this.addressHistories;
    }

    public boolean isSetAddressHistories() {
        return ((this.addressHistories!= null)&&(!this.addressHistories.isEmpty()));
    }

    public void unsetAddressHistories() {
        this.addressHistories = null;
    }

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AliasBean }
     * 
     * 
     */
    public List<AliasBean> getAlias() {
        if (alias == null) {
            alias = new ArrayList<AliasBean>();
        }
        return this.alias;
    }

    public boolean isSetAlias() {
        return ((this.alias!= null)&&(!this.alias.isEmpty()));
    }

    public void unsetAlias() {
        this.alias = null;
    }

    /**
     * Obtém o valor da propriedade authFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthFlag() {
        return authFlag;
    }

    /**
     * Define o valor da propriedade authFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthFlag(String value) {
        this.authFlag = value;
    }

    public boolean isSetAuthFlag() {
        return (this.authFlag!= null);
    }

    /**
     * Gets the value of the auxIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxIdBean }
     * 
     * 
     */
    public List<AuxIdBean> getAuxIds() {
        if (auxIds == null) {
            auxIds = new ArrayList<AuxIdBean>();
        }
        return this.auxIds;
    }

    public boolean isSetAuxIds() {
        return ((this.auxIds!= null)&&(!this.auxIds.isEmpty()));
    }

    public void unsetAuxIds() {
        this.auxIds = null;
    }

    /**
     * Obtém o valor da propriedade birthOrder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthOrder() {
        return birthOrder;
    }

    /**
     * Define o valor da propriedade birthOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthOrder(String value) {
        this.birthOrder = value;
    }

    public boolean isSetBirthOrder() {
        return (this.birthOrder!= null);
    }

    /**
     * Obtém o valor da propriedade citizenship.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Define o valor da propriedade citizenship.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    public boolean isSetCitizenship() {
        return (this.citizenship!= null);
    }

    /**
     * Obtém o valor da propriedade class1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass1() {
        return class1;
    }

    /**
     * Define o valor da propriedade class1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass1(String value) {
        this.class1 = value;
    }

    public boolean isSetClass1() {
        return (this.class1 != null);
    }

    /**
     * Obtém o valor da propriedade class2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass2() {
        return class2;
    }

    /**
     * Define o valor da propriedade class2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass2(String value) {
        this.class2 = value;
    }

    public boolean isSetClass2() {
        return (this.class2 != null);
    }

    /**
     * Obtém o valor da propriedade class3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass3() {
        return class3;
    }

    /**
     * Define o valor da propriedade class3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass3(String value) {
        this.class3 = value;
    }

    public boolean isSetClass3() {
        return (this.class3 != null);
    }

    /**
     * Obtém o valor da propriedade class4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass4() {
        return class4;
    }

    /**
     * Define o valor da propriedade class4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass4(String value) {
        this.class4 = value;
    }

    public boolean isSetClass4() {
        return (this.class4 != null);
    }

    /**
     * Obtém o valor da propriedade class5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass5() {
        return class5;
    }

    /**
     * Define o valor da propriedade class5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass5(String value) {
        this.class5 = value;
    }

    public boolean isSetClass5() {
        return (this.class5 != null);
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentBean }
     * 
     * 
     */
    public List<CommentBean> getComments() {
        if (comments == null) {
            comments = new ArrayList<CommentBean>();
        }
        return this.comments;
    }

    public boolean isSetComments() {
        return ((this.comments!= null)&&(!this.comments.isEmpty()));
    }

    public void unsetComments() {
        this.comments = null;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactBean }
     * 
     * 
     */
    public List<ContactBean> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<ContactBean>();
        }
        return this.contacts;
    }

    public boolean isSetContacts() {
        return ((this.contacts!= null)&&(!this.contacts.isEmpty()));
    }

    public void unsetContacts() {
        this.contacts = null;
    }

    /**
     * Obtém o valor da propriedade dob.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOB() {
        return dob;
    }

    /**
     * Define o valor da propriedade dob.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOB(String value) {
        this.dob = value;
    }

    public boolean isSetDOB() {
        return (this.dob!= null);
    }

    /**
     * Obtém o valor da propriedade date1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate1() {
        return date1;
    }

    /**
     * Define o valor da propriedade date1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate1(String value) {
        this.date1 = value;
    }

    public boolean isSetDate1() {
        return (this.date1 != null);
    }

    /**
     * Obtém o valor da propriedade date2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate2() {
        return date2;
    }

    /**
     * Define o valor da propriedade date2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate2(String value) {
        this.date2 = value;
    }

    public boolean isSetDate2() {
        return (this.date2 != null);
    }

    /**
     * Obtém o valor da propriedade date3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate3() {
        return date3;
    }

    /**
     * Define o valor da propriedade date3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate3(String value) {
        this.date3 = value;
    }

    public boolean isSetDate3() {
        return (this.date3 != null);
    }

    /**
     * Obtém o valor da propriedade date4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate4() {
        return date4;
    }

    /**
     * Define o valor da propriedade date4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate4(String value) {
        this.date4 = value;
    }

    public boolean isSetDate4() {
        return (this.date4 != null);
    }

    /**
     * Obtém o valor da propriedade date5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate5() {
        return date5;
    }

    /**
     * Define o valor da propriedade date5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate5(String value) {
        this.date5 = value;
    }

    public boolean isSetDate5() {
        return (this.date5 != null);
    }

    /**
     * Obtém o valor da propriedade death.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeath() {
        return death;
    }

    /**
     * Define o valor da propriedade death.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeath(String value) {
        this.death = value;
    }

    public boolean isSetDeath() {
        return (this.death!= null);
    }

    /**
     * Obtém o valor da propriedade deathCertificate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathCertificate() {
        return deathCertificate;
    }

    /**
     * Define o valor da propriedade deathCertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathCertificate(String value) {
        this.deathCertificate = value;
    }

    public boolean isSetDeathCertificate() {
        return (this.deathCertificate!= null);
    }

    /**
     * Obtém o valor da propriedade degree.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Define o valor da propriedade degree.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegree(String value) {
        this.degree = value;
    }

    public boolean isSetDegree() {
        return (this.degree!= null);
    }

    /**
     * Obtém o valor da propriedade districtOfResidence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictOfResidence() {
        return districtOfResidence;
    }

    /**
     * Define o valor da propriedade districtOfResidence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictOfResidence(String value) {
        this.districtOfResidence = value;
    }

    public boolean isSetDistrictOfResidence() {
        return (this.districtOfResidence!= null);
    }

    /**
     * Obtém o valor da propriedade dod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDod() {
        return dod;
    }

    /**
     * Define o valor da propriedade dod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDod(String value) {
        this.dod = value;
    }

    public boolean isSetDod() {
        return (this.dod!= null);
    }

    /**
     * Obtém o valor da propriedade driversLicense.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicense() {
        return driversLicense;
    }

    /**
     * Define o valor da propriedade driversLicense.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicense(String value) {
        this.driversLicense = value;
    }

    public boolean isSetDriversLicense() {
        return (this.driversLicense!= null);
    }

    /**
     * Obtém o valor da propriedade driversLicenseExp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseExp() {
        return driversLicenseExp;
    }

    /**
     * Define o valor da propriedade driversLicenseExp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseExp(String value) {
        this.driversLicenseExp = value;
    }

    public boolean isSetDriversLicenseExp() {
        return (this.driversLicenseExp!= null);
    }

    /**
     * Obtém o valor da propriedade driversLicenseSt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseSt() {
        return driversLicenseSt;
    }

    /**
     * Define o valor da propriedade driversLicenseSt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseSt(String value) {
        this.driversLicenseSt = value;
    }

    public boolean isSetDriversLicenseSt() {
        return (this.driversLicenseSt!= null);
    }

    /**
     * Obtém o valor da propriedade dummyDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDummyDate() {
        return dummyDate;
    }

    /**
     * Define o valor da propriedade dummyDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDummyDate(String value) {
        this.dummyDate = value;
    }

    public boolean isSetDummyDate() {
        return (this.dummyDate!= null);
    }

    /**
     * Gets the value of the emails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailBean }
     * 
     * 
     */
    public List<EmailBean> getEmails() {
        if (emails == null) {
            emails = new ArrayList<EmailBean>();
        }
        return this.emails;
    }

    public boolean isSetEmails() {
        return ((this.emails!= null)&&(!this.emails.isEmpty()));
    }

    public void unsetEmails() {
        this.emails = null;
    }

    /**
     * Obtém o valor da propriedade ethnic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnic() {
        return ethnic;
    }

    /**
     * Define o valor da propriedade ethnic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnic(String value) {
        this.ethnic = value;
    }

    public boolean isSetEthnic() {
        return (this.ethnic!= null);
    }

    /**
     * Obtém o valor da propriedade fatherName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Define o valor da propriedade fatherName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherName(String value) {
        this.fatherName = value;
    }

    public boolean isSetFatherName() {
        return (this.fatherName!= null);
    }

    /**
     * Obtém o valor da propriedade fatherPhoneticCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherPhoneticCode() {
        return fatherPhoneticCode;
    }

    /**
     * Define o valor da propriedade fatherPhoneticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherPhoneticCode(String value) {
        this.fatherPhoneticCode = value;
    }

    public boolean isSetFatherPhoneticCode() {
        return (this.fatherPhoneticCode!= null);
    }

    /**
     * Obtém o valor da propriedade firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define o valor da propriedade firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    public boolean isSetFirstName() {
        return (this.firstName!= null);
    }

    /**
     * Obtém o valor da propriedade fnamePhoneticCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnamePhoneticCode() {
        return fnamePhoneticCode;
    }

    /**
     * Define o valor da propriedade fnamePhoneticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnamePhoneticCode(String value) {
        this.fnamePhoneticCode = value;
    }

    public boolean isSetFnamePhoneticCode() {
        return (this.fnamePhoneticCode!= null);
    }

    /**
     * Obtém o valor da propriedade gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define o valor da propriedade gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    public boolean isSetGender() {
        return (this.gender!= null);
    }

    /**
     * Gets the value of the images property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the images property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagesBean }
     * 
     * 
     */
    public List<ImagesBean> getImages() {
        if (images == null) {
            images = new ArrayList<ImagesBean>();
        }
        return this.images;
    }

    public boolean isSetImages() {
        return ((this.images!= null)&&(!this.images.isEmpty()));
    }

    public void unsetImages() {
        this.images = null;
    }

    /**
     * Obtém o valor da propriedade language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define o valor da propriedade language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    public boolean isSetLanguage() {
        return (this.language!= null);
    }

    /**
     * Obtém o valor da propriedade lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define o valor da propriedade lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    public boolean isSetLastName() {
        return (this.lastName!= null);
    }

    /**
     * Obtém o valor da propriedade lastServiceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastServiceDate() {
        return lastServiceDate;
    }

    /**
     * Define o valor da propriedade lastServiceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastServiceDate(String value) {
        this.lastServiceDate = value;
    }

    public boolean isSetLastServiceDate() {
        return (this.lastServiceDate!= null);
    }

    /**
     * Obtém o valor da propriedade lgaCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgaCode() {
        return lgaCode;
    }

    /**
     * Define o valor da propriedade lgaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgaCode(String value) {
        this.lgaCode = value;
    }

    public boolean isSetLgaCode() {
        return (this.lgaCode!= null);
    }

    /**
     * Obtém o valor da propriedade lnamePhoneticCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnamePhoneticCode() {
        return lnamePhoneticCode;
    }

    /**
     * Define o valor da propriedade lnamePhoneticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnamePhoneticCode(String value) {
        this.lnamePhoneticCode = value;
    }

    public boolean isSetLnamePhoneticCode() {
        return (this.lnamePhoneticCode!= null);
    }

    /**
     * Obtém o valor da propriedade mStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMStatus() {
        return mStatus;
    }

    /**
     * Define o valor da propriedade mStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMStatus(String value) {
        this.mStatus = value;
    }

    public boolean isSetMStatus() {
        return (this.mStatus!= null);
    }

    /**
     * Obtém o valor da propriedade maiden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaiden() {
        return maiden;
    }

    /**
     * Define o valor da propriedade maiden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaiden(String value) {
        this.maiden = value;
    }

    public boolean isSetMaiden() {
        return (this.maiden!= null);
    }

    /**
     * Obtém o valor da propriedade maidenPhoneticCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaidenPhoneticCode() {
        return maidenPhoneticCode;
    }

    /**
     * Define o valor da propriedade maidenPhoneticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaidenPhoneticCode(String value) {
        this.maidenPhoneticCode = value;
    }

    public boolean isSetMaidenPhoneticCode() {
        return (this.maidenPhoneticCode!= null);
    }

    /**
     * Obtém o valor da propriedade middleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Define o valor da propriedade middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    public boolean isSetMiddleName() {
        return (this.middleName!= null);
    }

    /**
     * Obtém o valor da propriedade militaryBranch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryBranch() {
        return militaryBranch;
    }

    /**
     * Define o valor da propriedade militaryBranch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryBranch(String value) {
        this.militaryBranch = value;
    }

    public boolean isSetMilitaryBranch() {
        return (this.militaryBranch!= null);
    }

    /**
     * Obtém o valor da propriedade militaryRank.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryRank() {
        return militaryRank;
    }

    /**
     * Define o valor da propriedade militaryRank.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryRank(String value) {
        this.militaryRank = value;
    }

    public boolean isSetMilitaryRank() {
        return (this.militaryRank!= null);
    }

    /**
     * Obtém o valor da propriedade militaryStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryStatus() {
        return militaryStatus;
    }

    /**
     * Define o valor da propriedade militaryStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryStatus(String value) {
        this.militaryStatus = value;
    }

    public boolean isSetMilitaryStatus() {
        return (this.militaryStatus!= null);
    }

    /**
     * Obtém o valor da propriedade mnamePhoneticCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnamePhoneticCode() {
        return mnamePhoneticCode;
    }

    /**
     * Define o valor da propriedade mnamePhoneticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnamePhoneticCode(String value) {
        this.mnamePhoneticCode = value;
    }

    public boolean isSetMnamePhoneticCode() {
        return (this.mnamePhoneticCode!= null);
    }

    /**
     * Obtém o valor da propriedade motherMN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherMN() {
        return motherMN;
    }

    /**
     * Define o valor da propriedade motherMN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherMN(String value) {
        this.motherMN = value;
    }

    public boolean isSetMotherMN() {
        return (this.motherMN!= null);
    }

    /**
     * Obtém o valor da propriedade motherMNPhoneticCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherMNPhoneticCode() {
        return motherMNPhoneticCode;
    }

    /**
     * Define o valor da propriedade motherMNPhoneticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherMNPhoneticCode(String value) {
        this.motherMNPhoneticCode = value;
    }

    public boolean isSetMotherMNPhoneticCode() {
        return (this.motherMNPhoneticCode!= null);
    }

    /**
     * Obtém o valor da propriedade motherName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherName() {
        return motherName;
    }

    /**
     * Define o valor da propriedade motherName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherName(String value) {
        this.motherName = value;
    }

    public boolean isSetMotherName() {
        return (this.motherName!= null);
    }

    /**
     * Obtém o valor da propriedade motherPhoneticCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherPhoneticCode() {
        return motherPhoneticCode;
    }

    /**
     * Define o valor da propriedade motherPhoneticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherPhoneticCode(String value) {
        this.motherPhoneticCode = value;
    }

    public boolean isSetMotherPhoneticCode() {
        return (this.motherPhoneticCode!= null);
    }

    /**
     * Obtém o valor da propriedade multipleBirth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleBirth() {
        return multipleBirth;
    }

    /**
     * Define o valor da propriedade multipleBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleBirth(String value) {
        this.multipleBirth = value;
    }

    public boolean isSetMultipleBirth() {
        return (this.multipleBirth!= null);
    }

    /**
     * Obtém o valor da propriedade nationality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Define o valor da propriedade nationality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    public boolean isSetNationality() {
        return (this.nationality!= null);
    }

    /**
     * Obtém o valor da propriedade pensionExpDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionExpDate() {
        return pensionExpDate;
    }

    /**
     * Define o valor da propriedade pensionExpDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionExpDate(String value) {
        this.pensionExpDate = value;
    }

    public boolean isSetPensionExpDate() {
        return (this.pensionExpDate!= null);
    }

    /**
     * Obtém o valor da propriedade pensionNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionNo() {
        return pensionNo;
    }

    /**
     * Define o valor da propriedade pensionNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionNo(String value) {
        this.pensionNo = value;
    }

    public boolean isSetPensionNo() {
        return (this.pensionNo!= null);
    }

    /**
     * Obtém o valor da propriedade personCatCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCatCode() {
        return personCatCode;
    }

    /**
     * Define o valor da propriedade personCatCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCatCode(String value) {
        this.personCatCode = value;
    }

    public boolean isSetPersonCatCode() {
        return (this.personCatCode!= null);
    }

    /**
     * Obtém o valor da propriedade personId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Define o valor da propriedade personId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    public boolean isSetPersonId() {
        return (this.personId!= null);
    }

    /**
     * Gets the value of the phones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneBean }
     * 
     * 
     */
    public List<PhoneBean> getPhones() {
        if (phones == null) {
            phones = new ArrayList<PhoneBean>();
        }
        return this.phones;
    }

    public boolean isSetPhones() {
        return ((this.phones!= null)&&(!this.phones.isEmpty()));
    }

    public void unsetPhones() {
        this.phones = null;
    }

    /**
     * Gets the value of the phoneHistories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneHistories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneHistories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneHistoryBean }
     * 
     * 
     */
    public List<PhoneHistoryBean> getPhoneHistories() {
        if (phoneHistories == null) {
            phoneHistories = new ArrayList<PhoneHistoryBean>();
        }
        return this.phoneHistories;
    }

    public boolean isSetPhoneHistories() {
        return ((this.phoneHistories!= null)&&(!this.phoneHistories.isEmpty()));
    }

    public void unsetPhoneHistories() {
        this.phoneHistories = null;
    }

    /**
     * Obtém o valor da propriedade picture.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Define o valor da propriedade picture.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicture(String value) {
        this.picture = value;
    }

    public boolean isSetPicture() {
        return (this.picture!= null);
    }

    /**
     * Obtém o valor da propriedade pobCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobCity() {
        return pobCity;
    }

    /**
     * Define o valor da propriedade pobCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobCity(String value) {
        this.pobCity = value;
    }

    public boolean isSetPobCity() {
        return (this.pobCity!= null);
    }

    /**
     * Obtém o valor da propriedade pobCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobCountry() {
        return pobCountry;
    }

    /**
     * Define o valor da propriedade pobCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobCountry(String value) {
        this.pobCountry = value;
    }

    public boolean isSetPobCountry() {
        return (this.pobCountry!= null);
    }

    /**
     * Obtém o valor da propriedade pobState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobState() {
        return pobState;
    }

    /**
     * Define o valor da propriedade pobState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobState(String value) {
        this.pobState = value;
    }

    public boolean isSetPobState() {
        return (this.pobState!= null);
    }

    /**
     * Obtém o valor da propriedade prefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Define o valor da propriedade prefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    public boolean isSetPrefix() {
        return (this.prefix!= null);
    }

    /**
     * Obtém o valor da propriedade race.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * Define o valor da propriedade race.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
    }

    public boolean isSetRace() {
        return (this.race!= null);
    }

    /**
     * Gets the value of the races property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the races property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RacesBean }
     * 
     * 
     */
    public List<RacesBean> getRaces() {
        if (races == null) {
            races = new ArrayList<RacesBean>();
        }
        return this.races;
    }

    public boolean isSetRaces() {
        return ((this.races!= null)&&(!this.races.isEmpty()));
    }

    public void unsetRaces() {
        this.races = null;
    }

    /**
     * Obtém o valor da propriedade religion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligion() {
        return religion;
    }

    /**
     * Define o valor da propriedade religion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligion(String value) {
        this.religion = value;
    }

    public boolean isSetReligion() {
        return (this.religion!= null);
    }

    /**
     * Obtém o valor da propriedade repatriationNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepatriationNo() {
        return repatriationNo;
    }

    /**
     * Define o valor da propriedade repatriationNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepatriationNo(String value) {
        this.repatriationNo = value;
    }

    public boolean isSetRepatriationNo() {
        return (this.repatriationNo!= null);
    }

    /**
     * Obtém o valor da propriedade ssn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Define o valor da propriedade ssn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    public boolean isSetSSN() {
        return (this.ssn!= null);
    }

    /**
     * Obtém o valor da propriedade ssn4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN4() {
        return ssn4;
    }

    /**
     * Define o valor da propriedade ssn4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN4(String value) {
        this.ssn4 = value;
    }

    public boolean isSetSSN4() {
        return (this.ssn4 != null);
    }

    /**
     * Obtém o valor da propriedade spouseName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Define o valor da propriedade spouseName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
    }

    public boolean isSetSpouseName() {
        return (this.spouseName!= null);
    }

    /**
     * Obtém o valor da propriedade spousePhoneticCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpousePhoneticCode() {
        return spousePhoneticCode;
    }

    /**
     * Define o valor da propriedade spousePhoneticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpousePhoneticCode(String value) {
        this.spousePhoneticCode = value;
    }

    public boolean isSetSpousePhoneticCode() {
        return (this.spousePhoneticCode!= null);
    }

    /**
     * Obtém o valor da propriedade stdFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdFirstName() {
        return stdFirstName;
    }

    /**
     * Define o valor da propriedade stdFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdFirstName(String value) {
        this.stdFirstName = value;
    }

    public boolean isSetStdFirstName() {
        return (this.stdFirstName!= null);
    }

    /**
     * Obtém o valor da propriedade stdLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdLastName() {
        return stdLastName;
    }

    /**
     * Define o valor da propriedade stdLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdLastName(String value) {
        this.stdLastName = value;
    }

    public boolean isSetStdLastName() {
        return (this.stdLastName!= null);
    }

    /**
     * Obtém o valor da propriedade stdMiddleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdMiddleName() {
        return stdMiddleName;
    }

    /**
     * Define o valor da propriedade stdMiddleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdMiddleName(String value) {
        this.stdMiddleName = value;
    }

    public boolean isSetStdMiddleName() {
        return (this.stdMiddleName!= null);
    }

    /**
     * Obtém o valor da propriedade string1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString1() {
        return string1;
    }

    /**
     * Define o valor da propriedade string1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString1(String value) {
        this.string1 = value;
    }

    public boolean isSetString1() {
        return (this.string1 != null);
    }

    /**
     * Obtém o valor da propriedade string10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString10() {
        return string10;
    }

    /**
     * Define o valor da propriedade string10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString10(String value) {
        this.string10 = value;
    }

    public boolean isSetString10() {
        return (this.string10 != null);
    }

    /**
     * Obtém o valor da propriedade string2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString2() {
        return string2;
    }

    /**
     * Define o valor da propriedade string2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString2(String value) {
        this.string2 = value;
    }

    public boolean isSetString2() {
        return (this.string2 != null);
    }

    /**
     * Obtém o valor da propriedade string3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString3() {
        return string3;
    }

    /**
     * Define o valor da propriedade string3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString3(String value) {
        this.string3 = value;
    }

    public boolean isSetString3() {
        return (this.string3 != null);
    }

    /**
     * Obtém o valor da propriedade string4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString4() {
        return string4;
    }

    /**
     * Define o valor da propriedade string4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString4(String value) {
        this.string4 = value;
    }

    public boolean isSetString4() {
        return (this.string4 != null);
    }

    /**
     * Obtém o valor da propriedade string5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString5() {
        return string5;
    }

    /**
     * Define o valor da propriedade string5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString5(String value) {
        this.string5 = value;
    }

    public boolean isSetString5() {
        return (this.string5 != null);
    }

    /**
     * Obtém o valor da propriedade string6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString6() {
        return string6;
    }

    /**
     * Define o valor da propriedade string6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString6(String value) {
        this.string6 = value;
    }

    public boolean isSetString6() {
        return (this.string6 != null);
    }

    /**
     * Obtém o valor da propriedade string7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString7() {
        return string7;
    }

    /**
     * Define o valor da propriedade string7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString7(String value) {
        this.string7 = value;
    }

    public boolean isSetString7() {
        return (this.string7 != null);
    }

    /**
     * Obtém o valor da propriedade string8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString8() {
        return string8;
    }

    /**
     * Define o valor da propriedade string8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString8(String value) {
        this.string8 = value;
    }

    public boolean isSetString8() {
        return (this.string8 != null);
    }

    /**
     * Obtém o valor da propriedade string9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString9() {
        return string9;
    }

    /**
     * Define o valor da propriedade string9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString9(String value) {
        this.string9 = value;
    }

    public boolean isSetString9() {
        return (this.string9 != null);
    }

    /**
     * Obtém o valor da propriedade suffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Define o valor da propriedade suffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    public boolean isSetSuffix() {
        return (this.suffix!= null);
    }

    /**
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Obtém o valor da propriedade vipFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIPFlag() {
        return vipFlag;
    }

    /**
     * Define o valor da propriedade vipFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIPFlag(String value) {
        this.vipFlag = value;
    }

    public boolean isSetVIPFlag() {
        return (this.vipFlag!= null);
    }

    /**
     * Obtém o valor da propriedade vetStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetStatus() {
        return vetStatus;
    }

    /**
     * Define o valor da propriedade vetStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetStatus(String value) {
        this.vetStatus = value;
    }

    public boolean isSetVetStatus() {
        return (this.vetStatus!= null);
    }

}
