package org.zerock.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.member.MemberDto;
import org.zerock.service.member.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {

    @Autowired
    private MemberService service;

    @GetMapping("signup")
    public void signup() {}

    @PostMapping("signup")
    public String signup(MemberDto member, RedirectAttributes rttr) {
        int cnt=0;
        try {
            cnt = service.insert(member);
        } catch (DataIntegrityViolationException e) {
            e.printStackTrace();
        }
        if (cnt == 1) {
            rttr.addFlashAttribute("message","회원가입 되었습니다.");
            return "redirect:/board/list";
        } else {
//            rttr.addFlashAttribute("message",member);
            return "redirect:/member/signup";
        }
    }

    @GetMapping("list")
    public void list(Model model){
        model.addAttribute("memberList",service.list());
    }
}
