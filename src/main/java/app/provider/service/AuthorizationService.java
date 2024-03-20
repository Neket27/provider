package app.provider.service;

import app.provider.entity.dto.authorization.Login;
import app.provider.entity.dto.authorization.RegistrationDto;
import app.provider.entity.user.Balance;
import app.provider.entity.user.User;
import app.provider.exception.ErrorException;
import app.provider.repository.BalanceRepository;
import app.provider.repository.UserRepository;
import app.provider.utils.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorizationService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;
    private final BalanceRepository balanceRepository;
    public void registration(RegistrationDto registrationDto){
        User user=userMapper.toUser(registrationDto);
        user.setBalance(balanceRepository.save(
                Balance.builder()
                        .balance(0f)
                .build()));
        userRepository.save(user);
    }

    public void login(Login login){
     User user = userRepository.findUserByEmailAndPassword(login.getEmail(), login.getPassword()).orElseThrow(()->new ErrorException("Проверьте правильность логина и пароля"));
    System.out.println("User: "+user.toString());
    }


}
