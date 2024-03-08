package com.app.service.mapper;

import com.app.domain.Booking;
import com.app.domain.Room;
import com.app.domain.User;
import com.app.service.dto.BookingDTO;
import com.app.service.dto.RoomDTO;
import com.app.service.dto.UserDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Booking} and its DTO {@link BookingDTO}.
 */
@Mapper(componentModel = "spring")
public interface BookingMapper extends EntityMapper<BookingDTO, Booking> {
    @Mapping(target = "user", source = "user", qualifiedByName = "userId")
    @Mapping(target = "room", source = "room", qualifiedByName = "roomId")
    BookingDTO toDto(Booking s);

    @Named("userId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    UserDTO toDtoUserId(User user);

    @Named("roomId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    RoomDTO toDtoRoomId(Room room);
}
