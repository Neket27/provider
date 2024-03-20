package app.provider.entity.dto.provider;

import lombok.Getter;
import lombok.Setter;

import java.rmi.server.UID;
import java.util.UUID;

@Getter
@Setter
public class ProviderDto {
    private UUID id;
    private String name;
    private String phone;
    private String website;
    private String email;
}
