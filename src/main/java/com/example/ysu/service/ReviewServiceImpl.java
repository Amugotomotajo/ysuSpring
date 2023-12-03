package com.example.ysu.service;

import com.example.ysu.model.dao.ReviewMapper;
import com.example.ysu.model.dto.ReviewDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewMapper reviewMapper;

    @Override
    public List<ReviewDTO> getMyReviews(String u_id) {

        return reviewMapper.getMyReviews(u_id);
    }
}
