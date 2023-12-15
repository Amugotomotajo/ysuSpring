package com.example.ysu.model.dao;

import com.example.ysu.model.dto.ReviewDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ReviewMapper {

    List<ReviewDTO> getMyReviews(String u_id);

}
