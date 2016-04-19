package be.rdhaese.packetdelivery.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created on 19/04/2016.
 *
 * @author Robin D'Haese
 */
public class RemarkDTO implements Serializable {

    private String description;
    private Date timeAdded;

    public RemarkDTO() {
    }

    public RemarkDTO(String description, Date timeAdded) {
        this.description = description;
        this.timeAdded = timeAdded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemarkDTO remarkDTO = (RemarkDTO) o;

        if (getDescription() != null ? !getDescription().equals(remarkDTO.getDescription()) : remarkDTO.getDescription() != null)
            return false;
        return !(getTimeAdded() != null ? !getTimeAdded().equals(remarkDTO.getTimeAdded()) : remarkDTO.getTimeAdded() != null);

    }

    @Override
    public int hashCode() {
        int result = getDescription() != null ? getDescription().hashCode() : 0;
        result = 31 * result + (getTimeAdded() != null ? getTimeAdded().hashCode() : 0);
        return result;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(Date timeAdded) {
        this.timeAdded = timeAdded;
    }
}
