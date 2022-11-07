package org.zerock.domain.board;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReplyDto {
    private int boardId;
    private String content;
    private int id;
    private LocalDateTime inserted;
}
