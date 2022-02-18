package com.example.demo.repository.order32;

import com.example.demo.entity.order32.Board;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;


@Repository
public class BoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Board> list(){
                List<Board> results = jdbcTemplate.query(
                        "select * from board " +
                                "where board_no > 0 order by board_no desc",

                        new RowMapper<Board>() {
                            @SneakyThrows
                            @Override
                            public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
                                    Board board = new Board();

                                    board.setBoardNo(rs.getInt("board_no"));
                                    board.setContent(rs.getString("content"));
                                    board.setTitle(rs.getString("title"));
                                    board.setWriter(rs.getString("writer"));

                                    SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
                                    String dbDate = rs.getDate("reg_date") +" " + rs.getDate("reg_date");
                                    board.setRegDate(printDate.parse(dbDate));

                                return board;

                            }
                        }


                );

                return results;
    }
}
