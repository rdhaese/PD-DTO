package be.rdhaese.packetdelivery.dto;

import java.io.Serializable;import java.lang.Object;import java.lang.Override;import java.lang.String;

/**
 * Created on 23/12/2015.
 *
 * @author Robin D'Haese
 */
public class RegionDTO implements Serializable{

    private String nameNl;
    private String nameFr;
    private String nameDe;
    private String nameEn;

    private String code;

    public RegionDTO() {
    }

    public RegionDTO(String nameNl, String nameFr, String nameDe, String nameEn, String code) {
        this.nameNl = nameNl;
        this.nameFr = nameFr;
        this.nameDe = nameDe;
        this.nameEn = nameEn;
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegionDTO regionDTO = (RegionDTO) o;

        if (getNameNl() != null ? !getNameNl().equals(regionDTO.getNameNl()) : regionDTO.getNameNl() != null)
            return false;
        if (getNameFr() != null ? !getNameFr().equals(regionDTO.getNameFr()) : regionDTO.getNameFr() != null)
            return false;
        if (getNameDe() != null ? !getNameDe().equals(regionDTO.getNameDe()) : regionDTO.getNameDe() != null)
            return false;
        if (getNameEn() != null ? !getNameEn().equals(regionDTO.getNameEn()) : regionDTO.getNameEn() != null)
            return false;
        return !(getCode() != null ? !getCode().equals(regionDTO.getCode()) : regionDTO.getCode() != null);

    }

    @Override
    public int hashCode() {
        int result = getNameNl() != null ? getNameNl().hashCode() : 0;
        result = 31 * result + (getNameFr() != null ? getNameFr().hashCode() : 0);
        result = 31 * result + (getNameDe() != null ? getNameDe().hashCode() : 0);
        result = 31 * result + (getNameEn() != null ? getNameEn().hashCode() : 0);
        result = 31 * result + (getCode() != null ? getCode().hashCode() : 0);
        return result;
    }

    public String getNameNl() {
        return nameNl;
    }

    public void setNameNl(String nameNl) {
        this.nameNl = nameNl;
    }

    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    public String getNameDe() {
        return nameDe;
    }

    public void setNameDe(String nameDe) {
        this.nameDe = nameDe;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
