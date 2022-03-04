package com.example.demo.repository.probank11;

import com.example.demo.entity.probank11.MemberManage;
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
        String query = "insert into membermanage (name, id, password) " +
                "values (?, ?, ?)";

        jdbcTemplate.update(query,memberManage.getName(), memberManage.getId(), memberManage.getPassword());
    }

    public List<MemberManage> list() {
        List<MemberManage> results = jdbcTemplate.query(
                "select member_no, id, password, name, reg_date from membermanage " +
                        "where member_no > 0 order by member_no desc",

                new RowMapper<MemberManage>() {
                    @SneakyThrows
                    @Override
                    public MemberManage mapRow(ResultSet rs, int rowNum) throws SQLException {
                        MemberManage memberManage = new MemberManage();

                        memberManage.setMemberNo(rs.getInt("member_no"));
                        memberManage.setId(rs.getString("id"));
                        memberManage.setPassword(rs.getString("password"));
                        memberManage.setName(rs.getString("name"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd");
                        String dbDate = rs.getDate("reg_date") + " ";
                        memberManage.setRegDate(printDate.parse(dbDate));

                        return memberManage;
                    }
                }
        );

        return results;

    }

    public MemberManage read (Integer memberNo) {
        List<MemberManage> results = jdbcTemplate.query(
                "select * from membermanage " +
                        "where member_no = ?",

                new RowMapper<MemberManage>() {
                    @SneakyThrows
                    @Override
                    public MemberManage mapRow(ResultSet rs, int rowNum) throws SQLException {
                        MemberManage memberManage = new MemberManage();

                        memberManage.setMemberNo(rs.getInt("member_no"));
                        memberManage.setId(rs.getString("id"));
                        memberManage.setPassword(rs.getString("password"));
                        memberManage.setName(rs.getString("name"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd");
                        String dbDate = rs.getDate("reg_date") + " ";
                        memberManage.setRegDate(printDate.parse(dbDate));

                        return memberManage;
                    }
                } , memberNo
        );

        return results.isEmpty() ? null : results.get(0);

    }

    public void delete (Integer memberNo){
        String query = "delete from membermanage where member_no = ?";

        jdbcTemplate.update(query, memberNo);
    }

    public void update (MemberManage memberManage){
        String query = "update membermanage set id = ?, password = ?, name = ?" +
                "where member_no = ?";

        jdbcTemplate.update(query, memberManage.getId(), memberManage.getPassword(), memberManage.getMemberNo(), memberManage.getMemberNo());
    }

}
