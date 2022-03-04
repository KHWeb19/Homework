package com.example.demo.repository.order37;

import com.example.demo.entity.order37.MemberManagementSystem;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MemberRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public MemberManagementSystem create(MemberManagementSystem memberManagementSystem) {
        String query = "insert into memberManagementSystem ( id, password, name, age, gender, phoneNumber) values (?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(query, memberManagementSystem.getId(), memberManagementSystem.getPassword(), memberManagementSystem.getName(), memberManagementSystem.getAge(), memberManagementSystem.getGender(), memberManagementSystem.getPhoneNumber());

        return memberManagementSystem;
    }

    public List<MemberManagementSystem> list(){
        List<MemberManagementSystem> results = jdbcTemplate.query(
                "select member_no, id, password, name, age, gender, phoneNumber from MemberManagementSystem " +
                        "where member_no > 0 order by member_no desc",

                new RowMapper<MemberManagementSystem>() {
                    @SneakyThrows
                    @Override
                    public MemberManagementSystem mapRow(ResultSet rs, int rowNum) throws SQLException {
                        MemberManagementSystem memberManagementSystem = new MemberManagementSystem();

                        memberManagementSystem.setMemberNo(rs.getInt("member_no"));
                        memberManagementSystem.setId(rs.getString("id"));
                        memberManagementSystem.setPassword(rs.getString("password"));
                        memberManagementSystem.setName(rs.getString("name"));
                        memberManagementSystem.setAge(rs.getInt("age"));
                        memberManagementSystem.setGender(rs.getString("gender"));
                        memberManagementSystem.setPhoneNumber(rs.getString("phoneNumber"));
                        return memberManagementSystem;
                    }
                }
        );
        return results;

    }


    public MemberManagementSystem read(Integer memberNo) {
        List<MemberManagementSystem> results = jdbcTemplate.query(
                "select * from MemberManagementSystem " +
                        "where member_no = ?",

                new RowMapper<MemberManagementSystem>() {
                    @SneakyThrows
                    @Override
                    public MemberManagementSystem mapRow(ResultSet rs, int rowNum) throws SQLException {
                        MemberManagementSystem memberManagementSystem = new MemberManagementSystem();

                        memberManagementSystem.setMemberNo(rs.getInt("member_no"));
                        memberManagementSystem.setId(rs.getString("id"));
                        memberManagementSystem.setPassword(rs.getString("password"));
                        memberManagementSystem.setName(rs.getString("name"));
                        memberManagementSystem.setAge(rs.getInt("age"));
                        memberManagementSystem.setGender(rs.getString("gender"));
                        memberManagementSystem.setPhoneNumber(rs.getString("phoneNumber"));
                        return memberManagementSystem;
                    }
                }, memberNo
        );

        return results.isEmpty() ? null : results.get(0);

    }

    public void delete(Integer memberNo){
        String query = "delete from MemberManagementSystem where member_no = ?";

        jdbcTemplate.update(query, memberNo);
    }

    public void update(MemberManagementSystem memberManagementSystem){
        String query = "update MemberManagementSystem set name = ?, age = ?, gender = ?, phoneNumber = ? where member_no = ?";

        jdbcTemplate.update(query, memberManagementSystem.getName(), memberManagementSystem.getAge(), memberManagementSystem.getGender(), memberManagementSystem.getPhoneNumber(), memberManagementSystem.getMemberNo());
    }
}
