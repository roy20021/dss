//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.03 at 02:49:40 PM CEST 
//


package eu.europa.esig.jaxb.policy;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Group of checks related to a certificate
 * 
 * <p>Java class for CertificateConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateConstraints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Recognition" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="Signature" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="NotExpired" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="AuthorityInfoAccessPresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="RevocationInfoAccessPresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="RevocationDataAvailable" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="RevocationDataNextUpdatePresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="RevocationDataFreshness" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="RevocationCertHashMatch" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="KeyUsage" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="CommonName" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="Pseudonym" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationUnit" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationName" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumberPresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="NotRevoked" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="NotOnHold" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SelfSigned" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="NotSelfSigned" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="PolicyIds" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="QCStatementIds" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="Qualification" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SupportedByQSCD" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="IssuedToNaturalPerson" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="IssuedToLegalPerson" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="UsePseudonym" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="Cryptographic" type="{http://dss.esig.europa.eu/validation/policy}CryptographicConstraint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateConstraints", propOrder = {
    "recognition",
    "signature",
    "notExpired",
    "authorityInfoAccessPresent",
    "revocationInfoAccessPresent",
    "revocationDataAvailable",
    "revocationDataNextUpdatePresent",
    "revocationDataFreshness",
    "revocationCertHashMatch",
    "keyUsage",
    "surname",
    "givenName",
    "commonName",
    "pseudonym",
    "organizationUnit",
    "organizationName",
    "country",
    "serialNumberPresent",
    "notRevoked",
    "notOnHold",
    "selfSigned",
    "notSelfSigned",
    "policyIds",
    "qcStatementIds",
    "qualification",
    "supportedByQSCD",
    "issuedToNaturalPerson",
    "issuedToLegalPerson",
    "usePseudonym",
    "cryptographic"
})
public class CertificateConstraints
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Recognition")
    protected LevelConstraint recognition;
    @XmlElement(name = "Signature")
    protected LevelConstraint signature;
    @XmlElement(name = "NotExpired")
    protected LevelConstraint notExpired;
    @XmlElement(name = "AuthorityInfoAccessPresent")
    protected LevelConstraint authorityInfoAccessPresent;
    @XmlElement(name = "RevocationInfoAccessPresent")
    protected LevelConstraint revocationInfoAccessPresent;
    @XmlElement(name = "RevocationDataAvailable")
    protected LevelConstraint revocationDataAvailable;
    @XmlElement(name = "RevocationDataNextUpdatePresent")
    protected LevelConstraint revocationDataNextUpdatePresent;
    @XmlElement(name = "RevocationDataFreshness")
    protected LevelConstraint revocationDataFreshness;
    @XmlElement(name = "RevocationCertHashMatch")
    protected LevelConstraint revocationCertHashMatch;
    @XmlElement(name = "KeyUsage")
    protected MultiValuesConstraint keyUsage;
    @XmlElement(name = "Surname")
    protected MultiValuesConstraint surname;
    @XmlElement(name = "GivenName")
    protected MultiValuesConstraint givenName;
    @XmlElement(name = "CommonName")
    protected MultiValuesConstraint commonName;
    @XmlElement(name = "Pseudonym")
    protected MultiValuesConstraint pseudonym;
    @XmlElement(name = "OrganizationUnit")
    protected MultiValuesConstraint organizationUnit;
    @XmlElement(name = "OrganizationName")
    protected MultiValuesConstraint organizationName;
    @XmlElement(name = "Country")
    protected MultiValuesConstraint country;
    @XmlElement(name = "SerialNumberPresent")
    protected LevelConstraint serialNumberPresent;
    @XmlElement(name = "NotRevoked")
    protected LevelConstraint notRevoked;
    @XmlElement(name = "NotOnHold")
    protected LevelConstraint notOnHold;
    @XmlElement(name = "SelfSigned")
    protected LevelConstraint selfSigned;
    @XmlElement(name = "NotSelfSigned")
    protected LevelConstraint notSelfSigned;
    @XmlElement(name = "PolicyIds")
    protected MultiValuesConstraint policyIds;
    @XmlElement(name = "QCStatementIds")
    protected MultiValuesConstraint qcStatementIds;
    @XmlElement(name = "Qualification")
    protected LevelConstraint qualification;
    @XmlElement(name = "SupportedByQSCD")
    protected LevelConstraint supportedByQSCD;
    @XmlElement(name = "IssuedToNaturalPerson")
    protected LevelConstraint issuedToNaturalPerson;
    @XmlElement(name = "IssuedToLegalPerson")
    protected LevelConstraint issuedToLegalPerson;
    @XmlElement(name = "UsePseudonym")
    protected LevelConstraint usePseudonym;
    @XmlElement(name = "Cryptographic")
    protected CryptographicConstraint cryptographic;

    /**
     * Gets the value of the recognition property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getRecognition() {
        return recognition;
    }

    /**
     * Sets the value of the recognition property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setRecognition(LevelConstraint value) {
        this.recognition = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSignature(LevelConstraint value) {
        this.signature = value;
    }

    /**
     * Gets the value of the notExpired property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getNotExpired() {
        return notExpired;
    }

    /**
     * Sets the value of the notExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setNotExpired(LevelConstraint value) {
        this.notExpired = value;
    }

    /**
     * Gets the value of the authorityInfoAccessPresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getAuthorityInfoAccessPresent() {
        return authorityInfoAccessPresent;
    }

    /**
     * Sets the value of the authorityInfoAccessPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setAuthorityInfoAccessPresent(LevelConstraint value) {
        this.authorityInfoAccessPresent = value;
    }

    /**
     * Gets the value of the revocationInfoAccessPresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getRevocationInfoAccessPresent() {
        return revocationInfoAccessPresent;
    }

    /**
     * Sets the value of the revocationInfoAccessPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setRevocationInfoAccessPresent(LevelConstraint value) {
        this.revocationInfoAccessPresent = value;
    }

    /**
     * Gets the value of the revocationDataAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getRevocationDataAvailable() {
        return revocationDataAvailable;
    }

    /**
     * Sets the value of the revocationDataAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setRevocationDataAvailable(LevelConstraint value) {
        this.revocationDataAvailable = value;
    }

    /**
     * Gets the value of the revocationDataNextUpdatePresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getRevocationDataNextUpdatePresent() {
        return revocationDataNextUpdatePresent;
    }

    /**
     * Sets the value of the revocationDataNextUpdatePresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setRevocationDataNextUpdatePresent(LevelConstraint value) {
        this.revocationDataNextUpdatePresent = value;
    }

    /**
     * Gets the value of the revocationDataFreshness property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getRevocationDataFreshness() {
        return revocationDataFreshness;
    }

    /**
     * Sets the value of the revocationDataFreshness property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setRevocationDataFreshness(LevelConstraint value) {
        this.revocationDataFreshness = value;
    }

    /**
     * Gets the value of the revocationCertHashMatch property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getRevocationCertHashMatch() {
        return revocationCertHashMatch;
    }

    /**
     * Sets the value of the revocationCertHashMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setRevocationCertHashMatch(LevelConstraint value) {
        this.revocationCertHashMatch = value;
    }

    /**
     * Gets the value of the keyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getKeyUsage() {
        return keyUsage;
    }

    /**
     * Sets the value of the keyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setKeyUsage(MultiValuesConstraint value) {
        this.keyUsage = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setSurname(MultiValuesConstraint value) {
        this.surname = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setGivenName(MultiValuesConstraint value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the commonName property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getCommonName() {
        return commonName;
    }

    /**
     * Sets the value of the commonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setCommonName(MultiValuesConstraint value) {
        this.commonName = value;
    }

    /**
     * Gets the value of the pseudonym property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getPseudonym() {
        return pseudonym;
    }

    /**
     * Sets the value of the pseudonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setPseudonym(MultiValuesConstraint value) {
        this.pseudonym = value;
    }

    /**
     * Gets the value of the organizationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getOrganizationUnit() {
        return organizationUnit;
    }

    /**
     * Sets the value of the organizationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setOrganizationUnit(MultiValuesConstraint value) {
        this.organizationUnit = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setOrganizationName(MultiValuesConstraint value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setCountry(MultiValuesConstraint value) {
        this.country = value;
    }

    /**
     * Gets the value of the serialNumberPresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSerialNumberPresent() {
        return serialNumberPresent;
    }

    /**
     * Sets the value of the serialNumberPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSerialNumberPresent(LevelConstraint value) {
        this.serialNumberPresent = value;
    }

    /**
     * Gets the value of the notRevoked property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getNotRevoked() {
        return notRevoked;
    }

    /**
     * Sets the value of the notRevoked property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setNotRevoked(LevelConstraint value) {
        this.notRevoked = value;
    }

    /**
     * Gets the value of the notOnHold property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getNotOnHold() {
        return notOnHold;
    }

    /**
     * Sets the value of the notOnHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setNotOnHold(LevelConstraint value) {
        this.notOnHold = value;
    }

    /**
     * Gets the value of the selfSigned property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSelfSigned() {
        return selfSigned;
    }

    /**
     * Sets the value of the selfSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSelfSigned(LevelConstraint value) {
        this.selfSigned = value;
    }

    /**
     * Gets the value of the notSelfSigned property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getNotSelfSigned() {
        return notSelfSigned;
    }

    /**
     * Sets the value of the notSelfSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setNotSelfSigned(LevelConstraint value) {
        this.notSelfSigned = value;
    }

    /**
     * Gets the value of the policyIds property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getPolicyIds() {
        return policyIds;
    }

    /**
     * Sets the value of the policyIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setPolicyIds(MultiValuesConstraint value) {
        this.policyIds = value;
    }

    /**
     * Gets the value of the qcStatementIds property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getQCStatementIds() {
        return qcStatementIds;
    }

    /**
     * Sets the value of the qcStatementIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setQCStatementIds(MultiValuesConstraint value) {
        this.qcStatementIds = value;
    }

    /**
     * Gets the value of the qualification property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getQualification() {
        return qualification;
    }

    /**
     * Sets the value of the qualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setQualification(LevelConstraint value) {
        this.qualification = value;
    }

    /**
     * Gets the value of the supportedByQSCD property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSupportedByQSCD() {
        return supportedByQSCD;
    }

    /**
     * Sets the value of the supportedByQSCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSupportedByQSCD(LevelConstraint value) {
        this.supportedByQSCD = value;
    }

    /**
     * Gets the value of the issuedToNaturalPerson property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getIssuedToNaturalPerson() {
        return issuedToNaturalPerson;
    }

    /**
     * Sets the value of the issuedToNaturalPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setIssuedToNaturalPerson(LevelConstraint value) {
        this.issuedToNaturalPerson = value;
    }

    /**
     * Gets the value of the issuedToLegalPerson property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getIssuedToLegalPerson() {
        return issuedToLegalPerson;
    }

    /**
     * Sets the value of the issuedToLegalPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setIssuedToLegalPerson(LevelConstraint value) {
        this.issuedToLegalPerson = value;
    }

    /**
     * Gets the value of the usePseudonym property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getUsePseudonym() {
        return usePseudonym;
    }

    /**
     * Sets the value of the usePseudonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setUsePseudonym(LevelConstraint value) {
        this.usePseudonym = value;
    }

    /**
     * Gets the value of the cryptographic property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicConstraint }
     *     
     */
    public CryptographicConstraint getCryptographic() {
        return cryptographic;
    }

    /**
     * Sets the value of the cryptographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicConstraint }
     *     
     */
    public void setCryptographic(CryptographicConstraint value) {
        this.cryptographic = value;
    }

}
