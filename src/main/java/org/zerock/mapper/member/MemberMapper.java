package org.zerock.mapper.member;

import org.zerock.domain.member.MemberDto;

import java.util.List;

public interface MemberMapper {
    int insert(MemberDto member);

    List<MemberDto> selectAll();

    MemberDto selectById(String id);

    int update(MemberDto member);

    int deleteById(String id);
}
