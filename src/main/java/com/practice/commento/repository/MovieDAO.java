package com.practice.commento.repository;

import com.practice.commento.domain.MovieVO;

import java.util.List;

public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}
