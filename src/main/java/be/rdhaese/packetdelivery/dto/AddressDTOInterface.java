package be.rdhaese.packetdelivery.dto;

import java.io.Serializable;

/**
 * Created on 7/03/2016.
 *
 * @author Robin D'Haese
 */
public interface AddressDTOInterface extends Serializable {

     String getStreet();
     String getNumber();
     String getMailbox();
     String getCity();
     String getPostalCode();

}
