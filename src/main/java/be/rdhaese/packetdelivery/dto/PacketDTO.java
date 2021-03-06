package be.rdhaese.packetdelivery.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created on 23/12/2015.
 *
 * @author Robin D'Haese
 */
public class PacketDTO implements Serializable {

    //Packet specific properties
    private String packetId;
    private String packetStatus;
    private Date statusChangedOn;

    //Client Properties
    private String clientName;
    private String clientPhone;
    private String clientEmail;
    private String clientStreet;
    private String clientNumber;
    private String clientMailbox;
    private String clientCity;
    private String clientPostalCode;

    //Delivery Properties
    private String deliveryName;
    private String deliveryPhone;
    private String deliveryEmail;
    private String deliveryStreet;
    private String deliveryNumber;
    private String deliveryMailbox;
    private String deliveryCity;
    private String deliveryPostalCode;
    private String deliveryRegionNameNl;
    private String deliveryRegionNameFr;
    private String deliveryRegionNameDe;
    private String deliveryRegionNameEn;
    private String deliveryRegionCode;

    public PacketDTO() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PacketDTO packetDTO = (PacketDTO) o;

        if (getPacketId() != null ? !getPacketId().equals(packetDTO.getPacketId()) : packetDTO.getPacketId() != null)
            return false;
        if (getPacketStatus() != null ? !getPacketStatus().equals(packetDTO.getPacketStatus()) : packetDTO.getPacketStatus() != null)
            return false;
        if (getStatusChangedOn() != null ? !getStatusChangedOn().equals(packetDTO.getStatusChangedOn()) : packetDTO.getStatusChangedOn() != null)
            return false;
        if (getClientName() != null ? !getClientName().equals(packetDTO.getClientName()) : packetDTO.getClientName() != null)
            return false;
        if (getClientPhone() != null ? !getClientPhone().equals(packetDTO.getClientPhone()) : packetDTO.getClientPhone() != null)
            return false;
        if (getClientEmail() != null ? !getClientEmail().equals(packetDTO.getClientEmail()) : packetDTO.getClientEmail() != null)
            return false;
        if (getClientStreet() != null ? !getClientStreet().equals(packetDTO.getClientStreet()) : packetDTO.getClientStreet() != null)
            return false;
        if (getClientNumber() != null ? !getClientNumber().equals(packetDTO.getClientNumber()) : packetDTO.getClientNumber() != null)
            return false;
        if (getClientMailbox() != null ? !getClientMailbox().equals(packetDTO.getClientMailbox()) : packetDTO.getClientMailbox() != null)
            return false;
        if (getClientCity() != null ? !getClientCity().equals(packetDTO.getClientCity()) : packetDTO.getClientCity() != null)
            return false;
        if (getClientPostalCode() != null ? !getClientPostalCode().equals(packetDTO.getClientPostalCode()) : packetDTO.getClientPostalCode() != null)
            return false;
        if (getDeliveryName() != null ? !getDeliveryName().equals(packetDTO.getDeliveryName()) : packetDTO.getDeliveryName() != null)
            return false;
        if (getDeliveryPhone() != null ? !getDeliveryPhone().equals(packetDTO.getDeliveryPhone()) : packetDTO.getDeliveryPhone() != null)
            return false;
        if (getDeliveryEmail() != null ? !getDeliveryEmail().equals(packetDTO.getDeliveryEmail()) : packetDTO.getDeliveryEmail() != null)
            return false;
        if (getDeliveryStreet() != null ? !getDeliveryStreet().equals(packetDTO.getDeliveryStreet()) : packetDTO.getDeliveryStreet() != null)
            return false;
        if (getDeliveryNumber() != null ? !getDeliveryNumber().equals(packetDTO.getDeliveryNumber()) : packetDTO.getDeliveryNumber() != null)
            return false;
        if (getDeliveryMailbox() != null ? !getDeliveryMailbox().equals(packetDTO.getDeliveryMailbox()) : packetDTO.getDeliveryMailbox() != null)
            return false;
        if (getDeliveryCity() != null ? !getDeliveryCity().equals(packetDTO.getDeliveryCity()) : packetDTO.getDeliveryCity() != null)
            return false;
        if (getDeliveryPostalCode() != null ? !getDeliveryPostalCode().equals(packetDTO.getDeliveryPostalCode()) : packetDTO.getDeliveryPostalCode() != null)
            return false;
        if (getDeliveryRegionNameNl() != null ? !getDeliveryRegionNameNl().equals(packetDTO.getDeliveryRegionNameNl()) : packetDTO.getDeliveryRegionNameNl() != null)
            return false;
        if (getDeliveryRegionNameFr() != null ? !getDeliveryRegionNameFr().equals(packetDTO.getDeliveryRegionNameFr()) : packetDTO.getDeliveryRegionNameFr() != null)
            return false;
        if (getDeliveryRegionNameDe() != null ? !getDeliveryRegionNameDe().equals(packetDTO.getDeliveryRegionNameDe()) : packetDTO.getDeliveryRegionNameDe() != null)
            return false;
        if (getDeliveryRegionNameEn() != null ? !getDeliveryRegionNameEn().equals(packetDTO.getDeliveryRegionNameEn()) : packetDTO.getDeliveryRegionNameEn() != null)
            return false;
        return !(getDeliveryRegionCode() != null ? !getDeliveryRegionCode().equals(packetDTO.getDeliveryRegionCode()) : packetDTO.getDeliveryRegionCode() != null);

    }

    @Override
    public int hashCode() {
        int result = getPacketId() != null ? getPacketId().hashCode() : 0;
        result = 31 * result + (getPacketStatus() != null ? getPacketStatus().hashCode() : 0);
        result = 31 * result + (getStatusChangedOn() != null ? getStatusChangedOn().hashCode() : 0);
        result = 31 * result + (getClientName() != null ? getClientName().hashCode() : 0);
        result = 31 * result + (getClientPhone() != null ? getClientPhone().hashCode() : 0);
        result = 31 * result + (getClientEmail() != null ? getClientEmail().hashCode() : 0);
        result = 31 * result + (getClientStreet() != null ? getClientStreet().hashCode() : 0);
        result = 31 * result + (getClientNumber() != null ? getClientNumber().hashCode() : 0);
        result = 31 * result + (getClientMailbox() != null ? getClientMailbox().hashCode() : 0);
        result = 31 * result + (getClientCity() != null ? getClientCity().hashCode() : 0);
        result = 31 * result + (getClientPostalCode() != null ? getClientPostalCode().hashCode() : 0);
        result = 31 * result + (getDeliveryName() != null ? getDeliveryName().hashCode() : 0);
        result = 31 * result + (getDeliveryPhone() != null ? getDeliveryPhone().hashCode() : 0);
        result = 31 * result + (getDeliveryEmail() != null ? getDeliveryEmail().hashCode() : 0);
        result = 31 * result + (getDeliveryStreet() != null ? getDeliveryStreet().hashCode() : 0);
        result = 31 * result + (getDeliveryNumber() != null ? getDeliveryNumber().hashCode() : 0);
        result = 31 * result + (getDeliveryMailbox() != null ? getDeliveryMailbox().hashCode() : 0);
        result = 31 * result + (getDeliveryCity() != null ? getDeliveryCity().hashCode() : 0);
        result = 31 * result + (getDeliveryPostalCode() != null ? getDeliveryPostalCode().hashCode() : 0);
        result = 31 * result + (getDeliveryRegionNameNl() != null ? getDeliveryRegionNameNl().hashCode() : 0);
        result = 31 * result + (getDeliveryRegionNameFr() != null ? getDeliveryRegionNameFr().hashCode() : 0);
        result = 31 * result + (getDeliveryRegionNameDe() != null ? getDeliveryRegionNameDe().hashCode() : 0);
        result = 31 * result + (getDeliveryRegionNameEn() != null ? getDeliveryRegionNameEn().hashCode() : 0);
        result = 31 * result + (getDeliveryRegionCode() != null ? getDeliveryRegionCode().hashCode() : 0);
        return result;
    }

    public String getPacketId() {
        return packetId;
    }

    public void setPacketId(String packetId) {
        this.packetId = packetId;
    }

    public String getPacketStatus() {
        return packetStatus;
    }

    public void setPacketStatus(String packetStatus) {
        this.packetStatus = packetStatus;
    }

    public Date getStatusChangedOn() {
        return statusChangedOn;
    }

    public void setStatusChangedOn(Date statusChangedOn) {
        this.statusChangedOn = statusChangedOn;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientStreet() {
        return clientStreet;
    }

    public void setClientStreet(String clientStreet) {
        this.clientStreet = clientStreet;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getClientMailbox() {
        return clientMailbox;
    }

    public void setClientMailbox(String clientMailbox) {
        this.clientMailbox = clientMailbox;
    }

    public String getClientCity() {
        return clientCity;
    }

    public void setClientCity(String clientCity) {
        this.clientCity = clientCity;
    }

    public String getClientPostalCode() {
        return clientPostalCode;
    }

    public void setClientPostalCode(String clientPostalCode) {
        this.clientPostalCode = clientPostalCode;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryPhone() {
        return deliveryPhone;
    }

    public void setDeliveryPhone(String deliveryPhone) {
        this.deliveryPhone = deliveryPhone;
    }

    public String getDeliveryEmail() {
        return deliveryEmail;
    }

    public void setDeliveryEmail(String deliveryEmail) {
        this.deliveryEmail = deliveryEmail;
    }

    public String getDeliveryStreet() {
        return deliveryStreet;
    }

    public void setDeliveryStreet(String deliveryStreet) {
        this.deliveryStreet = deliveryStreet;
    }

    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getDeliveryMailbox() {
        return deliveryMailbox;
    }

    public void setDeliveryMailbox(String deliveryMailbox) {
        this.deliveryMailbox = deliveryMailbox;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public String getDeliveryPostalCode() {
        return deliveryPostalCode;
    }

    public void setDeliveryPostalCode(String deliveryPostalCode) {
        this.deliveryPostalCode = deliveryPostalCode;
    }

    public String getDeliveryRegionNameNl() {
        return deliveryRegionNameNl;
    }

    public void setDeliveryRegionNameNl(String deliveryRegionNameNl) {
        this.deliveryRegionNameNl = deliveryRegionNameNl;
    }

    public String getDeliveryRegionNameFr() {
        return deliveryRegionNameFr;
    }

    public void setDeliveryRegionNameFr(String deliveryRegionNameFr) {
        this.deliveryRegionNameFr = deliveryRegionNameFr;
    }

    public String getDeliveryRegionNameDe() {
        return deliveryRegionNameDe;
    }

    public void setDeliveryRegionNameDe(String deliveryRegionNameDe) {
        this.deliveryRegionNameDe = deliveryRegionNameDe;
    }

    public String getDeliveryRegionNameEn() {
        return deliveryRegionNameEn;
    }

    public void setDeliveryRegionNameEn(String deliveryRegionNameEn) {
        this.deliveryRegionNameEn = deliveryRegionNameEn;
    }

    public String getDeliveryRegionCode() {
        return deliveryRegionCode;
    }

    public void setDeliveryRegionCode(String deliveryRegionCode) {
        this.deliveryRegionCode = deliveryRegionCode;
    }
}
