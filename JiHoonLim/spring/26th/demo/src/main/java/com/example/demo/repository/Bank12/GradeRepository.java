package com.example.demo.repository.Bank12;

import com.example.demo.entity.Bank12.GradeManage;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class GradeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create (GradeManage gradeManage){
        String query = "insert into gradeManage (name, level, korean, english, math)" +
                "values (?, ?, ?, ?, ?)";

        jdbcTemplate.update(query, gradeManage.getName(), gradeManage.getLevel(), gradeManage.getKorean(),
                gradeManage.getEnglish(), gradeManage.getMath());
    }

    public List<GradeManage> list(){
        List<GradeManage> results = jdbcTemplate.query(
                "select * from gradeManage " +
                        "where studentNo > 0 order by studentNo desc",

                new RowMapper<GradeManage>() {
                    @SneakyThrows
                    @Override
                    public GradeManage mapRow(ResultSet rs, int rowNum) throws SQLException {
                        GradeManage gradeManage = new GradeManage();

                        gradeManage.setStudentNo(rs.getInt("studentNo"));
                        gradeManage.setName(rs.getString("name"));
                        gradeManage.setLevel(rs.getInt("level"));
                        gradeManage.setKorean(rs.getInt("korean"));
                        gradeManage.setEnglish(rs.getInt("english"));
                        gradeManage.setMath(rs.getInt("math"));


                        return gradeManage;
                    }
                }
        );
        return results;
    }

    public GradeManage read(Integer studentNo) {
        List<GradeManage> results = jdbcTemplate.query(
                "select * from gradeManage " +
                        "where studentNo = ?",

                new RowMapper<GradeManage>() {
                    @SneakyThrows
                    @Override
                    public GradeManage mapRow(ResultSet rs, int rowNum) throws SQLException {
                        GradeManage gradeManage = new GradeManage();

                        gradeManage.setStudentNo(rs.getInt("studentNo"));
                        gradeManage.setName(rs.getString("name"));
                        gradeManage.setLevel(rs.getInt("level"));
                        gradeManage.setKorean(rs.getInt("korean"));
                        gradeManage.setEnglish(rs.getInt("english"));
                        gradeManage.setMath(rs.getInt("math"));


                        return gradeManage;
                    }
                }, studentNo
        );
        return results.isEmpty() ? null : results.get(0);
    }

    public void update(GradeManage gradeManage){
        String query = "update gradeManage set name = ?, level = ?, " +
                "korean = ?, english = ?, math = ? where studentNo = ?";

        jdbcTemplate.update(query, gradeManage.getName(), gradeManage.getLevel(),
                gradeManage.getKorean(), gradeManage.getEnglish(), gradeManage.getMath(),gradeManage.getStudentNo());
    }

    public void delete(Integer studentNo){
        String query = "delete from gradeManage where studentNo = ?";

        jdbcTemplate.update(query, studentNo);
    }

}
