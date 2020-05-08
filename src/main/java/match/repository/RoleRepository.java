package match.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import match.entities.ERole;
import match.entities.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role,Integer>{
	Optional<Role> findByName(ERole name);

}
