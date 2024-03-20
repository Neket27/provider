package app.provider.entity.dto.tariff;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class TariffDto {
    private UUID id;
    private String name;
    private Float speed;
    private Float cost;
}
