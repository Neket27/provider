package app.provider.repository;

import app.provider.entity.provider.Filial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface FilialRepository extends JpaRepository<Filial, UUID> {



}
