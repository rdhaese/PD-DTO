package be.rdhaese.packetdelivery.dto;

import java.util.Date;

/**
 * Created on 19/04/2016.
 *
 * @author Robin D'Haese
 */
public class LocationUpdateDTO {

    private Date timeCreated;
    private Double longitude;
    private Double latitude;

    public LocationUpdateDTO() {
    }

    public LocationUpdateDTO(Date timeCreated, Double longitude, Double latitude) {
        this.timeCreated = timeCreated;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocationUpdateDTO that = (LocationUpdateDTO) o;

        if (getTimeCreated() != null ? !getTimeCreated().equals(that.getTimeCreated()) : that.getTimeCreated() != null)
            return false;
        if (getLongitude() != null ? !getLongitude().equals(that.getLongitude()) : that.getLongitude() != null)
            return false;
        return !(getLatitude() != null ? !getLatitude().equals(that.getLatitude()) : that.getLatitude() != null);

    }

    @Override
    public int hashCode() {
        int result = getTimeCreated() != null ? getTimeCreated().hashCode() : 0;
        result = 31 * result + (getLongitude() != null ? getLongitude().hashCode() : 0);
        result = 31 * result + (getLatitude() != null ? getLatitude().hashCode() : 0);
        return result;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
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
