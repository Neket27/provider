package app.provider.service;

import app.provider.entity.user.User;
import app.provider.exception.ErrorException;
import app.provider.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public User getUser(UUID id){
        return userRepository.findById(id).orElseThrow(()->new ErrorException("Пользователь с id= "+id+" ненайден"));
    }
}
