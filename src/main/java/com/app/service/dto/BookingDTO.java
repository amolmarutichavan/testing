package com.app.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A DTO for the {@link com.app.domain.Booking} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class BookingDTO implements Serializable {

    private Long id;

    private ZonedDateTime checkInDate;

    private ZonedDateTime checkOutDate;

    private BigDecimal totalPrice;

    private String status;

    private UserDTO user;

    private RoomDTO room;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(ZonedDateTime checkInDate) {
        this.checkInDate = checkInDate;
    }

    public ZonedDateTime getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(ZonedDateTime checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public RoomDTO getRoom() {
        return room;
    }

    public void setRoom(RoomDTO room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BookingDTO)) {
            return false;
        }

        BookingDTO bookingDTO = (BookingDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, bookingDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "BookingDTO{" +
            "id=" + getId() +
            ", checkInDate='" + getCheckInDate() + "'" +
            ", checkOutDate='" + getCheckOutDate() + "'" +
            ", totalPrice=" + getTotalPrice() +
            ", status='" + getStatus() + "'" +
            ", user=" + getUser() +
            ", room=" + getRoom() +
            "}";
    }
}
