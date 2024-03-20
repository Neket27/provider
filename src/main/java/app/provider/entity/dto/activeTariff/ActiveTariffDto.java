package app.provider.entity.dto.activeTariff;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ActiveTariffDto {
    private UUID id;
    private UUID userId;
    private UUID tariffId;
    private String address;
}
