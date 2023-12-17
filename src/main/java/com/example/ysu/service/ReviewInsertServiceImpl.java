package com.example.ysu.service;

import com.example.ysu.model.dao.ReviewInsertDAO;
import com.example.ysu.model.dto.ReviewDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewInsertServiceImpl implements ReviewInsertService{
    private final ReviewInsertDAO reviewInsertDAO;

    @Autowired
    public ReviewInsertServiceImpl(ReviewInsertDAO reviewInsertDAO){
        this.reviewInsertDAO=reviewInsertDAO;
    }

    @Override
    public void reviewInsert(ReviewDTO reviewDTO) {
        reviewInsertDAO.reviewInsertData(reviewDTO);
    }
}
