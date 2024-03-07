package com.app.service.mapper;

import com.app.domain.Hotel;
import com.app.service.dto.HotelDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Hotel} and its DTO {@link HotelDTO}.
 */
@Mapper(componentModel = "spring")
public interface HotelMapper extends EntityMapper<HotelDTO, Hotel> {}
