package com.example.demo.repository;

import com.example.demo.entity.order45.Student;
import com.example.demo.entity.order45.StudentSum;
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

    public void create(Student student) {
        String query = "insert into student (student_name, korean, english, math) value(?,?,?,?)";
        jdbcTemplate.update(query,student.getStudent_name(),student.getKorean(),student.getEnglish(),student.getMath());
    }


    public List<Student> list() {
        List<Student> results = jdbcTemplate.query(
                "select student_no, student_name, korean, english, math, reg_date from student " +
                        "where student_no > 0 order by student_no desc",


                new RowMapper<Student>() {
                    @SneakyThrows
                    @Override
                    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Student student = new Student();

                        student.setStudent_no(rs.getInt("student_no"));
                        student.setStudent_name(rs.getString("student_name"));
                        student.setKorean(rs.getInt("korean"));
                        student.setEnglish(rs.getInt("english"));
                        student.setMath(rs.getInt("math"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") +" "+rs.getTime("reg_date");
                        student.setRegDate(printDate.parse(dbDate));

                        return student;
                    }
                }
        );
        return results;
    }

//    public List<Student> list2() {
//        List<Student> results = jdbcTemplate.query(
//                "select student_no, student_name, korean, english, math, reg_date from student " +
//                        "where student_no > 0 order by student_no desc",
//
//
//                new RowMapper<Student>() {
//                    @SneakyThrows
//                    @Override
//                    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                        Student student = new Student();
//
//                        student.setStudent_no(rs.getInt("student_no"));
//                        student.setStudent_name(rs.getString("student_name"));
//                        student.setKorean(rs.getInt("korean"));
//                        student.setEnglish(rs.getInt("english"));
//                        student.setMath(rs.getInt("math"));
//
//                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                        String dbDate = rs.getDate("reg_date") +" "+rs.getTime("reg_date");
//                        student.setRegDate(printDate.parse(dbDate));
//
//                        return student;
//                    }
//                }
//        );
//        return results;
//    }

    public List<Student> list2() {
        List<Student> results = jdbcTemplate.query(
                "select count(*) as studentTotal, sum(korean) as koreanSum, sum(korean) as englishSum, sum(korean) as mathSum from student",


                new RowMapper<Student>() {
                    @SneakyThrows
                    @Override
                    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Student student = new Student();

                        student.setStudentTotal(rs.getInt("studentTotal"));
                        student.setKoreanSum(rs.getInt("koreanSum"));
                        student.setEnglishSum(rs.getInt("englishSum"));
                        student.setMathSum(rs.getInt("mathSum"));

                        return student;
                    }
                }
        );
        return results;
    }
}
