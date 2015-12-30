package be.rdhaese.packetdelivery.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 27/12/2015.
 *
 * @author Robin D'Haese
 */
public class ContactDetailsDTO implements Serializable {

    private String companyName;
    private String street;
    private String number;
    private String mailbox;
    private String city;
    private String postalCode;
    private String aboutText;
    private Map<String, String> phoneNumbers = new HashMap<String, String>();
    private Map<String, String> faxNumbers = new HashMap<String, String>();
    private Map<String, String> emailAddresses = new HashMap<String, String>();

    public ContactDetailsDTO() {
    }

    public ContactDetailsDTO(String companyName, String street, String number, String mailbox, String city, String postalCode, String aboutText, Map<String, String> phoneNumbers, Map<String, String> faxNumbers, Map<String, String> emailAddresses) {
        this.companyName = companyName;
        this.street = street;
        this.number = number;
        this.mailbox = mailbox;
        this.city = city;
        this.postalCode = postalCode;
        this.aboutText = aboutText;
        this.phoneNumbers = phoneNumbers;
        this.faxNumbers = faxNumbers;
        this.emailAddresses = emailAddresses;
    }

    public void addPhoneNumber(String title, String phoneNumber) {
        phoneNumbers.put(title, phoneNumber);
    }

    public void addFaxNumber(String title, String faxNumber) {
        faxNumbers.put(title, faxNumber);
    }

    public void addEmailAddress(String title, String emailAddress) {
        emailAddresses.put(title, emailAddress);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactDetailsDTO that = (ContactDetailsDTO) o;

        if (getCompanyName() != null ? !getCompanyName().equals(that.getCompanyName()) : that.getCompanyName() != null)
            return false;
        if (getStreet() != null ? !getStreet().equals(that.getStreet()) : that.getStreet() != null) return false;
        if (getNumber() != null ? !getNumber().equals(that.getNumber()) : that.getNumber() != null) return false;
        if (getMailbox() != null ? !getMailbox().equals(that.getMailbox()) : that.getMailbox() != null) return false;
        if (getCity() != null ? !getCity().equals(that.getCity()) : that.getCity() != null) return false;
        if (getPostalCode() != null ? !getPostalCode().equals(that.getPostalCode()) : that.getPostalCode() != null)
            return false;
        if (aboutText != null ? !aboutText.equals(that.aboutText) : that.aboutText != null) return false;
        if (getPhoneNumbers() != null ? !getPhoneNumbers().equals(that.getPhoneNumbers()) : that.getPhoneNumbers() != null)
            return false;
        if (getFaxNumbers() != null ? !getFaxNumbers().equals(that.getFaxNumbers()) : that.getFaxNumbers() != null)
            return false;
        return !(getEmailAddresses() != null ? !getEmailAddresses().equals(that.getEmailAddresses()) : that.getEmailAddresses() != null);

    }

    @Override
    public int hashCode() {
        int result = getCompanyName() != null ? getCompanyName().hashCode() : 0;
        result = 31 * result + (getStreet() != null ? getStreet().hashCode() : 0);
        result = 31 * result + (getNumber() != null ? getNumber().hashCode() : 0);
        result = 31 * result + (getMailbox() != null ? getMailbox().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        result = 31 * result + (getPostalCode() != null ? getPostalCode().hashCode() : 0);
        result = 31 * result + (aboutText != null ? aboutText.hashCode() : 0);
        result = 31 * result + (getPhoneNumbers() != null ? getPhoneNumbers().hashCode() : 0);
        result = 31 * result + (getFaxNumbers() != null ? getFaxNumbers().hashCode() : 0);
        result = 31 * result + (getEmailAddresses() != null ? getEmailAddresses().hashCode() : 0);
        return result;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAboutText() {
        return aboutText;
    }

    public void setAboutText(String aboutText) {
        this.aboutText = aboutText;
    }

    public Map<String, String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Map<String, String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Map<String, String> getFaxNumbers() {
        return faxNumbers;
    }

    public void setFaxNumbers(Map<String, String> faxNumbers) {
        this.faxNumbers = faxNumbers;
    }

    public Map<String, String> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(Map<String, String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public static void main(String... args){
        int i = 0;
        while (i<3){
            char c = (char)(73 * (i * (3 * i)));
            System.out.println(c);
            i++;
        }
    }
}
