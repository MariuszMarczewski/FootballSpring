package pl.mmarczewski.football.service;

import pl.mmarczewski.football.exceptions.TeamNotFoundException;
import pl.mmarczewski.football.model.Team;
import pl.mmarczewski.football.repositories.TeamRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Set<Team> findAll(){
        return new HashSet<>(teamRepository.findAll());
    }

    public Team getTeamById(Long id){
        if (id != null) {
            return teamRepository.getOne(id);
        }
        throw new TeamNotFoundException("id cannot be null");
    }




}
