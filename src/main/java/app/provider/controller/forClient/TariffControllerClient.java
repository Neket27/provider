package app.provider.controller.forClient;

import app.provider.entity.dto.activeTariff.ActiveTariffDto;
import app.provider.service.TariffService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/tariffUser")
@RequiredArgsConstructor
public class TariffControllerClient {

    private final TariffService tariffService;

    @PostMapping("/plug")
    public void plug(ActiveTariffDto activeTariffDto){
        tariffService.plug(activeTariffDto);
    }

    public void  unPlug(){}

    public void changeOnAnderTariff(){}
}
