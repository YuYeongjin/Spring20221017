package org.zerock.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.member.MemberDto;
import org.zerock.mapper.member.MemberMapper;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberMapper mapper;

    public int insert(MemberDto member){
        return mapper.insert(member);
    }

    public List<MemberDto> list() {
        return mapper.selectAll();
    }
}
