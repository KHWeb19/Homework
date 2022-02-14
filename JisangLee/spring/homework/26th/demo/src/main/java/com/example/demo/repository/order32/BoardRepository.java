package com.example.demo.repository.order32;

import com.example.demo.entity.order32.ProductBoard;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(ProductBoard productBoard) {
        String query = "insert into productBoard (product, shop, information, price) values(?, ?, ?, ?)";

        jdbcTemplate.update(query, productBoard.getProduct(), productBoard.getShop(), productBoard.getInformation(), productBoard.getPrice());

    }

    public List<ProductBoard> list() {
        List<ProductBoard> results = jdbcTemplate.query(
                "select board_no, product, shop, information, price from board " +
                        "where board_no > 0 order by board_no desc",

                new RowMapper<ProductBoard>() {

                    @SneakyThrows
                    @Override
                    public ProductBoard mapRow(ResultSet rs, int rowNum) throws SQLException {
                        ProductBoard productBoard = new ProductBoard();

                        productBoard.setBoardNo(rs.getInt("board_no"));
                        productBoard.setProduct(rs.getString("product"));
                        productBoard.setShop(rs.getString("shop"));
                        productBoard.setInformation(rs.getString("information"));
                        productBoard.setPrice(rs.getString("price"));
                        return productBoard;
                    }
                }
        );
        return results;

    }

    public ProductBoard read(Integer boardNo) {
        List<ProductBoard> results = jdbcTemplate.query(
                "select * from board " +
                        "where board_no = ?",

                new RowMapper<ProductBoard>() {
                    @SneakyThrows
                    @Override
                    public ProductBoard mapRow(ResultSet rs, int rowNum) throws SQLException {
                        ProductBoard productBoard = new ProductBoard();

                        productBoard.setBoardNo(rs.getInt("board_no"));
                        productBoard.setProduct(rs.getString("product"));
                        productBoard.setShop(rs.getString("shop"));
                        productBoard.setInformation(rs.getString("information"));
                        productBoard.setPrice(rs.getString("price"));
                        return productBoard;
                    }
                }, boardNo
        );

        return results.isEmpty() ? null : results.get(0);

    }

    public void delete(Integer boardNo) {
        String query = "delete from board where board_no = ?";

        jdbcTemplate.update(query, boardNo);
    }

    public void update(ProductBoard productBoard) {
        String query = "update productBoard set product = ?, shop = ?, information = ?, price = ?, where board_no = ?";

        jdbcTemplate.update(query, productBoard.getProduct(), productBoard.getShop(), productBoard.getInformation(), productBoard.getPrice(), productBoard.getBoardNo());
    }
}



