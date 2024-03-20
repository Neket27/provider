package app.provider.repository;

import app.provider.entity.tariff.ActiveTariff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ActiveTariffRepository  extends JpaRepository<ActiveTariff, UUID> {
}
