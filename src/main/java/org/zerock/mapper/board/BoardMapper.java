package org.zerock.mapper.board;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.board.BoardDto;

public interface BoardMapper {

	
	int insert(BoardDto board);

	List<BoardDto> list(@Param("offset") int offset, @Param("records")int records, @Param("type")String type,@Param("keyword") String keyword);

	BoardDto select(@Param("id") int id);

	int update(BoardDto board);

	int delete(@Param("id") int id);

	int countAll(@Param("type")String type,@Param("keyword")String keyword);

}








