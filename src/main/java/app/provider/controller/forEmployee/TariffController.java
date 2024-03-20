package app.provider.controller.forEmployee;

import app.provider.argument.tariff.AddTariffArgument;
import app.provider.entity.dto.tariff.TariffDto;
import app.provider.service.TariffService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/tariff")
@RequiredArgsConstructor
public class TariffController {

    private final TariffService tariffService;
    @PostMapping("/add")
    public void add(@RequestBody AddTariffArgument addTariffArgument){
        tariffService.add(addTariffArgument);
    }

    @PutMapping("/update")
    public void update(@RequestBody TariffDto tariffDto){
        tariffService.update(tariffDto);
    }

    @GetMapping("/remove")
    public void remove(@RequestParam UUID id){
        tariffService.remove(id);
    }

}
