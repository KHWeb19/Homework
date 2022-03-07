package com.example.demo.repository.proBank12;

import com.example.demo.entity.proBank10.Product;
import com.example.demo.entity.proBank12.Student;
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
public class StudentRepository {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> list(){
        List<Student> results = jdbcTemplate.query(
                "select student_no, student_name, korean_score, english_score, math_score  from student " +
                        "where student_no > 0 order by student_no desc",

                new RowMapper<Student>() {
                    @SneakyThrows
                    @Override
                    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Student student = new Student();

                        student.setStudentNo(rs.getInt("student_no"));
                        student.setName(rs.getString("student_name"));
                        student.setKoreanScore(rs.getInt("korean_score"));
                        student.setEnglishScore(rs.getInt("english_score"));
                        student.setMathScore(rs.getInt("math_score"));


                        return student;
                    }
                }
        );

        return results;
    }

    public void create(Student student){
        String query = "insert into student (student_name, korean_score, english_score, math_score) value (?,?,?,?)";

        jdbcTemplate.update(query,student.getName(),student.getKoreanScore(),student.getEnglishScore(),student.getMathScore());

    }
}
