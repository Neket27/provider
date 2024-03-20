package app.provider.service;

import app.provider.entity.dto.payment.BalanceReplenishmentDto;
import app.provider.entity.payment.TransactionPayment;
import app.provider.entity.user.Balance;
import app.provider.repository.BalanceRepository;
import app.provider.repository.PayRepository;
import app.provider.utils.mapper.PayMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class PayService {
    private final PayMapper payMapper;
    private final PayRepository payRepository;
    private final BalanceRepository balanceRepository;

    @Transactional
    public void balanceReplenishment(BalanceReplenishmentDto balanceReplenishmentDto) {
       Balance balance =  balanceRepository.findById(balanceReplenishmentDto.getIdBalance()).orElseThrow(()->new RuntimeException("Нет баланса с id= "+balanceReplenishmentDto.getIdBalance()));
       balance.setBalance(balance.getBalance()+balanceReplenishmentDto.getAmount());
       balanceRepository.save(balance);

        TransactionPayment transactionPayment=payMapper.toEntity(balanceReplenishmentDto);
        transactionPayment.setStatus(true);
        transactionPayment.setDate(new Date());
        transactionPayment.setBalance(balance);
        payRepository.save(transactionPayment);
    }
}
