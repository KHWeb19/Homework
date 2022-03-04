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

    public Board read(Integer boardNo) {
        List<Board> results = jdbcTemplate.query(
                "select * from boardtest " +
                        "where board_no = ?",

                new RowMapper<Board>() {
                    @SneakyThrows
                    @Override
                    public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Board board = new Board();

                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        // getDate()를 통해 DB상의 날자
                        // getTime()을 통해 DB상의 시간
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        // 이 문자열 형식을 위의 패턴 형태로 만들어서 객체에 저장
                        board.setRegDate(printDate.parse(dbDate));

                        return board;
                    }
                }, boardNo
        );

        return results.isEmpty() ? null : results.get(0);
        // 이미 jdbcTemplate.query에서 boardNo를 넘겨 받은 후
        // 그 붠호를 찾고 있는것이기 떄문에 reesults.get(0)에는 하나의 내용만이 들어가 있다.
        // 그랴ㅐ서 results.get(0)을 통해서 내용이 없지않을경우 보여주라고 하는것이다.
    }

    public void remove(Integer boardNo) {
        String query = "delete from boardtest where board_no = ?";

        jdbcTemplate.update(query, boardNo);
    }

    public void modify(Board board) {
        String query = "update boardtest set title = ?, content = ? where board_no = ?";

        jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getBoardNo());
    }
}
