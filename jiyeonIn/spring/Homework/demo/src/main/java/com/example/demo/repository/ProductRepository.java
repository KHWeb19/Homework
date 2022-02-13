package com.example.demo.repository;

import com.example.demo.entity.order34.Product34th;
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
public class ProductRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Product34th product) {
        String query = "insert into product (product_name, content, price, writer) value(?,?,?,?)";
        jdbcTemplate.update(query,product.getProduct_name(),product.getContent(),product.getPrice(),product.getWriter());
    }


    public List<Product34th> list() {
        List<Product34th> results = jdbcTemplate.query(
                "select board_no, product_name, content, price, writer, reg_date from product " +
                        "where board_no > 0 order by board_no desc",

                //https://velog.io/@seculoper235/RowMapper%EC%97%90-%EB%8C%80%ED%95%B4 -> rowmapper관련 링크
                new RowMapper<Product34th>() {
                    @SneakyThrows
                    @Override
                    public Product34th mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Product34th product34th = new Product34th();

                        product34th.setBoard_no(rs.getInt("board_no"));
                        product34th.setProduct_name(rs.getString("product_name"));
                        product34th.setContent(rs.getString("content"));
                        product34th.setPrice(rs.getInt("price"));
                        product34th.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") +" "+rs.getTime("reg_date");
                        product34th.setReg_date(printDate.parse(dbDate));

                        return product34th;
                    }
                }
        );
        return results;
    }

    public Product34th read(Integer board_no) {
        List<Product34th> results = jdbcTemplate.query(
                "select * from product " +
                        "where board_no = ?",

                new RowMapper<Product34th>() {
                    @SneakyThrows
                    @Override
                    public Product34th mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Product34th product34th = new Product34th();

                        product34th.setBoard_no(rs.getInt("board_no"));
                        product34th.setProduct_name(rs.getString("product_name"));
                        product34th.setContent(rs.getString("content"));
                        product34th.setPrice(rs.getInt("price"));
                        product34th.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") +" "+rs.getTime("reg_date");
                        product34th.setReg_date(printDate.parse(dbDate));

                        return product34th;
                    }
                },board_no
        );
        return results.isEmpty() ? null : results.get(0);
    }

    public void modify(Product34th product) {
        String query = "update product set product_name = ?, content = ?, price = ?, writer = ?";
        jdbcTemplate.update(query,product.getProduct_name(),product.getContent(),product.getPrice(),product.getWriter());
    }

    public void remove(Integer board_no) {
        String query = "delete from product where board_no = ?";
        jdbcTemplate.update(query,board_no);
    }
}
