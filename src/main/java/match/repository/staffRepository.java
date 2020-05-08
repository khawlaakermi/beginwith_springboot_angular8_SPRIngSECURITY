package match.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import match.entities.Staff;
@Repository
public interface staffRepository extends JpaRepository<Staff,Integer> {

}
