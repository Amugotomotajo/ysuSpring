package com.example.ysu.controller;

import com.example.ysu.model.dto.ReviewDTO;
import com.example.ysu.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/menu/{menu_id}/review")
    public List<ReviewDTO> reviewList(@PathVariable int menu_id) {
        return reviewService.reviewList(menu_id);
    }

    @DeleteMapping("/review/delete/{review_id}")
    public String reviewDelete(@PathVariable int review_id) {
        reviewService.reviewDelete(review_id);
        System.out.print(review_id);
        return "redirect:/menu";
        // Review 삭제 로직을 수행
    }
}
