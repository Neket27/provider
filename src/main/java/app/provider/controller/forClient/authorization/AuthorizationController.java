package app.provider.controller.forClient.authorization;

import app.provider.entity.dto.authorization.Login;
import app.provider.entity.dto.authorization.RegistrationDto;
import app.provider.service.AuthorizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authorization")
@RequiredArgsConstructor
public class AuthorizationController {
    private final AuthorizationService authorizationService;

    @PostMapping("/registration")
    public void registration(@RequestBody RegistrationDto registrationDto){
        authorizationService.registration(registrationDto);
    }

    @PostMapping("/login")
    public void login(@RequestBody Login login){
        authorizationService.login(login);
    }

}
