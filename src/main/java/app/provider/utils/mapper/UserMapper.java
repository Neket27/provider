package app.provider.utils.mapper;

import app.provider.entity.dto.authorization.RegistrationDto;
import app.provider.entity.user.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(RegistrationDto registrationDto);
}
