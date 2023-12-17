package com.example.ysu.service;

import com.example.ysu.model.dto.InsertReviewDTO;
import com.example.ysu.model.dto.ReviewDTO;

import java.util.List;

public interface ReviewService {
    List<ReviewDTO> getMyReviews(String u_id);
    // void reviewInsert(ReviewDTO reviewDTO);
    List<ReviewDTO> reviewList(Integer menu_id);
    void reviewInsert(InsertReviewDTO reviewDTO);

    void reviewDelete(Integer review_id, String u_id);
}
