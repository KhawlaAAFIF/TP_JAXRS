package ma.projet.jaxrs.repositories;

import ma.projet.jaxrs.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
