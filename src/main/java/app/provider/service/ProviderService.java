package app.provider.service;

import app.provider.entity.dto.provider.ProviderDto;
import app.provider.repository.ProviderRepository;
import app.provider.utils.mapper.ProviderMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProviderService {
    private final ProviderMapper providerMapper;
    private final ProviderRepository providerRepository;

    @Transactional
    public void create(ProviderDto providerDto) {
        providerRepository.save(providerMapper.toProvider(providerDto));
    }

    @Transactional
    public void updateInfo(ProviderDto providerDto) {
        providerRepository.save(providerMapper.toProvider(providerDto));
    }
}
