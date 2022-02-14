package com.example.demo.repository.order33;

import com.example.demo.entity.order33.Item;
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

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create (Item item) {
        String query = "insert into item (name, price, quantity) values (?, ?, ?)";

        jdbcTemplate.update(query, item.getName(), item.getPrice(), item.getQuantity());
    }

    public List<Item> list() {

        List<Item> results = jdbcTemplate.query(
                "select itemId, name, price, quantity, reg_date from item " +
                        "where itemId > 0 order by itemId desc",

                // 요놈이 하나씩 넘겨줌
                new RowMapper<Item>() {
                    @SneakyThrows
                    @Override
                    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Item item = new Item();

                        item.setItemId(rs.getInt("itemId"));
                        item.setName(rs.getString("name"));
                        item.setPrice(rs.getInt("price"));
                        item.setQuantity(rs.getInt("quantity"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");

                        item.setRegDate(printDate.parse(dbDate));

                        return item;
                    }
                }
        );

        return results;
    }

    public Item read(Integer itemId) {
        List<Item> results = jdbcTemplate.query(
                "select * from item " +
                        "where itemId = ?",

                new RowMapper<Item>() {
                    @SneakyThrows
                    @Override
                    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Item item = new Item();

                        item.setItemId(rs.getInt("itemId"));
                        item.setName(rs.getString("name"));
                        item.setPrice(rs.getInt("price"));
                        item.setQuantity(rs.getInt("quantity"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");

                        item.setRegDate(printDate.parse(dbDate));

                        return item;
                    }
                }, itemId
        );

        return results.isEmpty() ? null : results.get(0);
    }

    public void delete(Integer itemId) {
        String query = "delete from item where itemId = ?";

        jdbcTemplate.update(query, itemId);
    }

    public void update(Item item) {
        String query = "update item set name = ?, price = ?, quantity = ? where itemId = ?";

        jdbcTemplate.update(query, item.getName(), item.getPrice(), item.getQuantity(), item.getItemId());
    }
}
