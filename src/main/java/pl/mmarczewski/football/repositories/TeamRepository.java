package pl.mmarczewski.football.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.mmarczewski.football.model.Team;

import java.util.Set;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
