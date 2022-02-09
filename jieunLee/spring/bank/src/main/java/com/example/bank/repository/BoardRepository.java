package com.example.bank.repository;

import com.example.bank.entity.Board;
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

    public void create (Board board) {
        String query = "insert into board (title, content, writer) values (?, ?, ?)";
        jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getWriter());
    }

    public List<Board> list() {
        List<Board> results = jdbcTemplate.query(
                "select board_no, title, content, writer, reg_date from board " +
                        "where board_no > 0 order by board_no desc",

                new RowMapper<Board>() {
                    //해당 버전에서 시간 불러올 수 있게 세팅해줌
                    @SneakyThrows
                    @Override
                    public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Board board = new Board();

                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        board.setRegDate(printDate.parse(dbDate));

                        return board;
                    }
                }
        );

        return results;
    }

    public Board read(Integer boardNo) {
        List<Board> results = jdbcTemplate.query(
                "select * from board " +
                        "where board_no = ? ",

                new RowMapper<Board>() {
                    //해당 버전에서 시간 불러올 수 있게 세팅해줌
                    @SneakyThrows
                    @Override
                    public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Board board = new Board();

                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        board.setRegDate(printDate.parse(dbDate));

                        return board;
                    }
                }, boardNo
        );

        return results.isEmpty() ? null : results.get(0);
    }

    public void delete(Integer boardNo){
        String query = "delete from board where board_no = ?";

        jdbcTemplate.update(query, boardNo);
    }

    public void update(Board board) {
        String query = "update board set title = ?, content = ? where board_no = ?";

        jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getBoardNo());
    }
}
