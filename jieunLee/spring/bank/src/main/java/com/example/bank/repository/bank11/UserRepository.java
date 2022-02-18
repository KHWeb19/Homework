package com.example.bank.repository.bank11;

import com.example.bank.entity.bank10.ProductBoard;
import com.example.bank.entity.bank11.User;
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
public class UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(User user) {
        String query = "insert into user_table (user_id, user_password, user_name) values (?, ?, ?)";
        jdbcTemplate.update(query, user.getUserId(), user.getUserPassword(), user.getUserName());
    }

    public List<User> list() {
        List<User> results = jdbcTemplate.query(
                "select * from user_table " +
                        "where user_no > 0 order by user_no desc",

                new RowMapper<User>() {
                    //해당 버전에서 시간 불러올 수 있게 세팅해줌
                    @SneakyThrows
                    @Override
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                        User user = new User();

                        user.setUserNo(rs.getInt("user_no"));
                        user.setUserId(rs.getString("user_id"));
                        user.setUserPassword(rs.getString("user_password"));
                        user.setUserName(rs.getString("user_name"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("signup_date") + " " + rs.getTime("signup_date");
                        user.setSignUpDate(printDate.parse(dbDate));

                        return user;
                    }
                }
        );
        return results;
    }

    public User read(Integer userNo) {
        List<User> results = jdbcTemplate.query(
                "select * from user_table " +
                        "where user_no = ? ",

                new RowMapper<User>() {
                    //해당 버전에서 시간 불러올 수 있게 세팅해줌
                    @SneakyThrows
                    @Override
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                        User user = new User();

                        user.setUserNo(rs.getInt("user_no"));
                        user.setUserId(rs.getString("user_id"));
                        user.setUserPassword(rs.getString("user_password"));
                        user.setUserName(rs.getString("user_name"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("signup_date") + " " + rs.getTime("signup_date");
                        user.setSignUpDate(printDate.parse(dbDate));

                        return user;
                    }
                }, userNo
        );
        return results.isEmpty() ? null : results.get(0);
    }

    public void update(User user) {
        String query = "update user_table set user_password = ?, user_name = ? where user_no = ?";

        jdbcTemplate.update(query, user.getUserPassword() , user.getUserName(), user.getUserNo());
    }

    public void delete(Integer userNo){
        String query = "delete from user_table where user_no = ?";

        jdbcTemplate.update(query, userNo);
    }

    public User signIn(String userId) {
        List<User> results = jdbcTemplate.query(
                "select user_password from user_table " +
                        "where user_Id = ?",
                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                        User user = new User();
                        user.setUserPassword(rs.getString("user_password"));

                        return user;
                    }
                }, userId
        );
        return results.isEmpty() ? null : results.get(0);
    }
}
