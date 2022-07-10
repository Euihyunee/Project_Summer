package testing.testDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.testDB.domain.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
