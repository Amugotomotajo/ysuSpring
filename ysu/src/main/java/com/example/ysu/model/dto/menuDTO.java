package com.example.ysu.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class menuDTO {

    private int menu_id;

    private String menu_name;

    private String menu_corner;

    private int menu_price;

    private int menu_pack;

    private String menu_image;

    private int menu_sales;

    private int menu_regist;
}