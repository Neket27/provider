package app.provider.entity.dto.filial;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class FilialDto {
    private UUID id;
    private String name;
    private String address;
    private String phone;
    private String website;
    private String email;
    private Date openingDate;
}
