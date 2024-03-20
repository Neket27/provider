package app.provider.argument.tariff;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AddTariffArgument {
    private String name;
    private Float speed;
    private Float cost;
    private UUID filial_id;
}
