package app.provider.utils.mapper;

import app.provider.entity.dto.payment.BalanceReplenishmentDto;
import app.provider.entity.payment.TransactionPayment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PayMapper {


    TransactionPayment toEntity(BalanceReplenishmentDto balanceReplenishmentDto);
}
