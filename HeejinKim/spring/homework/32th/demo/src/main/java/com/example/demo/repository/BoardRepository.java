package com.example.demo.repository;

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

@Repository //@auto와 연결됨
public class BoardRepository { //실질적인 역할은 DB의 처리를 하는 역할

    @Autowired //BoardServicelmpl와 연결됨
    private JdbcTemplate jdbcTemplate;     //jpa를 쓰면 간편하게 사용가능

    public void create (Board board) {
        String query = "insert into board (title, content, writer) values (?, ?, ?)";

        // 위의 DB 쿼리에 대응하는 녀석들이
        // 각각 board.getTitle(), board.getContent(), board.getWriter()에 해당함
        jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getWriter());
    }

    //query가 처리되고 결과가 result에 들어감>>> 이 결과를 리턴하는 것이 list의 역할
    public List<Board> list() {

        // jdbcTemplate.query(A, B)
        // A에 해당하는 DB Query를 실행함
        // B에는 A에 배치될 정보들이 들어가며
        // 현재 RowMapper가 이 정보를 하나하나 처리해주고 있음
        // 모든 데이터를 싹 다 가져오게 되어있음

        List<Board> results = jdbcTemplate.query(

                //select 값을 추출할 때 사용.
                //DB에 있는 board 테이블에서 board_no,title,content,writer,reg_date를 가져옴
                //board_no>0 숫자가 0보다 큰 것들을 가져오고 no은 내림차순임

                "select board_no, title, content, writer, reg_date from board " +
                        "where board_no > 0 order by board_no desc",

             new RowMapper<Board>() {


                    @SneakyThrows
                    @Override
                    public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Board board = new Board(); //객체 생성
                        // sql을 돌릴때 board_no에 해당한는 정보를 DB에서 가지고옴
                        //그 정보를 Board에 셋팅함
                        //RowMapper가 한번 동작할 때 마다 하나씩 리턴함
                        //그 정보가 List의 results에 하나씩 저장됨

                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));

                        // pattern 형태의 시간 포맷을 가지게 만듬
                        // 연도-월-일 시:분:초
                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");

                        board.setRegDate(printDate.parse(dbDate));
                       // board.setRegDate(String.valueOf(printDate.parse(dbDate)));

                        return board;
                    }
             }
        );
        return results;

    }
}




