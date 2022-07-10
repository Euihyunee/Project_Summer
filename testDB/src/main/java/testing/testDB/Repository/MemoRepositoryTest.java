package testing.testDB.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import testing.testDB.domain.Memo;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTest {

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void InsertDummies(){

        IntStream.rangeClosed(1, 10).forEach(i -> {
            Memo memo = Memo.builder()
                    .memoText("Sample..." + i)
                    .build();
            //Create!
            memoRepository.save(memo);
        });
    }

    @Test
    public void SelectDummies(){
        Long id = 10L;  // id 선택

        // Select: Repository 객체의 findById() 메소드 사용
        Optional<Memo> result = memoRepository.findById(id);
        // 기본키(id)를 넣어주면 해당 객체를 Optional 타입으로 변환해줌
        System.out.println("========================");

        if(result.isPresent()){
            Memo memo = result.get();
            System.out.println(memo);
        }
    }

    @Test
    public void UpdateDummies(){
        Memo memo = Memo.builder()
                .id(10L)
                .memoText("Update Text")
                .build();

        memoRepository.save(memo);
    }

    @Test
    public void DeleteDummies(){
        Long id = 10L;

        memoRepository.deleteById(id);
    }
}
