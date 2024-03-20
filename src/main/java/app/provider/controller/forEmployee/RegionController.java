package app.provider.controller.forEmployee;

import app.provider.entity.dto.region.RegionDto;
import app.provider.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/region")
@RequiredArgsConstructor
public class RegionController {
    private final RegionService regionService;

    @PostMapping("/add")
    public void addRegion(RegionDto regionDto){
        regionService.add(regionDto);
    }

    @DeleteMapping("/remove")
    public void remove(UUID id){
        regionService.remove(id);
    }
}
