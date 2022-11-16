package ga.ggos3.SpringBoard.mapper;

import ga.ggos3.SpringBoard.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {

    int boardCount();
    Board getBoard(Long boardId);
    List<Board> getList();
}
