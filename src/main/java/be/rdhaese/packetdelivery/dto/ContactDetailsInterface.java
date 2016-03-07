package be.rdhaese.packetdelivery.dto;

import java.io.Serializable;
import java.util.Map;

/**
 * Created on 7/03/2016.
 *
 * @author Robin D'Haese
 */
public interface ContactDetailsInterface extends AddressDTOInterface {

     String getCompanyName();
     String getAboutText();
     Map<String, String> getPhoneNumbers() ;
     Map<String, String> getFaxNumbers();
     Map<String, String> getEmailAddresses();
}
