package testing.testDB.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemoRepositoryDelete {
    @Autowired
    MemoRepository memoRepository;

    @Test
    public void DeleteDummies(){
        Long id = 10L;

        memoRepository.deleteById(id);
    }
}
