package com.app.domain;

import com.app.domain.enumeration.RoomType;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Room.
 */
@Entity
@Table(name = "room")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "room_number", nullable = false)
    private String roomNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "room_type")
    private RoomType roomType;

    @Column(name = "price_per_night", precision = 21, scale = 2)
    private BigDecimal pricePerNight;

    @Column(name = "availability")
    private Boolean availability;

    @ManyToOne
    private Hotel hotel;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Room id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public Room roomNumber(String roomNumber) {
        this.setRoomNumber(roomNumber);
        return this;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public Room roomType(RoomType roomType) {
        this.setRoomType(roomType);
        return this;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public BigDecimal getPricePerNight() {
        return this.pricePerNight;
    }

    public Room pricePerNight(BigDecimal pricePerNight) {
        this.setPricePerNight(pricePerNight);
        return this;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Boolean getAvailability() {
        return this.availability;
    }

    public Room availability(Boolean availability) {
        this.setAvailability(availability);
        return this;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Room hotel(Hotel hotel) {
        this.setHotel(hotel);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Room)) {
            return false;
        }
        return id != null && id.equals(((Room) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Room{" +
            "id=" + getId() +
            ", roomNumber='" + getRoomNumber() + "'" +
            ", roomType='" + getRoomType() + "'" +
            ", pricePerNight=" + getPricePerNight() +
            ", availability='" + getAvailability() + "'" +
            "}";
    }
}
