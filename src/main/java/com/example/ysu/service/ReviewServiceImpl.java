package com.example.ysu.service;
import com.example.ysu.model.dao.ReviewDAO;
import com.example.ysu.model.dao.ReviewInsertDAO;
import com.example.ysu.model.dto.ReviewDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewDAO reviewDAO;
    private ReviewInsertDAO reviewInsertDAO;

    @Override
    public List<ReviewDTO> reviewList(int menu_id) {
        return reviewDAO.reviewList(menu_id);
    }

    @Override
    public void reviewDelete(int review_id) {
        reviewDAO.reviewDelete(review_id);
    }
}
