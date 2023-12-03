package com.example.ysu.controller;

import com.example.ysu.model.dto.ReviewDTO;
import com.example.ysu.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ReviewController {
    private final ReviewService reviewService;
    @GetMapping("/myreviews/{u_id}")
    public List<ReviewDTO> selectMyReviews(@PathVariable String u_id) {

        return reviewService.getMyReviews(u_id);
    }
}
