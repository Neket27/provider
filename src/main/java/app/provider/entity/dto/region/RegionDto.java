package app.provider.entity.dto.region;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class RegionDto {
    private UUID id;
    private String name;
    private Integer population;
    private Integer countClients;
}
