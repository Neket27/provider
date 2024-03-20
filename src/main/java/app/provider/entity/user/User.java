package app.provider.entity.user;

import app.provider.entity.provider.Filial;
import app.provider.entity.tariff.ActiveTariff;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity(name = "usr")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String lastname;
    private String middlename;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String date_registered;
    private Role role;

    @OneToOne
    @JoinColumn(name = "balance_id")
    private Balance balance;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "filial_id")
    Filial filial;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "user")
    List<ActiveTariff>activeTariffList;
}
