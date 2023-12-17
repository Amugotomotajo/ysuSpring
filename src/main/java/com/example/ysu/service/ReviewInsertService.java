package com.example.ysu.service;

import com.example.ysu.model.dto.ReviewDTO;
import org.springframework.stereotype.Service;
@Service
public interface ReviewInsertService {
    void reviewInsert(ReviewDTO reviewDTO);
}
