package com.example.ysu.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CartOrderDTO {
    private Long cartId;
    private List<CartOrderDTO> cartOrderList;
}
