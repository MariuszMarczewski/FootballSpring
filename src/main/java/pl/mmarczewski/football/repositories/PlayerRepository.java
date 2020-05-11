package pl.mmarczewski.football.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mmarczewski.football.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
