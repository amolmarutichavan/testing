package com.app.service;

import com.app.service.dto.BookingDTO;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.app.domain.Booking}.
 */
public interface BookingService {
    /**
     * Save a booking.
     *
     * @param bookingDTO the entity to save.
     * @return the persisted entity.
     */
    BookingDTO save(BookingDTO bookingDTO);

    /**
     * Updates a booking.
     *
     * @param bookingDTO the entity to update.
     * @return the persisted entity.
     */
    BookingDTO update(BookingDTO bookingDTO);

    /**
     * Partially updates a booking.
     *
     * @param bookingDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<BookingDTO> partialUpdate(BookingDTO bookingDTO);

    /**
     * Get all the bookings.
     *
     * @return the list of entities.
     */
    List<BookingDTO> findAll();

    /**
     * Get the "id" booking.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<BookingDTO> findOne(Long id);

    /**
     * Delete the "id" booking.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
