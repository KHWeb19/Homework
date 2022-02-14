package com.example.demo.repository;


import com.example.demo.entity.proBank10.Product;
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

    //이부분은 일단 register가 구현되어서 게시판 글이 등록이 되어야
    //실행되는듯
    public void create(Product product){
        String query = "insert into product (product_name, view_details, registrant) value (?,?,?)";

        jdbcTemplate.update(query,product.getProductName(),product.getViewDetails(),product.getRegistrant());

    }

    public List<Product> list(){
            List<Product> results = jdbcTemplate.query(
                    "select board_no, product_name, view_details, registrant, reg_date from product " +
                            "where board_no > 0 order by board_no desc",
                            //desc 내림차순 asc 오름차순
                            //board_no 이 0보다 크면 board_no을 내림차순으로 정렬이란건가

                    new RowMapper<Product>() {
                        @SneakyThrows
                        @Override
                        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                            Product product= new Product();

                            product.setBoardNo(rs.getInt("board_no"));
                            product.setProductName(rs.getString("product_name"));
                            product.setViewDetails(rs.getString("view_details"));
                            product.setRegistrant(rs.getString("registrant"));

                            SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                            String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                            product.setRegDate(printDate.parse(dbDate));

                            return product;
                        }
                    }
            );

            return results;
    }

   public Product read(Integer boardNo){
        List<Product> results = jdbcTemplate.query(
                " select * from product " +
                        "where board_no = ?",

                new RowMapper<Product>() {
                    @SneakyThrows
                    @Override
                    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                                Product product = new Product();

                                product.setBoardNo(rs.getInt("board_no"));
                                product.setProductName(rs.getString("product_name"));
                                product.setViewDetails(rs.getString("view_details"));
                                product.setRegistrant(rs.getString("registrant"));

                                SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                                String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                                product.setRegDate(printDate.parse(dbDate));

                        return product;
                    }
                }, boardNo
        );

        return results.isEmpty() ? null : results.get(0);
    }


    public void upDate(Product product){

        String query = "update product set product_name= ?, registrant = ? where board_no = ?";

        jdbcTemplate.update(query, product.getProductName(), product.getViewDetails(), product.getBoardNo());

    }

    public void delete(Integer boardNo){
        String query = "delete from product where board_no = ?";

        jdbcTemplate.update(query, boardNo);
    }
}
