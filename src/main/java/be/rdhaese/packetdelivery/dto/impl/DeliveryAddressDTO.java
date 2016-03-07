package be.rdhaese.packetdelivery.dto.impl;

import be.rdhaese.packetdelivery.dto.DeliveryAddressDTOInterface;

/**
 * Created on 16/01/2016.
 *
 * @author Robin D'Haese
 */
public class DeliveryAddressDTO implements DeliveryAddressDTOInterface {

    private AddressDTO addressDTO;

    private String packetId;
    private String regionName;
    private String regionCode;

    public DeliveryAddressDTO() {
    }


    public DeliveryAddressDTO(AddressDTO addressDTO, String packetId, String regionName, String regionCode) {
        this.addressDTO = addressDTO;
        this.packetId = packetId;
        this.regionName = regionName;
        this.regionCode = regionCode;
    }

    public DeliveryAddressDTO(String street, String number, String mailbox, String city, String postalCode, String packetId, String regionName, String regionCode) {
        this(new AddressDTO(street, number, mailbox, city, postalCode), packetId, regionName, regionCode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeliveryAddressDTO that = (DeliveryAddressDTO) o;

        if (getAddressDTO() != null ? !getAddressDTO().equals(that.getAddressDTO()) : that.getAddressDTO() != null)
            return false;
        if (getPacketId() != null ? !getPacketId().equals(that.getPacketId()) : that.getPacketId() != null)
            return false;
        if (getRegionName() != null ? !getRegionName().equals(that.getRegionName()) : that.getRegionName() != null)
            return false;
        return !(getRegionCode() != null ? !getRegionCode().equals(that.getRegionCode()) : that.getRegionCode() != null);

    }

    @Override
    public int hashCode() {
        int result = getAddressDTO() != null ? getAddressDTO().hashCode() : 0;
        result = 31 * result + (getPacketId() != null ? getPacketId().hashCode() : 0);
        result = 31 * result + (getRegionName() != null ? getRegionName().hashCode() : 0);
        result = 31 * result + (getRegionCode() != null ? getRegionCode().hashCode() : 0);
        return result;
    }

    public String getPacketId() {
        return packetId;
    }

    public void setPacketId(String packetId) {
        this.packetId = packetId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
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

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
    }
}
