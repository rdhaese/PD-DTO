package be.rdhaese.packetdelivery.dto.impl;

import be.rdhaese.packetdelivery.dto.ContactDetailsInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 27/12/2015.
 *
 * @author Robin D'Haese
 */
public class ContactDetailsDTO implements ContactDetailsInterface {

    private String companyName;
    private AddressDTO addressDTO;
    private String aboutText;
    private Map<String, String> phoneNumbers = new HashMap<String, String>();
    private Map<String, String> faxNumbers = new HashMap<String, String>();
    private Map<String, String> emailAddresses = new HashMap<String, String>();

    public ContactDetailsDTO() {
    }

    public ContactDetailsDTO(String street, String number, String mailbox, String city, String postalCode, String aboutText, String companyName, Map<String, String> phoneNumbers, Map<String, String> faxNumbers, Map<String, String> emailAddresses) {
        this(new AddressDTO(street, number, mailbox, city, postalCode), companyName, aboutText, phoneNumbers, faxNumbers, emailAddresses);
    }

    public ContactDetailsDTO(AddressDTO addressDTO, String companyName, String aboutText, Map<String, String> phoneNumbers, Map<String, String> faxNumbers, Map<String, String> emailAddresses) {
        this.addressDTO = addressDTO;
        this.companyName = companyName;
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
        return addressDTO.getStreet();
    }

    public void setStreet(String street) {
        addressDTO.setStreet(street);
    }

    public String getNumber() {
       return addressDTO.getNumber();
    }

    public void setNumber(String number) {
        addressDTO.setNumber(number);
    }

    public String getMailbox() {
       return addressDTO.getMailbox();
    }

    public void setMailbox(String mailbox) {
        addressDTO.setMailbox(mailbox);
    }

    public String getCity() {
        return addressDTO.getCity();
    }

    public void setCity(String city) {
        addressDTO.setCity(city);
    }

    public String getPostalCode() {
        return addressDTO.getPostalCode();
    }

    public void setPostalCode(String postalCode) {
        addressDTO.setPostalCode(postalCode);
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

}
