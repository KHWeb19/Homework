package com.example.demo.repository;

import com.example.demo.entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ScoreRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Score> list() {
        List<Score> results = jdbcTemplate.query(
                "select * from scoreboard " +
                        "where student_no > 0 order by student_no desc",
                new RowMapper<Score>() {
                    @Override
                    public Score mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Score score = new Score();

                        score.setStudentNo(rs.getInt("student_no"));
                        score.setName(rs.getString("name"));
                        score.setKorean(rs.getInt("korean"));
                        score.setMath(rs.getInt("math"));
                        score.setEnglish(rs.getInt("english"));
                        double avg = (double)(rs.getInt("korean") + rs.getInt("english")+ rs.getInt("math"))/3.0;
                        // System.out.println("!!!!!!!!!!!!!!!"+avg);
                        score.setScoreAvg(avg);

                        return score;
                    }
                }
        );

        return results;
    }

    public void register(Score score) {
        String query = "insert into scoreboard (name, korean, math, english, score_avg) value (?, ?, ?, ?, ?)";
        double avg = (score.getKorean() + score.getEnglish() + score.getMath())/3.0;
        jdbcTemplate.update(query, score.getName(), score.getKorean(), score.getMath(), score.getEnglish(), avg);
    }

    public Score read(Integer studentNo) {
        List<Score> result = jdbcTemplate.query(
                "select * from scoreboard where student_no = ?",
                new RowMapper<Score>() {
                    @Override
                    public Score mapRow(ResultSet rs, int rowNum) throws SQLException {

                        Score score = new Score();

                        score.setStudentNo(rs.getInt("student_no"));
                        score.setName(rs.getString("name"));
                        score.setKorean(rs.getInt("korean"));
                        score.setMath(rs.getInt("math"));
                        score.setEnglish(rs.getInt("english"));
                        score.setEnglish(rs.getInt("score_avg"));

                        return score;
                    }
                }, studentNo
        );
        return result.isEmpty() ? null : result.get(0);
    }

    public void delete(Integer studentNo) {
        String query = "delete from scoreboard where student_no = ?";

        jdbcTemplate.update(query, studentNo);
    }

    public void update(Score score) {
        String query = "update scoreboard set name = ?, korean = ?, math = ?, english = ? where student_no = ?";

        jdbcTemplate.update(query, score.getName(), score.getKorean(), score.getMath(), score.getEnglish(), score.getStudentNo());
    }

    public List<Score> listAvg() {
        List<Score> result = jdbcTemplate.query(
                "select avg(korean), avg(math), avg(english), avg(score_avg) from scoreboard;",
                new RowMapper<Score>() {
                    @Override
                    public Score mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Score score = new Score();

                        score.setKoreanAvg(rs.getDouble("avg(korean)"));
                        score.setMathAvg(rs.getDouble("avg(math)"));
                        score.setEnglishAvg(rs.getDouble("avg(english)"));
                        score.setClassAvg(rs.getDouble("avg(score_avg)"));

                        return score;
                    }
                }
        );
        return result;
    }

}
