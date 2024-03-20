package app.provider.utils.mapper;

import app.provider.entity.dto.region.RegionDto;
import app.provider.entity.provider.Region;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RegionMapper {

    Region toEntity(RegionDto regionDto);
}
