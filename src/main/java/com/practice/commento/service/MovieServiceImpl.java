package com.practice.commento.service;

import com.practice.commento.domain.MovieVO;
import com.practice.commento.repository.MovieDAO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDAO dao;

    @Override
    public List<MovieVO> selectMovie() throws Exception {
        return dao.selectMovie();
    }
}
