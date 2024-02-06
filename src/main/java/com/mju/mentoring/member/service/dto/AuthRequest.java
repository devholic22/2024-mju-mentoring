package com.mju.mentoring.member.service.dto;

import jakarta.validation.constraints.NotBlank;

public record AuthRequest(

        @NotBlank(message = "닉네임이 작성되어야 합니다.")
        String nickname,

        @NotBlank(message = "비밀번호가 작성되어야 합니다.")
        String password) {
}
