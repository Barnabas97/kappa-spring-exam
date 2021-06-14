package szakaszzaro.spring.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import szakaszzaro.spring.model.Team;

@Data
@AllArgsConstructor
public class Teamresponse {
    private String uuid;
    private String name;
    private Team team;
}
