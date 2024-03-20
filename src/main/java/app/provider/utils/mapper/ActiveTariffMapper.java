package app.provider.utils.mapper;

import app.provider.entity.dto.activeTariff.ActiveTariffDto;
import app.provider.entity.tariff.ActiveTariff;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActiveTariffMapper {
    ActiveTariff toEntity(ActiveTariffDto activeTariffDto);
}
