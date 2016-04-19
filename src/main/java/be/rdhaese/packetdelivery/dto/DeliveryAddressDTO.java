package be.rdhaese.packetdelivery.dto;

/**
 * Created on 16/01/2016.
 *
 * @author Robin D'Haese
 */
public class DeliveryAddressDTO extends AddressDTO{
    private String packetId;
    private String regionNameNl;
    private String regionNameFr;
    private String regionNameDe;
    private String regionNameEn;
    private String regionCode;

    public DeliveryAddressDTO() {
    }


    public DeliveryAddressDTO(String street, String number, String mailbox, String city, String postalCode, String packetId, String regionNameNl, String regionNameFr, String regionNameDe, String regionNameEn, String regionCode) {
        super(street, number, mailbox, city, postalCode);
        this.packetId = packetId;
        this.regionNameNl = regionNameNl;
        this.regionNameFr = regionNameFr;
        this.regionNameDe = regionNameDe;
        this.regionNameEn = regionNameEn;
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
        if (getRegionNameNl() != null ? !getRegionNameNl().equals(that.getRegionNameNl()) : that.getRegionNameNl() != null)
            return false;
        if (getRegionNameFr() != null ? !getRegionNameFr().equals(that.getRegionNameFr()) : that.getRegionNameFr() != null)
            return false;
        if (getRegionNameDe() != null ? !getRegionNameDe().equals(that.getRegionNameDe()) : that.getRegionNameDe() != null)
            return false;
        if (getRegionNameEn() != null ? !getRegionNameEn().equals(that.getRegionNameEn()) : that.getRegionNameEn() != null)
            return false;
        return !(getRegionCode() != null ? !getRegionCode().equals(that.getRegionCode()) : that.getRegionCode() != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getPacketId() != null ? getPacketId().hashCode() : 0);
        result = 31 * result + (getRegionNameNl() != null ? getRegionNameNl().hashCode() : 0);
        result = 31 * result + (getRegionNameFr() != null ? getRegionNameFr().hashCode() : 0);
        result = 31 * result + (getRegionNameDe() != null ? getRegionNameDe().hashCode() : 0);
        result = 31 * result + (getRegionNameEn() != null ? getRegionNameEn().hashCode() : 0);
        result = 31 * result + (getRegionCode() != null ? getRegionCode().hashCode() : 0);
        return result;
    }

    public String getPacketId() {
        return packetId;
    }

    public void setPacketId(String packetId) {
        this.packetId = packetId;
    }

    public String getRegionNameNl() {
        return regionNameNl;
    }

    public void setRegionNameNl(String regionNameNl) {
        this.regionNameNl = regionNameNl;
    }

    public String getRegionNameFr() {
        return regionNameFr;
    }

    public void setRegionNameFr(String regionNameFr) {
        this.regionNameFr = regionNameFr;
    }

    public String getRegionNameDe() {
        return regionNameDe;
    }

    public void setRegionNameDe(String regionNameDe) {
        this.regionNameDe = regionNameDe;
    }

    public String getRegionNameEn() {
        return regionNameEn;
    }

    public void setRegionNameEn(String regionNameEn) {
        this.regionNameEn = regionNameEn;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
}
