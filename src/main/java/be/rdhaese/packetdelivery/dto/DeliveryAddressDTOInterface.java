package be.rdhaese.packetdelivery.dto;

/**
 * Created on 7/03/2016.
 *
 * @author Robin D'Haese
 */
public interface DeliveryAddressDTOInterface extends AddressDTOInterface {

     String getPacketId();

     String getRegionName();

     String getRegionCode();
}
