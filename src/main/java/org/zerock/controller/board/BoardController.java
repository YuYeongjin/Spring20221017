package org.zerock.controller.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.domain.board.BoardDto;
import org.zerock.service.board.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {
    @Autowired
    private BoardService service;

    @GetMapping("register")
    public void register(){
        // 게시물 작성 view로 포워드
        // /WEB-INF/views/board/register.jsp
    }
    @RequestMapping(value="register", method = {RequestMethod.POST})
    public String register(BoardDto board){
        // request param 수집 / 가공
        System.out.println(board);
        service.register(board);

        return "redirect:/board/list";
    }
}
