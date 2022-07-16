package testing.testDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.testDB.domain.Matchid;

public interface MatchRepository extends JpaRepository<Matchid, Long> {

}
