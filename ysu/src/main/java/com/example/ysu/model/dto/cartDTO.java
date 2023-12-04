package com.example.ysu.model.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class cartDTO {
    List<update> Update;
    private Integer menu_id;
    private String u_id;
    private Integer quantity;
    private String menu_name;
    private Integer menu_price;
    private String menu_corner;
    private String menu_image;
    private Integer is_packed;

    public static class update {
        private Integer menu_id;
        private Integer quantity;

        public Integer getMenu_id() {
            return menu_id;
        }

        public void setMenu_id(Integer menu_id) {
            this.menu_id = menu_id;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }
    }
}
