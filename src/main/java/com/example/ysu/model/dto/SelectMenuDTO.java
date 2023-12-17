package com.example.ysu.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SelectMenuDTO {
    private int menu_id;
    private String menu_name; // 메뉴 이름
    private String menu_corner; // 코너
    private int menu_price;
    private int menu_pack; // 포장 여부
    private String menu_image; // 음식 사진
    private int menu_sales; // 판매 가능 여부
    private int menu_regist; // 등록 여부
}