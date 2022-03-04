package com.example.demo.repository.hw;

import com.example.demo.entity.hw.Member;

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

    public void create (Member member){
        String query = "insert into member(id, password, name, phoneNo) values (?,?,?,?)";

        jdbcTemplate.update(query, member.getId(), member.getPassword(), member.getName(), member.getPhoneNo());
    }

    public List<Member> list() {
        List<Member> results = jdbcTemplate.query(
                "select member_no, id, password, name, phoneNo from member "+
                        "where member_no > 0 order by member_no desc",
                new RowMapper<Member>() {
                    @SneakyThrows
                    @Override
                    public Member mapRow(ResultSet rs, int rowNum) throws SQLException{
                        Member member = new Member();

                        member.setMemberNo(rs.getInt("member_no"));
                        member.setId(rs.getString("id"));
                        member.setPassword(rs.getString("password"));
                        member.setName(rs.getString("name"));
                        member.setPhoneNo(rs.getString("phoneNo"));

                        return member;
                    }
                }
        );
        return results;
    }

    public Member read(Integer memberNo){
        List<Member> results = jdbcTemplate.query(
                "select * from member "+
                        "where member_no = ?",
                new RowMapper<Member>(){
                    @SneakyThrows
                    @Override
                    public Member mapRow(ResultSet rs, int rowNum) throws SQLException{
                        Member member = new Member();

                        member.setMemberNo(rs.getInt("member_no"));
                        member.setId(rs.getString("id"));
                        member.setPassword(rs.getString("password"));
                        member.setName(rs.getString("name"));
                        member.setPhoneNo(rs.getString("phoneNo"));

                        return member;
                    }
                }, memberNo
        );

        return results.isEmpty() ? null : results.get(0);
    }

    public void delete (Integer memberNo){
        String query = "delete from member where member_no = ?";

        jdbcTemplate.update(query, memberNo);
    }
    public void update (Member member){
        String query ="update member set id = ?, password = ?, name = ?, phoneNo= ? where member_no = ?";

        jdbcTemplate.update(query, member.getId(), member.getPassword(), member.getName(), member.getPhoneNo(), member.getMemberNo());
    }

    public void login (String id, String password) {
        List<Member> results = jdbcTemplate.query("select id, password from member where id = ?, password = ?",
                new RowMapper<Member>() {
                    @SneakyThrows
                    @Override
                    public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Member member = new Member();

                        member.setMemberNo(rs.getInt("member_no"));
                        member.setId(rs.getString("id"));
                        member.setPassword(rs.getString("password"));
                        member.setName(rs.getString("name"));
                        member.setPhoneNo(rs.getString("phoneNo"));

                        return member;
                    }
                }
        );
    }
}

