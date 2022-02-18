package com.example.demo.repository.proBank11;


import com.example.demo.entity.proBank11.User;
import com.example.demo.entity.proBank11.UserCheck;
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

    boolean checkUser;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(User user) {

        String query = "insert into user_information (user_id, user_pw, nickName, email) value (?,?,?,?)";

        jdbcTemplate.update(query, user.getUserId(), user.getUserPw(), user.getNickName(), user.getEmail());

    }

    public List<User> list() {
        List<User> results = jdbcTemplate.query(
                "select * from user_information " +
                        "where user_no > 0 order by user_no desc",

                new RowMapper<User>() {
                    @SneakyThrows
                    @Override
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                        User user = new User();

                        user.setUserNo(rs.getInt("user_no"));
                        user.setUserId(rs.getString("user_id"));
                        user.setUserPw(rs.getString("user_pw"));
                        user.setEmail(rs.getString("email"));
                        user.setNickName(rs.getString("nickname"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        user.setRegDate(printDate.parse(dbDate));

                        return user;
                    }
                }
        );

        return results;
    }

    public boolean login(UserCheck userCheck) {
        //기존 db에서 user정보 어떻게 끌어올까나
        //로그인시 아이디 패스워드 입력하고 로그인 누르는 순간 정보입력 값을 받아서 그 값이랑 db에 있는 값이 같은지 구별하게 만들어야 되는가
        //->입력 값이랑 db값을 어디서 구하지
        //->register할때 thobject 했던 것처럼 값을 받아오는거임
        //-> db값은 list에있음 foreach사용 가능할까?

        //작동이 되긴하는데
        // 분명 다른 방법이 있겠지
        //클래스 내에 boolean = checkUser 만든것도 맘에 안들고요 어?

        for (User user : list()) {
            if (userCheck.getCheckUserId().equals(user.getUserId())
                    && userCheck.getCheckUserPw().equals(user.getUserPw())) {
                //System.out.println(user.getUserId() + " " + user.getUserPw());
                checkUser = true;
                break;

            } else {
                //System.out.println(user.getUserId() + " " + user.getUserPw());
                checkUser = false;
                continue;

            }

        }
        return checkUser;
    }
}
