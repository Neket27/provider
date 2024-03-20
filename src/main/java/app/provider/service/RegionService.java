package app.provider.service;

import app.provider.entity.dto.region.RegionDto;
import app.provider.entity.provider.Region;
import app.provider.repository.RegionRepository;
import app.provider.utils.mapper.RegionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RegionService {

    private final RegionMapper regionMapper;
    private final RegionRepository regionRepository;

    public void add(RegionDto regionDto){
        Region region=regionMapper.toEntity(regionDto);
        regionRepository.save(region);

    }

    public void remove(UUID id){
        regionRepository.deleteById(id);
    }
}
