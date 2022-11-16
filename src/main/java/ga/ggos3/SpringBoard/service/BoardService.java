package ga.ggos3.SpringBoard.service;

import ga.ggos3.SpringBoard.domain.Board;
import ga.ggos3.SpringBoard.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {
    private final BoardMapper boardMapper;
    public int boardCount() {
        return boardMapper.boardCount(); // 게시글 수 반환
    }

    public List<Board> boardList() {
        return boardMapper.getList(); // 게시글 리스트 반환
    }
    public Board getBoard(Long boardId){
        return boardMapper.getBoard(boardId);
    }
}
