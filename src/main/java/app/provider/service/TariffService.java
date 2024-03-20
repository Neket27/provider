package app.provider.service;

import app.provider.argument.tariff.AddTariffArgument;
import app.provider.entity.dto.activeTariff.ActiveTariffDto;
import app.provider.entity.dto.tariff.TariffDto;
import app.provider.entity.provider.Filial;
import app.provider.entity.provider.Provider;
import app.provider.entity.tariff.ActiveTariff;
import app.provider.entity.tariff.Tariff;
import app.provider.entity.user.User;
import app.provider.exception.ErrorException;
import app.provider.repository.ActiveTariffRepository;
import app.provider.repository.FilialRepository;
import app.provider.repository.TariffRepository;
import app.provider.repository.UserRepository;
import app.provider.utils.mapper.ActiveTariffMapper;
import app.provider.utils.mapper.TariffMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TariffService {

    private final TariffMapper tariffMapper;
    private  final ActiveTariffMapper activeTariffMapper;
    private final TariffRepository tariffRepository;
    private final FilialRepository filialRepository;
    private final ActiveTariffRepository activeTariffRepository;
    private final UserService userService;


    @Transactional
    public void add(AddTariffArgument addTariffArgument) {
        Tariff tariff=tariffMapper.toEntity(addTariffArgument);
        Filial filial=filialRepository.findById(addTariffArgument.getFilial_id()).orElseThrow(()->new ErrorException("Филиал с id= "+addTariffArgument.getFilial_id()+" не найден"));
        tariff.setFilial(filial);
        tariffRepository.save(tariff);
    }

    @Transactional
    public void update(TariffDto tariffDto) {
        tariffRepository.save(tariffMapper.toEntity(tariffDto));
    }

    @Transactional
    public void remove(UUID id) {
        tariffRepository.deleteById(id);
    }

    @Transactional
    public void plug(ActiveTariffDto activeTariffDto) {
        ActiveTariff activeTariff=activeTariffMapper.toEntity(activeTariffDto);
        activeTariff.setUser(userService.getUser(activeTariffDto.getUserId()));
        activeTariffRepository.save(activeTariff);
    }
}
