package pl.mmarczewski.football.model;

import javax.persistence.*;

@Entity
public class Player {

    @Id
    @GeneratedValue(generator = "playerSeq")
    @SequenceGenerator(name = "playerSeq", sequenceName = "player_seq", allocationSize = 1)
    private Long id;
    private String firstName;
    private String secondName;
    private Integer birthYear;
    @ManyToOne(targetEntity = Team.class)
    private Team team;

    public Player() {
    }

    public Player(String firstName, String secondName, Integer birthYear, Team team) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.team = team;
    }

    public Player(Long id, String firstName, String secondName, Integer birthYear, Team team) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.team = team;
    }
}
