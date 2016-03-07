package be.rdhaese.packetdelivery.dto.impl;

import be.rdhaese.packetdelivery.dto.LongLatDTOInterface;

/**
 * Created on 21/02/2016.
 *
 * @author Robin D'Haese
 */
public class LongLatDTO implements LongLatDTOInterface {
    private Double longitude;
    private Double latitude;

    public LongLatDTO() {

    }

    public LongLatDTO(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LongLatDTO that = (LongLatDTO) o;

        if (getLongitude() != null ? !getLongitude().equals(that.getLongitude()) : that.getLongitude() != null)
            return false;
        return !(getLatitude() != null ? !getLatitude().equals(that.getLatitude()) : that.getLatitude() != null);

    }

    @Override
    public int hashCode() {
        int result = getLongitude() != null ? getLongitude().hashCode() : 0;
        result = 31 * result + (getLatitude() != null ? getLatitude().hashCode() : 0);
        return result;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
