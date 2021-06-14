package szakaszzaro.spring.services;

import lombok.NonNull;
import org.springframework.stereotype.Service;
import szakaszzaro.spring.model.SuperHero;
import szakaszzaro.spring.model.Team;
import szakaszzaro.spring.repository.SuperHeroRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class SuperHeroservice {
    private final SuperHeroRepository superherorepository;

    public SuperHeroservice(SuperHeroRepository superherorepository) {
        this.superherorepository = superherorepository;
    }

    @NonNull
    public SuperHero getById(String superheroId){
        return superherorepository.findById(superheroId).orElseThrow();
    }

    public SuperHero findById(@NonNull String id) {
        return superherorepository.findById(id).orElseThrow();
    }
}
