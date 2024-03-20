package app.provider.service;

import app.provider.entity.dto.company.CreateCompanyInfoDto;
import app.provider.repository.CompanyRepository;
import app.provider.utils.mapper.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyMapper companyMapper;
    private final CompanyRepository companyRepository;


    public void addInfo(CreateCompanyInfoDto createCompanyInfoDto){
        companyRepository.save(companyMapper.toEntity(createCompanyInfoDto));
    }


}
