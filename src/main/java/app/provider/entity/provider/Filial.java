package app.provider.entity.provider;

import app.provider.entity.tariff.Tariff;
import app.provider.entity.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Filial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String address;
    private String phone;
    private String website;
    private String email;
    private Date openingDate;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "provider_id",nullable = true)
    private Provider provider;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<User> userList;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Tariff>tariffList;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "region_id")
    private Region region;

}
