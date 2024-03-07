package com.app.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.app.domain.Hotel} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class HotelDTO implements Serializable {

    private Long id;

    @NotNull
    private String name;

    private String address;

    private String city;

    private String country;

    private Integer rating;

    private String facilities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotelDTO)) {
            return false;
        }

        HotelDTO hotelDTO = (HotelDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, hotelDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "HotelDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            ", city='" + getCity() + "'" +
            ", country='" + getCountry() + "'" +
            ", rating=" + getRating() +
            ", facilities='" + getFacilities() + "'" +
            "}";
    }
}
