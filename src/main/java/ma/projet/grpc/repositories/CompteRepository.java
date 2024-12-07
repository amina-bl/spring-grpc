package ma.projet.grpc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ma.projet.grpc.entities.Compte;
import ma.projet.grpc.entities.TypeCompte;

import java.util.List;

public interface CompteRepository extends JpaRepository<Compte, Long> {
    @Query("SELECT c FROM Compte c WHERE c.type = :type")
    List<Compte> findByType(TypeCompte type);
}
