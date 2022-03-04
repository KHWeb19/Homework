package com.example.demo.repository;

import com.example.demo.entity.Product;
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

    public void create(Product product){
        String query = "insert into product (name, price, description, writer) values (?, ?, ?, ?)";

        jdbcTemplate.update(query, product.getName(), product.getPrice(), product.getDescription(), product.getWriter());
    }

    public List<Product> list(){
        List<Product> result = jdbcTemplate.query(
                "select board_no, name, writer, description, price, reg_date from product",
                new RowMapper<Product>(){
                    @SneakyThrows
                    @Override
                    public Product mapRow(ResultSet rs, int rowNum) {
                        Product product = new Product();
                        product.setBoard_no(rs.getInt("board_no"));
                        product.setName(rs.getString("name"));
                        product.setWriter(rs.getString("writer"));
                        product.setDescription(rs.getString("description"));
                        product.setPrice(rs.getInt("price"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        product.setRegDate(printDate.parse(dbDate));

                        return product;
                    }
                }

        );
        return result;
    }

    public void modify(Product product){
        String query = "update product set name = ?, description = ?, price = ? where board_no = ?";

        jdbcTemplate.update(query, product.getName(),product.getDescription(), product.getPrice(),product.getBoard_no());
    }


    public void delete(Integer board_no){
        String query = "delete from product where board_no = ?";

        jdbcTemplate.update(query, board_no);
    }

    public Product read(Integer board_no) {
        List<Product> results = jdbcTemplate.query(
                "select * from product where board_no = ?",
                new RowMapper<Product>() {
                    @SneakyThrows
                    @Override
                    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Product product = new Product();
                        product.setBoard_no(rs.getInt("board_no"));
                        product.setName(rs.getString("name"));
                        product.setDescription(rs.getString("description"));
                        product.setPrice(rs.getInt("price"));
                        product.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        product.setRegDate(printDate.parse(dbDate));

                        return product;
                    }
                }, board_no
        );
        return results.isEmpty() ? null : results.get(0);
    }
}
