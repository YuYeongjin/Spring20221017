package org.zerock.mapper.board;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.board.ReplyDto;

public interface ReplyMapper {

    int insert(ReplyDto reply);

    List<ReplyDto> selectReplyByBoardId(@Param("boardId") int boardId);

    int deleteById(@Param("id") int id);

    ReplyDto selectById(@Param("id") int id);
    int update(ReplyDto reply);

}