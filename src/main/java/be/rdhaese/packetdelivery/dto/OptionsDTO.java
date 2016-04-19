package be.rdhaese.packetdelivery.dto;

import java.io.Serializable;

/**
 * Created on 17/04/2016.
 *
 * @author Robin D'Haese
 */
public class OptionsDTO implements Serializable{
    private String user;
    private String language;
    private Integer print;
    private Boolean imageViewer;

    public OptionsDTO() {
    }

    public OptionsDTO(String user, String language, Integer print, Boolean imageViewer) {
        this.user = user;
        this.language = language;
        this.print = print;
        this.imageViewer = imageViewer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OptionsDTO that = (OptionsDTO) o;

        if (getUser() != null ? !getUser().equals(that.getUser()) : that.getUser() != null) return false;
        if (getLanguage() != null ? !getLanguage().equals(that.getLanguage()) : that.getLanguage() != null)
            return false;
        if (getPrint() != null ? !getPrint().equals(that.getPrint()) : that.getPrint() != null) return false;
        return !(getImageViewer() != null ? !getImageViewer().equals(that.getImageViewer()) : that.getImageViewer() != null);

    }

    @Override
    public int hashCode() {
        int result = getUser() != null ? getUser().hashCode() : 0;
        result = 31 * result + (getLanguage() != null ? getLanguage().hashCode() : 0);
        result = 31 * result + (getPrint() != null ? getPrint().hashCode() : 0);
        result = 31 * result + (getImageViewer() != null ? getImageViewer().hashCode() : 0);
        return result;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getPrint() {
        return print;
    }

    public void setPrint(Integer print) {
        this.print = print;
    }

    public Boolean getImageViewer() {
        return imageViewer;
    }

    public void setImageViewer(Boolean imageViewer) {
        this.imageViewer = imageViewer;
    }
}
