package org.zerock.domain.member;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MemberDto {
    private String id;
    private String email;
    private String password;
    private LocalDate inserted;

}
