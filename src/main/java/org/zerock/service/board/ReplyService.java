package org.zerock.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.board.ReplyDto;
import org.zerock.mapper.board.ReplyMapper;

import java.util.List;

@Service
public class ReplyService {

    @Autowired
    private ReplyMapper mapper;

    public int addReply(ReplyDto reply){
        return mapper.insert(reply);
    }


    public List<ReplyDto> listReplyByBoardId(int boardId) {
        return mapper.selectReplyByBoardId(boardId);
    }
}
