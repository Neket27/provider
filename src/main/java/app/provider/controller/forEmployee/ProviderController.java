package app.provider.controller.forEmployee;

import app.provider.entity.dto.provider.ProviderDto;
import app.provider.service.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/provider")
@RequiredArgsConstructor
public class ProviderController {
private final ProviderService providerService;

    @PostMapping("/createProvider")
    public void createProvider(@RequestBody ProviderDto providerDto){
        providerService.create(providerDto);
    }

    @PutMapping("/updateInfoProvider")
    public void updateInfoProvider(@RequestBody ProviderDto providerDto){
        providerService.updateInfo(providerDto);
    }

}
