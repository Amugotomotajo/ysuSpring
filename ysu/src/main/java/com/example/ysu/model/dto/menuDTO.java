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
        private Integer menu_id;
        private String menu_name;
        private String menu_corner;
        private Integer menu_price;
        private Integer menu_pack;
        private String menu_image;
        private Integer menu_sales;
        private Integer menu_regist;
}
