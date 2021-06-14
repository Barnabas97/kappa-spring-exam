package szakaszzaro.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import szakaszzaro.spring.Request.SuperheroRequest;
import szakaszzaro.spring.Request.TeamRequest;
import szakaszzaro.spring.model.SuperHero;
import szakaszzaro.spring.model.Team;
import szakaszzaro.spring.services.SuperHeroservice;
import szakaszzaro.spring.services.Teamservice;

@RestController
@RequestMapping("/api/super-hero")
public class SuperHeroController {
    private final Teamservice teamservice;
    private final SuperHeroservice superHeroservice;



    public SuperHeroController(Teamservice teamservice, SuperHeroservice superHeroservice) {
        this.teamservice = teamservice;
        this.superHeroservice = superHeroservice;
    }

    @GetMapping("/{superheroId}")
    public SuperHero getSuperHeroById(@PathVariable String superheroId) {
        return superHeroservice.getById(superheroId);
    }

    @PostMapping("/{superheroesId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void addsuperheroById(@PathVariable String superheroId, @RequestBody @NonNull SuperheroRequest hero) {
        var heroes = superHeroservice.findById(superheroId);
        superHeroservice.add(heroes, hero);
    }

}
