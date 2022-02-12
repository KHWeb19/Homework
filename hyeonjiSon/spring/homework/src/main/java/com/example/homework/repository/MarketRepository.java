package com.example.homework.repository;

import com.example.homework.entity.order10th.Market;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MarketRepository { //관리 데이터베이스

              /*
              Jdbc(Java DataBase Connectivity) 자바에서 데이터베이스에 접속할 수 있도록 하는 자바 API
              JdbcTemplate(jdbc를 위한 툴) - DB와 연동하기 위해 SQL연산들을 수행할 수 있도록 도와주는 기술
               */
    @Autowired
    private JdbcTemplate jdbcTemplate; //Lecture demo에서는 나오는데 왜 여기에선 안되는거지?
                              //@Repository를 넣고나니 Alt+Enter로 생성할 수 있었다. 해결!

    public List<Market> list(){
        // jdbcTemplate.query(A, B)
        // A에 해당하는 DB Query를 실행함
        // B에는 A에 배치될 정보들이 들어가며
        // 현재 RowMapper가 이 정보를 하나하나 처리해주고 있음
        // 모든 데이터를 싹 다 가져오게 되어있음
        List<Market> result = jdbcTemplate.query(
                "select product_no, title, content, writer", //이게 A

                new RowMapper<Market>() {
                    @SneakyThrows
                    @Override
                    public Market mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Market market = new Market();

                        market.setProductNo(rs.getInt("product_no"));
                        market.setTitle(rs.getString("title"));
                        market.setContent(rs.getString("content"));
                        market.setSeller(rs.getString("seller"));

                        return market; //market의 내용을 return해라
                    }
                }
        );
        return result; //List의 결과를 return해라
    }
}

//아직 read, modify, remove 가 남았다.