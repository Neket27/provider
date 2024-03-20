package app.provider.argument.filial;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;


@Setter
@Getter
public class CreateFilialArgument {
    private String name;
    private String address;
    private String phone;
    private String website;
    private String email;
    private Date openingDate;
    private UUID providerId;
    private UUID regionId;
}
