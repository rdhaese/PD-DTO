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
    private String deliveryRegionName;
    private String deliveryRegionCode;

    public PacketDTO() {
    }

    public PacketDTO(String packetId, String packetStatus, Date statusChangedOn, String clientName, String clientPhone, String clientEmail, String clientStreet, String clientNumber, String clientMailbox, String clientCity, String clientPostalCode, String deliveryName, String deliveryPhone, String deliveryEmail, String deliveryStreet, String deliveryNumber, String deliveryMailbox, String deliveryCity, String deliveryPostalCode, String deliveryRegionName, String deliveryRegionCode) {
        this.packetId = packetId;
        this.packetStatus = packetStatus;
        this.statusChangedOn = statusChangedOn;
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.clientEmail = clientEmail;
        this.clientStreet = clientStreet;
        this.clientNumber = clientNumber;
        this.clientMailbox = clientMailbox;
        this.clientCity = clientCity;
        this.clientPostalCode = clientPostalCode;
        this.deliveryName = deliveryName;
        this.deliveryPhone = deliveryPhone;
        this.deliveryEmail = deliveryEmail;
        this.deliveryStreet = deliveryStreet;
        this.deliveryNumber = deliveryNumber;
        this.deliveryMailbox = deliveryMailbox;
        this.deliveryCity = deliveryCity;
        this.deliveryPostalCode = deliveryPostalCode;
        this.deliveryRegionName = deliveryRegionName;
        this.deliveryRegionCode = deliveryRegionCode;
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
        if (getDeliveryRegionName() != null ? !getDeliveryRegionName().equals(packetDTO.getDeliveryRegionName()) : packetDTO.getDeliveryRegionName() != null)
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
        result = 31 * result + (getDeliveryRegionName() != null ? getDeliveryRegionName().hashCode() : 0);
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

    public String getDeliveryRegionName() {

        return deliveryRegionName;
    }

    public void setDeliveryRegionName(String deliveryRegionName) {
        this.deliveryRegionName = deliveryRegionName;
    }

    public String getDeliveryRegionCode() {
        return deliveryRegionCode;
    }

    public void setDeliveryRegionCode(String deliveryRegionCode) {
        this.deliveryRegionCode = deliveryRegionCode;
    }
}
