package szakaszzaro.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import szakaszzaro.spring.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, String> {
    
}
