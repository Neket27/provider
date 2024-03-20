package app.provider.entity.provider;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String phone;
    private String website;
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider")
    private List<Filial> filialList;
}
