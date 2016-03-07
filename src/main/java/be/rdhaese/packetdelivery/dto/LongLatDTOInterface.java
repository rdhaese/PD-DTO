package be.rdhaese.packetdelivery.dto;

import java.io.Serializable;

/**
 * Created on 7/03/2016.
 *
 * @author Robin D'Haese
 */
public interface LongLatDTOInterface extends Serializable {

     Double getLongitude();
     Double getLatitude();
}
