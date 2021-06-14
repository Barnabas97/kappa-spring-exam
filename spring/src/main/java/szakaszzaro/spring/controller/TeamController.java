package szakaszzaro.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import szakaszzaro.spring.Request.TeamRequest;
import szakaszzaro.spring.model.Team;
import szakaszzaro.spring.responses.Teamresponse;
import szakaszzaro.spring.services.SuperHeroservice;
import szakaszzaro.spring.services.Teamservice;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamController {
    private final Teamservice teamservice;
    private final SuperHeroservice superHeroservice;



    public TeamController(Teamservice teamservice, SuperHeroservice superHeroservice) {
        this.teamservice = teamservice;
        this.superHeroservice = superHeroservice;
    }

    @GetMapping("/{teamId}")
    public Team getTeamById(@PathVariable String teamId) {
        return teamservice.getById(teamId);
    }

    @PostMapping("/{teamId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void addTeamById(@PathVariable String teamId, @RequestBody @NonNull TeamRequest team) {
        var teams = teamservice.findById(teamId);
        teamservice.add(teams, team);
    }
}
