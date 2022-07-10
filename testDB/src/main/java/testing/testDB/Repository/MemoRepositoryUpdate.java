package testing.testDB.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import testing.testDB.domain.Memo;

@SpringBootTest
public class MemoRepositoryUpdate {

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void UpdateDummies() {
        Memo memo = Memo.builder()
                .id(10L)
                .memoText("Update Text")
                .build();

        memoRepository.save(memo);
    }
}
