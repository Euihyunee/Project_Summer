package Crud.noticeBoard.Domain.Repository;

import Crud.noticeBoard.Domain.Entitiy.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
