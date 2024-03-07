package com.app.service.mapper;

import com.app.domain.Hotel;
import com.app.domain.Room;
import com.app.service.dto.HotelDTO;
import com.app.service.dto.RoomDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Room} and its DTO {@link RoomDTO}.
 */
@Mapper(componentModel = "spring")
public interface RoomMapper extends EntityMapper<RoomDTO, Room> {
    @Mapping(target = "hotel", source = "hotel", qualifiedByName = "hotelId")
    RoomDTO toDto(Room s);

    @Named("hotelId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    HotelDTO toDtoHotelId(Hotel hotel);
}
