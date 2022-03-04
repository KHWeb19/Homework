package com.example.demo.repository;

import com.example.demo.entity.order34.ProductList;
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

    public void create(ProductList product) {
        String query = "insert into product (product_name, content, price, writer) value(?,?,?,?)";
        jdbcTemplate.update(query,product.getProduct_name(),product.getContent(),product.getPrice(),product.getWriter());
    }


    public List<ProductList> list() {
        List<ProductList> results = jdbcTemplate.query(
                "select board_no, product_name, content, price, writer, reg_date from product " +
                        "where board_no > 0 order by board_no desc",

                //https://velog.io/@seculoper235/RowMapper%EC%97%90-%EB%8C%80%ED%95%B4 -> rowmapper관련 링크
                new RowMapper<ProductList>() {
                    @SneakyThrows
                    @Override
                    public ProductList mapRow(ResultSet rs, int rowNum) throws SQLException {
                        ProductList productList = new ProductList();

                        productList.setBoard_no(rs.getInt("board_no"));
                        productList.setProduct_name(rs.getString("product_name"));
                        productList.setContent(rs.getString("content"));
                        productList.setPrice(rs.getInt("price"));
                        productList.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") +" "+rs.getTime("reg_date");
                        productList.setReg_date(printDate.parse(dbDate));

                        return productList;
                    }
                }
        );
        return results;
    }

    public ProductList read(Integer board_no) {
        List<ProductList> results = jdbcTemplate.query(
                "select * from product " +
                        "where board_no = ?",

                new RowMapper<ProductList>() {
                    @SneakyThrows
                    @Override
                    public ProductList mapRow(ResultSet rs, int rowNum) throws SQLException {
                        ProductList productList = new ProductList();

                        productList.setBoard_no(rs.getInt("board_no"));
                        productList.setProduct_name(rs.getString("product_name"));
                        productList.setContent(rs.getString("content"));
                        productList.setPrice(rs.getInt("price"));
                        productList.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") +" "+rs.getTime("reg_date");
                        productList.setReg_date(printDate.parse(dbDate));

                        return productList;
                    }
                },board_no
        );
        return results.isEmpty() ? null : results.get(0);
    }

    public void modify(ProductList product) {
        String query = "update product set product_name = ?, content = ?, price = ?, writer = ? where board_no = ?";
        jdbcTemplate.update(query,product.getProduct_name(),product.getContent(),product.getPrice(),product.getWriter(),product.getBoard_no());
    }

    public void remove(Integer board_no) {
        String query = "delete from product where board_no = ?";
        jdbcTemplate.update(query,board_no);
    }
}
