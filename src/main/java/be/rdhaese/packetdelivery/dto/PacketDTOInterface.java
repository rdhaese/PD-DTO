package be.rdhaese.packetdelivery.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created on 7/03/2016.
 *
 * @author Robin D'Haese
 */
public interface PacketDTOInterface extends Serializable{

     String getPacketId();
     String getPacketStatus();
     Date getStatusChangedOn();
     String getClientName();
     String getClientPhone();
     String getClientEmail();
     String getClientStreet() ;
     String getClientNumber();
     String getClientMailbox();
     String getClientCity();
     String getClientPostalCode();
     String getDeliveryName();
     String getDeliveryPhone();
     String getDeliveryEmail();
     String getDeliveryStreet() ;
     String getDeliveryNumber();
     String getDeliveryMailbox();
     String getDeliveryCity();
     String getDeliveryPostalCode();
     String getDeliverRegionName();
     String getDeliveryRegionCode();
}
