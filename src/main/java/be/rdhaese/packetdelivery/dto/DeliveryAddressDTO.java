package be.rdhaese.packetdelivery.dto;

/**
 * Created on 16/01/2016.
 *
 * @author Robin D'Haese
 */
public class DeliveryAddressDTO extends AddressDTO{
    private String packetId;
    private String regionName;
    private String regionCode;

    public DeliveryAddressDTO() {
    }


    public DeliveryAddressDTO(String packetId, String street, String number, String mailbox, String city, String postalCode, String regionName, String regionCode) {
        super(street, number, mailbox, city, postalCode);
        this.packetId = packetId;
        this.regionName = regionName;
        this.regionCode = regionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeliveryAddressDTO that = (DeliveryAddressDTO) o;

        if (getPacketId() != null ? !getPacketId().equals(that.getPacketId()) : that.getPacketId() != null)
            return false;
        if (getRegionName() != null ? !getRegionName().equals(that.getRegionName()) : that.getRegionName() != null)
            return false;
        return !(getRegionCode() != null ? !getRegionCode().equals(that.getRegionCode()) : that.getRegionCode() != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
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
}
