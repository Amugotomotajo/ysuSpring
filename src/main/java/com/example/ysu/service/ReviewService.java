package com.example.ysu.service;

import com.example.ysu.model.dto.ReviewDTO;

import java.util.List;

public interface ReviewService {
    List<ReviewDTO> getMyReviews(String u_id);
}
