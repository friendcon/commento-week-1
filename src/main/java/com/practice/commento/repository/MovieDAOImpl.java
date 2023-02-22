package com.practice.commento.repository;

import com.practice.commento.domain.MovieVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class MovieDAOImpl implements MovieDAO {

    @Inject
    private SqlSession sqlSession;
    private static final String Namespace = "com.practice.commento.mybatis.sql.test";
    @Override
    public List<MovieVO> selectMovie() throws Exception {
        return sqlSession.selectList(Namespace+".selectMovie");
    }
}
