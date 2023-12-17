package com.example.ysu.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class SignupDTO {
    @NotBlank(message = "이름을 입력해주세요.")
    @Pattern(regexp="^[ㄱ-ㅎ가-힣a-z]{2,10}$", message = "숫자 또는 특수문자를 제외한 2자이상 입력해주세요.")
    private String u_name;

    @NotBlank(message="학과는 필수 입력 값 입니다.")
    @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-z]{2,20}$", message = "숫자 또는 특수문자를 제외한 2자이상 입력해주세요.")
    private String u_dept;


    @NotBlank(message = "학번을 입력해주세요.")
    @Pattern(regexp = "^[\\d]*$", message = "숫자만 입력해주세요")
    private String u_id;

    @NotBlank(message = "비밀번호를 입력해주세요.")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z]).{8,16}", message = "비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
    private String u_pw;
}
