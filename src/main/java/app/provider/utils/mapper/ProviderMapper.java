package app.provider.utils.mapper;

import app.provider.entity.dto.provider.ProviderDto;
import app.provider.entity.provider.Provider;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProviderMapper {
    Provider toProvider(ProviderDto providerDto);
}
