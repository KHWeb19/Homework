package com.example.demo.repository.Bank11;

import com.example.demo.entity.Bank11.MemberManage;
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

    public void create (MemberManage memberManage){
        String query = "insert into memberManage (id, pw, name, birth, phone)" +
                "values (?, ?, ?, ?, ?)";

        jdbcTemplate.update(query, memberManage.getId(), memberManage.getPw(), memberManage.getName(),
                            memberManage.getBirth(), memberManage.getPhone());
    }

    public List<MemberManage> list(){
        List<MemberManage> results = jdbcTemplate.query(
                "select * from memberManage " +
                        "where memberNo > 0 order by memberNo desc",

                new RowMapper<MemberManage>() {
                    @SneakyThrows
                    @Override
                    public MemberManage mapRow(ResultSet rs, int rowNum) throws SQLException {
                        MemberManage memberManage = new MemberManage();

                        memberManage.setMemberNo(rs.getInt("memberNo"));
                        memberManage.setId(rs.getString("id"));
                        memberManage.setPw(rs.getString("pw"));
                        memberManage.setName(rs.getString("name"));
                        memberManage.setBirth(rs.getInt("birth"));
                        memberManage.setPhone(rs.getInt("phone"));

                        SimpleDateFormat printDate =
                                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        memberManage.setRegDate(printDate.parse(dbDate));

                        return memberManage;
                    }
                }
        );
        return results;
    }

    public MemberManage read(Integer memberNo) {
        List<MemberManage> results = jdbcTemplate.query(
                "select * from memberManage " +
                        "where memberNo = ?",

                new RowMapper<MemberManage>() {
                    @SneakyThrows
                    @Override
                    public MemberManage mapRow(ResultSet rs, int rowNum) throws SQLException {
                        MemberManage memberManage = new MemberManage();

                        memberManage.setMemberNo(rs.getInt("memberNo"));
                        memberManage.setId(rs.getString("id"));
                        memberManage.setPw(rs.getString("pw"));
                        memberManage.setName(rs.getString("name"));
                        memberManage.setBirth(rs.getInt("birth"));
                        memberManage.setPhone(rs.getInt("phone"));

                        SimpleDateFormat printDate =
                                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        memberManage.setRegDate(printDate.parse(dbDate));

                        return memberManage;
                    }
                }, memberNo
        );
        return results.isEmpty() ? null : results.get(0);
    }

    public void update(MemberManage memberManage){
        String query = "update memberManage set id = ?, pw = ?, " +
                "phone = ? where memberNo = ?";

        jdbcTemplate.update(query, memberManage.getId(), memberManage.getPw(),
                memberManage.getPhone(), memberManage.getMemberNo());
    }

    public void delete(Integer memberNo){
        String query = "delete from memberManage where memberNo = ?";

        jdbcTemplate.update(query, memberNo);
    }

    public MemberManage findMemberById(MemberManage memberManage) {
        List<MemberManage> results = jdbcTemplate.query(
                "select * from memberManage where id = ?",

                new RowMapper<MemberManage>() {
                    @SneakyThrows
                    @Override
                    public MemberManage mapRow(ResultSet rs, int rowNum) throws SQLException {
                        MemberManage memberManage = new MemberManage();

                        memberManage.setPw(rs.getString("pw"));

                        return memberManage;
                    }
                }, memberManage.getId()
        );

        return results.isEmpty() ? null : results.get(0);
    }

}
