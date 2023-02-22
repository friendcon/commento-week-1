package com.practice.commento.service;

import com.practice.commento.domain.MovieVO;

import java.util.List;

public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}
