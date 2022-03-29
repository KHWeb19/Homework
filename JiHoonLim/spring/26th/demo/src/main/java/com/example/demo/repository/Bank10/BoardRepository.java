
/*package com.example.demo.repository.Bank10;

import com.example.demo.entity.Bank10.Product;

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

    public void create (Product product) {
        String query = "insert into product (name, content, detail, price) values (?, ?, ?, ?)";


        jdbcTemplate.update(query, product.getName(), product.getContent(), product.getDetail(), product.getPrice());
    }

    public List<Product> list() {

        List<Product> results = jdbcTemplate.query(
                "select board_no, name, content, detail, price, reg_date from product " +
                        "where board_no > 0 order by board_no desc",


                new RowMapper<Product>() {
                    @SneakyThrows
                    @Override
                    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Product product = new Product();

                        product.setBoardNo(rs.getInt("board_no"));
                        product.setName(rs.getString("name"));
                        product.setContent(rs.getString("content"));
                        product.setDetail(rs.getString("detail"));
                        product.setPrice(rs.getInt("price"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        product.setRegDate(printDate.parse(dbDate));

                        return product;
                    }
                }
        );

        return results;
    }

    public Product read(Integer boardNo) {
        List<Product> results = jdbcTemplate.query(
                "select * from product " +
                        "where board_no = ?",

                new RowMapper<Product>() {
                    @SneakyThrows
                    @Override
                    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Product product = new Product();

                        product.setBoardNo(rs.getInt("board_no"));
                        product.setName(rs.getString("name"));
                        product.setContent(rs.getString("content"));
                        product.setDetail(rs.getString("detail"));
                        product.setPrice(rs.getInt("price"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        product.setRegDate(printDate.parse(dbDate));

                        return product;
                    }
                }, boardNo
        );

        return results.isEmpty() ? null : results.get(0);
    }

    public void delete(Integer boardNo) {
        String query = "delete from product where board_no = ?";

        jdbcTemplate.update(query, boardNo);
    }

    public void update(Product product) {
        String query = "update product set name = ?, content = ?, detail = ? where board_no = ?";

        jdbcTemplate.update(query, product.getName(), product.getContent(), product.getDetail(),product.getBoardNo());
    }
}


 */