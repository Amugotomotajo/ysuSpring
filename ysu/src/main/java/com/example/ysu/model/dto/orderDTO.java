package com.example.ysu.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class orderDTO {
    private Long order_id;
    private String u_id;
    private Integer total_quantity;
    private Integer total_price;
    private String order_date;

    private Long order_detail_id;
    private Long is_packed;
    private Integer menu_id;
    private Integer quantity;

    private String menu_name;
    private Integer menu_price;
    private String menu_corner;
    private String menu_image;
}
