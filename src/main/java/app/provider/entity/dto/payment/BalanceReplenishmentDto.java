package app.provider.entity.dto.payment;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class BalanceReplenishmentDto {
    private UUID idBalance;
    private Float amount;

}
