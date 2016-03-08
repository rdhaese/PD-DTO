package be.rdhaese.packetdelivery.dto;

import java.io.Serializable;import java.lang.Object;import java.lang.Override;import java.lang.String;

/**
 * Created on 23/12/2015.
 *
 * @author Robin D'Haese
 */
public class RegionDTO implements Serializable{

    private String name;
    private String code;

    public RegionDTO() {
    }

    public RegionDTO(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegionDTO regionDTO = (RegionDTO) o;

        if (getName() != null ? !getName().equals(regionDTO.getName()) : regionDTO.getName() != null) return false;
        return !(getCode() != null ? !getCode().equals(regionDTO.getCode()) : regionDTO.getCode() != null);

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getCode() != null ? getCode().hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
