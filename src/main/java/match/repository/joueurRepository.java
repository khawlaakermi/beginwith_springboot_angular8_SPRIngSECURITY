package match.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import match.entities.*;
@Repository
public interface joueurRepository extends JpaRepository<Joueur,Integer>{

}
