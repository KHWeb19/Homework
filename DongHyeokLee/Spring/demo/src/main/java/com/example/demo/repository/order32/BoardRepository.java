package com.example.demo.repository.order32;

import com.example.demo.entity.order32.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class BoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Board> list(){
                List<Board> results = jdbcTemplate.query(

                )
    }
}
