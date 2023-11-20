package com.example.ysu.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class cartDTO {

    private Integer menu_id;
    private String u_id;
    private Integer quantity;
    private String menu_name;
    private Integer menu_price;
    private String menu_corner;
    private String menu_image;
}

