package com.example.demo.rpository;

import com.example.demo.entity.Product;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void register(Product product){
        String query = "insert into producttest (title, price, content, writer) value (?, ?, ?, ?)";

        jdbcTemplate.update(query, product.getTitle(), product.getPrice(), product.getContent(), product.getWriter());
    }

    public List<Product> list() {

        List<Product> results = jdbcTemplate.query(
                "select product_no , title, price, content, writer, reg_date from producttest " +
                        "where product_no > 0 order by product_no desc",

                // 요놈이 하나씩 넘겨줌
                new RowMapper<Product>() {
                    @Override
                    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Product product = new Product();

                        product.setProductNo(rs.getInt("product_no"));
                        product.setTitle(rs.getString("title"));
                        product.setPrice(rs.getInt("price"));
                        product.setContent(rs.getString("content"));
                        product.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        try {
                            product.setRegDate(printDate.parse(dbDate));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                        return product;
                    }
                }
        );

        return results;
    }

    public Product read(Integer productNo) {
        List<Product> results = jdbcTemplate.query(
                "select * from producttest " +
                        "where product_no = ?",

                new RowMapper<Product>() {
                    @SneakyThrows
                    @Override
                    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Product board = new Product();

                        board.setProductNo(rs.getInt("product_no"));
                        board.setTitle(rs.getString("title"));
                        board.setPrice(rs.getInt("price"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        board.setRegDate(printDate.parse(dbDate));

                        return board;
                    }
                }, productNo
        );

        // 정보를 찾지 못했다면 null 있다면 해당 내용 리턴 (0번 인덱스 - 결국 한개)
        return results.isEmpty() ? null : results.get(0);
    }

    public void modify(Product product) {
        String query = "update producttest set title = ?, price = ?, content = ? where product_no = ?";

        jdbcTemplate.update(query, product.getTitle(), product.getPrice(), product.getContent(), product.getProductNo());

    }

    public void remove(Integer productNo) {
        String query = "delete from producttest where product_no = ?";

        jdbcTemplate.update(query, productNo);

    }
}
