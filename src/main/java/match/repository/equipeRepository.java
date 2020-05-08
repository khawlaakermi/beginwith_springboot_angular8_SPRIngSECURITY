package match.repository;
import org.springframework.stereotype.Repository;

import match.entities.Equipe;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface equipeRepository extends JpaRepository<Equipe,Integer>{

}