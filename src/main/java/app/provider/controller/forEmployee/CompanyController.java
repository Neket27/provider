package app.provider.controller.forEmployee;

import app.provider.entity.dto.company.CreateCompanyInfoDto;
import app.provider.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    public void addInfo(CreateCompanyInfoDto createCompanyInfoDto){
        companyService.addInfo(createCompanyInfoDto);
    }

}
