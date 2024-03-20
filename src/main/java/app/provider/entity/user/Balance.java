package app.provider.entity.user;

import app.provider.entity.payment.TransactionPayment;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Balance {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private UUID id;
    private Float balance;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "balance")
    private List<TransactionPayment> transactions;


}
