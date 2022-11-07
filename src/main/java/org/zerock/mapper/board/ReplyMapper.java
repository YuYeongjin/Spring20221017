package org.zerock.mapper.board;

import org.zerock.domain.board.ReplyDto;

import java.util.List;

public interface ReplyMapper {

    int insert(ReplyDto reply);

    List<ReplyDto> selectReplyByBoardId(int boardId);
}
