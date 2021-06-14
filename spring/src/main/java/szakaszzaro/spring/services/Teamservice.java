package szakaszzaro.spring.services;

import lombok.NonNull;
import szakaszzaro.spring.Request.TeamRequest;
import szakaszzaro.spring.model.SuperHero;
import szakaszzaro.spring.model.Team;
import szakaszzaro.spring.repository.TeamRepository;

import java.time.LocalDate;

public class Teamservice {
    private final TeamRepository teamrepository;



    public Teamservice(TeamRepository teamrepository) {
        this.teamrepository = teamrepository;
    }

    @NonNull
    public Team getById(String teamId){
        return teamrepository.findById(teamId).orElseThrow();
    }



    public Team findById(@NonNull String id) {
        return teamrepository.findById(id).orElseThrow();
    }

    public void add(Team teams, TeamRequest team) {
    }
}
