package app.provider.utils.mapper;


import app.provider.argument.tariff.AddTariffArgument;
import app.provider.entity.tariff.Tariff;
import app.provider.entity.dto.tariff.TariffDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TariffMapper {

    TariffDto toDto(Tariff tariff);
    Tariff toEntity(TariffDto tariffDto);
    Tariff toEntity(AddTariffArgument addTariffArgument);

}
