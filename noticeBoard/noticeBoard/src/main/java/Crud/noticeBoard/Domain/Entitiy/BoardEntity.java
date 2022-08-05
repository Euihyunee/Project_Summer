package Crud.noticeBoard.Domain.Entitiy;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// access는 생성자의 접근 권한을 설정하는 속성 -> protexted BoardEntity(){}와 동일
// 파라미터가 없는 기본 생성자를 추가하는 어노테이션(JPA사용을 위해 기본 생성자 생성 필수
// protected인 이유는 Entitiy생성을 외부에서 할 필요가 없기 때문에
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "board")
public class BoardEntity extends TimeEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Builder
    public BoardEntity(Long id, String title, String content, String writer) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
    }
}