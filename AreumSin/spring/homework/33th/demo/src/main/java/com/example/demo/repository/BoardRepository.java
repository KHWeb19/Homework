package com.example.demo.repository;

import com.example.demo.entity.Board;
import lombok.SneakyThrows;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void create (Board board) {
        String query = "insert into boardtest (title, content, writer) values (?, ?, ?)";

        jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getWriter());
    }

    public List<Board> list() {

        List<Board> results = jdbcTemplate.query(
                "select board_no, title, content, writer, reg_date from boardtest " +
                        "where board_no > 0 order by board_no desc",

                // 요놈이 하나씩 넘겨줌
                new RowMapper<Board>() {
                    @SneakyThrows
                    @Override
                    public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Board board = new Board();

                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));

                        // pattern 형태의 시간 포맷을 가지게 만듬
                        // 연도-월-일 시:분:초
                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        // getDate()를 통해 DB상의 날자
                        // getTime()을 통해 DB상의 시간
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        // 이 문자열 형식을 위의 패턴 형태로 만들어서 객체에 저장
                        board.setRegDate(printDate.parse(dbDate));

                        return board;
                    }
                }
        );

        return results;
    }
}
