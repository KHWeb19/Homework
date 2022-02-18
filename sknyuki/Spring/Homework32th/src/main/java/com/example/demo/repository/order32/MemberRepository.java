package com.example.demo.repository.order32;

import com.example.demo.entity.order32.Member;
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
public class MemberRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create (Member member) {
        String query = "insert into member (Profile, content, writer) values (?, ?, ?)";


        jdbcTemplate.update(query, member.getProfile(), member.getContent(), member.getWriter());
    }

    public List<Member> list() {

        List<Member> results = jdbcTemplate.query(
                "select member_no, Profile, content, writer, reg_date from member " +
                        "where member_no > 0 order by member_no desc",


                new RowMapper<Member>() {
                    @SneakyThrows
                    @Override
                    public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Member member = new Member();

                        member.setMemberNo(rs.getInt("member_no"));
                        member.setProfile(rs.getString("Profile"));
                        member.setContent(rs.getString("content"));
                        member.setWriter(rs.getString("writer"));


                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");

                        member.setRegDate(printDate.parse(dbDate));

                        return member;
                    }
                }
        );

        return results;
    }

    public Member read(Integer memberNo) {
        List<Member> results = jdbcTemplate.query(
                "select * from member " +
                        "where member_no = ?",

                new RowMapper<Member>() {
                    @SneakyThrows
                    @Override
                    public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Member member = new Member();

                        member.setMemberNo(rs.getInt("member_no"));
                        member.setProfile(rs.getString("Profile"));
                        member.setContent(rs.getString("content"));
                        member.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");

                        member.setRegDate(printDate.parse(dbDate));

                        return member;
                    }
                }, memberNo
        );


        return results.isEmpty() ? null : results.get(0);
    }

    public void delete(Integer memberNo) {
        String query = "delete from member where member_no = ?";

        jdbcTemplate.update(query, memberNo);
    }

    public void update(Member member) {
        String query = "update member set Profile = ?, content = ? where member_no = ?";

        jdbcTemplate.update(query, member.getProfile(), member.getContent(), member.getMemberNo());
    }
}
