package szakaszzaro.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import szakaszzaro.spring.model.SuperHero;

@Repository
public interface SuperHeroRepository extends JpaRepository<SuperHero, String>{
}
