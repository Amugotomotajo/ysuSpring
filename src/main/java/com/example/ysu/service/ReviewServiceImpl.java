package com.example.ysu.service;

import com.example.ysu.model.dao.ReviewDAO;
import com.example.ysu.model.dto.ReviewDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewDAO reviewDAO;

    @Override
    public List<ReviewDTO> getMyReviews(String u_id) {

        return reviewDAO.getMyReviews(u_id);
    }

    @Override
    public List<ReviewDTO> reviewList(Integer menu_id) {
        return reviewDAO.reviewList(menu_id);
    }

//    @Override
//    public void reviewInsert(ReviewDTO reviewDTO) {
//        reviewDAO.reviewInsert(reviewDTO);
//    }

    @Override
    public void reviewDelete(Integer review_id, String u_id) {
        reviewDAO.reviewDelete(review_id, u_id);
    }
}
