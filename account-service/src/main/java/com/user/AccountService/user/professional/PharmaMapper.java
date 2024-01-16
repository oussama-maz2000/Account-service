package com.user.AccountService.user.professional;

import com.user.AccountService.dao.entity.Pharmacy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Configuration;

@Mapper(componentModel = "spring")
public interface PharmaMapper {

    PharmaDTO fromPharmatoDTO(Pharmacy pharmacy);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "cluster", ignore = true)
    @Mapping(target = "state", ignore = true)
    @Mapping(target = "longitude", ignore = true)
    @Mapping(target = "latitude", ignore = true)
    @Mapping(target = "pro", ignore = true)


    Pharmacy fromDTOtoPharmacy(PharmaDTO pharmaDTO);
}
