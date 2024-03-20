package app.provider.utils.mapper;

import app.provider.entity.company.Company;
import app.provider.entity.dto.company.CreateCompanyInfoDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    CreateCompanyInfoDto toCreateEmployeeDto(Company company);
    Company toEntity(CreateCompanyInfoDto createCompanyInfoDto);

}
