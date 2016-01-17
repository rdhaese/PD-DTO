package be.rdhaese.packetdelivery.dto;

/**
 * Created on 16/01/2016.
 *
 * @author Robin D'Haese
 */
public class DeliveryAddressDTO {
    private String packetId;
    private String street;
    private String number;
    private String mailbox;
    private String city;
    private String postalCode;
    private String regionName;
    private String regionCode;

    public DeliveryAddressDTO() {
    }

    public DeliveryAddressDTO(String packetId, String street, String number, String mailbox, String city, String postalCode, String regionName, String regionCode) {
        this.packetId = packetId;
        this.street = street;
        this.number = number;
        this.mailbox = mailbox;
        this.city = city;
        this.postalCode = postalCode;
        this.regionName = regionName;
        this.regionCode = regionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeliveryAddressDTO that = (DeliveryAddressDTO) o;

        if (packetId != null ? !packetId.equals(that.packetId) : that.packetId != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (mailbox != null ? !mailbox.equals(that.mailbox) : that.mailbox != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
        if (regionName != null ? !regionName.equals(that.regionName) : that.regionName != null) return false;
        return !(regionCode != null ? !regionCode.equals(that.regionCode) : that.regionCode != null);

    }

    @Override
    public int hashCode() {
        int result = packetId != null ? packetId.hashCode() : 0;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (mailbox != null ? mailbox.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (regionName != null ? regionName.hashCode() : 0);
        result = 31 * result + (regionCode != null ? regionCode.hashCode() : 0);
        return result;
    }

    public String getPacketId() {
        return packetId;
    }

    public void setPacketId(String packetId) {
        this.packetId = packetId;
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
}
