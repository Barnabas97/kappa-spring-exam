package szakaszzaro.spring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class SuperHero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;


    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Universe universe;

    @Column
    private Team team;

    @OneToMany//(mappedBy = "user", cascade = CascadeType.ALL)
    Boolean hero;
}
