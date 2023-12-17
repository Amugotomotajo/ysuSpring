package com.example.ysu.model.dao;

import com.example.ysu.model.dto.ReviewDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ReviewDAO {
    void reviewInsert(ReviewDTO reviewDTO);

    List<ReviewDTO> reviewList(int menu_id);

    void reviewDelete(int review_id);
}
