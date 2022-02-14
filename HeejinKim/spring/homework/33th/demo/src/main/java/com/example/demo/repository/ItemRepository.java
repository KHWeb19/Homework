package com.example.demo.repository;

import com.example.demo.entity.Item;
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
public class ItemRepository {

    //생성,불러오기...
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Item item) { //board에 있는 값들을 DB에 저장

        String query = "insert into item (title,content,area) values (?,?,?)";
        jdbcTemplate.update(query, item.getTitle(), item.getContent(), item.getArea());

    }

    public List<Item> list() {
        List<Item> results = jdbcTemplate.query(
                "select item_no, title, content, area, reg_date from item " +
                        "where item_no > 0 order by item_no desc",

        /*List <Item> results = jdbcTemplate.query(
                "select board_no, title, content, area, reg_date from board" +
                        "where board_no > 0 order by board_no desc", 내가 작성한 것 (동작x)*/
                // jdbcTemplate.query(A, B)
                // A에 해당하는 DB Query를 실행함
                // B에는 A에 배치될 정보들이 들어감

                new RowMapper<Item>() {
                    @SneakyThrows
                    @Override
                    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {

                        Item item = new Item();

                        item.setItemNo(rs.getInt("item_no"));
                        item.setTitle(rs.getString("title"));
                        item.setContent(rs.getString("content"));
                        item.setArea(rs.getString("area"));

                        //날짜를 표시하는 것
                        SimpleDateFormat printData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        item.setRegDate(printData.parse(dbDate));

                        return item;
                    }
                }

        );
        return results;

    }

    public Item read(Integer itemNo) {
        List<Item> results = jdbcTemplate.query(
                "select * from item " +
                        "where item_no = ?", //불러오는 것은?


                new RowMapper<Item>() {
                    @SneakyThrows
                    @Override
                    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {

                        Item item = new Item();

                        item.setItemNo(rs.getInt("item_no"));
                        item.setTitle(rs.getString("title"));
                        item.setContent(rs.getString("content"));
                        item.setArea(rs.getString("area"));


                        SimpleDateFormat printData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        item.setRegDate(printData.parse(dbDate));

                        return item;
                    }
                }, itemNo

        );
        return results.isEmpty() ? null : results.get(0);


    }

    public void delete (Integer itemNo){
        String query ="delete from item where item_no = ?";
        jdbcTemplate.update(query,itemNo);

    }

    public void update(Item item) {
        String query = "update item set title = ?, content = ? ,area = ? where item_no = ?";
        jdbcTemplate.update(query, item.getTitle(), item.getContent(),item.getArea(), item.getItemNo());

    }

}
