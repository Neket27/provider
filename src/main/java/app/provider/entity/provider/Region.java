package app.provider.entity.provider;

import app.provider.entity.supportAddress.SupportAddress;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private Integer population;
    private Integer countClients;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Filial>filialList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<SupportAddress>supportAddressList;
}
