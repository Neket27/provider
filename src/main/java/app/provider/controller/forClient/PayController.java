package app.provider.controller.forClient;

import app.provider.entity.dto.payment.BalanceReplenishmentDto;
import app.provider.service.PayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PayController {
    private final PayService payService;

    @PostMapping("/balanceReplenishment")
    public void balanceReplenishment(@RequestBody BalanceReplenishmentDto balanceReplenishmentDto){
        payService.balanceReplenishment(balanceReplenishmentDto);
    }
}
