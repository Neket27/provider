package app.provider.entity.dto.authorization;

import app.provider.entity.user.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationDto {
    private String name;
    private String lastname;
    private String middlename;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String date_registered;
    private Role role;
}
