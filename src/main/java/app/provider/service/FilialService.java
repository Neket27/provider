package app.provider.service;

import app.provider.argument.filial.CreateFilialArgument;
import app.provider.entity.dto.filial.FilialDto;
import app.provider.entity.provider.Filial;
import app.provider.entity.provider.Provider;
import app.provider.entity.provider.Region;
import app.provider.exception.ErrorException;
import app.provider.repository.FilialRepository;
import app.provider.repository.ProviderRepository;
import app.provider.repository.RegionRepository;
import app.provider.utils.mapper.FilialMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FilialService {
    private final FilialMapper filialMapper;
    private final FilialRepository filialRepository;
    private final ProviderRepository providerRepository;
    private final RegionRepository regionRepository;

    @Transactional
    public void create(CreateFilialArgument createFilialArgument) {
        Filial filial=filialMapper.toFilial(createFilialArgument);
        Provider provider = providerRepository.findById(createFilialArgument.getProviderId()).orElseThrow(()->new ErrorException("Провайдкр с id= "+createFilialArgument.getProviderId()+" не существует"));
        filial.setProvider(provider);

        Region region=regionRepository.findById(createFilialArgument.getRegionId()).orElseThrow(()->new ErrorException("Регион с id= "+createFilialArgument.getRegionId()+" не найден"));
        filial.setRegion(region);
        filialRepository.save(filial);
    }

    @Transactional
    public void updateInfo(FilialDto filialDto) {
        filialRepository.save(filialMapper.toFilial(filialDto));
    }
}
