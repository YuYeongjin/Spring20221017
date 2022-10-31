package org.zerock.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.board.BoardDto;
import org.zerock.mapper.board.BoardMapper;

@Service
public class BoardService {

    @Autowired(required=true)
    private BoardMapper mapper;
    public void register(BoardDto board) {
        mapper.insert(board);
    }

}
