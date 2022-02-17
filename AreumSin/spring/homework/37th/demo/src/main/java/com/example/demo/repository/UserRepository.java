package com.example.demo.repository;

import com.example.demo.entity.User;
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
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(User user){
        String query = "insert into usermanagersystem (user_id, user_passwd, user_name) value (?, ?, ?)";
        jdbcTemplate.update(query, user.getId(), user.getPasswd(), user.getName());
    }

    public List<User> list() {

        List<User> result = jdbcTemplate.query(
                "select user_no, user_id, user_passwd, user_name, reg_date from usermanagersystem " +
                        "where user_no > 0 order by user_no desc",

                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {

                        User user = new User();

                        user.setUserNo(rs.getInt("user_no"));
                        user.setId(rs.getString("user_id"));
                        user.setPasswd(rs.getString("user_passwd"));
                        user.setName(rs.getString("user_name"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date")+" "+rs.getTime("reg_date");
                        try {
                            user.setRegDate(printDate.parse(dbDate));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                        return user;
                    }
                }
        );
        return result;
    }

    public User read(Integer userNo) {
        List<User> result = jdbcTemplate.query(
                "select * from usermanagersystem " +
                        "where user_no = ?",

                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {

                        User user = new User();

                        user.setUserNo(rs.getInt("user_no"));
                        user.setId(rs.getString("user_id"));
                        user.setPasswd(rs.getString("user_passwd"));
                        user.setName(rs.getString("user_name"));

                        return user;
                    }
                },userNo
        );

        return result.isEmpty() ? null : result.get(0);
    }

    public void modify(User user) {
        String query = "update usermanagersystem set user_id = ?, user_passwd = ?, user_name = ? where user_no = ?";

        jdbcTemplate.update(query, user.getId(), user.getPasswd(), user.getName(), user.getUserNo());
    }

    public void remove(Integer userNo) {
        String query = "delete from usermanagersystem where user_no = ?";

        jdbcTemplate.update(query, userNo);
    }

    public boolean check(User user) {

        List<User> result2 = jdbcTemplate.query(
                "select user_id from usermanagersystem " +
                        "where user_passwd=?",

                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                        User user = new User();

                        return user;
                    }
                },user.getPasswd()
        );
        return result2.isEmpty() ? true : false;
    }

}
