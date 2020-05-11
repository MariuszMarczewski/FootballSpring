package pl.mmarczewski.football.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Team {

    @Id
    @GeneratedValue(generator = "teamSeq")
    @SequenceGenerator(name = "teamSeq", sequenceName = "team_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String league;

    public Team() {
    }

    public Team(Long id, String name, String league) {
        this.id = id;
        this.name = name;
        this.league = league;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }
}
