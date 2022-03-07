package com.example.homework.repository;

import com.example.homework.entity.order10th.Market;
import com.example.homework.entity.order11th.Member;
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

    public void create(Member member) {
        String query = "insert into member (name, id, pw, age, title, selfPR) values(?, ?, ?, ?, ?, ?)";
        //market에 삽입해라(title, content)에 values(?, ?)를

        //↓위의 DB쿼리에 대응하는 녀석들이 이것들이다.
        jdbcTemplate.update(query, member.getName(), member.getId(), member.getPw(), member.getAge(), member.getTitle(), member.getSelfPR());
    }

    public List<Member> list() {
        // jdbcTemplate.query(A, B)
        // A에 해당하는 DB Query를 실행함
        // B에는 A에 배치될 정보들이 들어가며
        // 현재 RowMapper가 이 정보를 하나하나 처리해주고 있음
        // 모든 데이터를 싹 다 가져오게 되어있음
        List<Member> results = jdbcTemplate.query(
                "select * from member " + "where member_no > 0 order by member_no desc", //이게 A

                //RowMapper란? 원하는 형태의 결과값을 반환하게 해주는 인터페이스
                new RowMapper<Member>() {
                    @Override
                    public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Member member = new Member();

                        member.setMemberNo(rs.getInt("member_no"));
                        member.setName(rs.getString("name"));
                        member.setId(rs.getString("id"));
                        member.setPw(rs.getString("pw"));
                        member.setAge(rs.getInt("age"));
                        member.setTitle(rs.getString("title"));
                        member.setSelfPR(rs.getString("selfPR"));

                        return member;
                    }
                }
        );
        return results; //List의 결과를 return해라
    }

    public Member read(Integer memberNo) {
        List<Member> results = jdbcTemplate.query(
                "select * from member " +
                        "where member_no = ?", //이게 A

                //RowMapper란? 원하는 형태의 결과값을 반환하게 해주는 인터페이스.
                new RowMapper<Member>() {
                    @SneakyThrows
                    @Override
                    public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Member member = new Member();

                        member.setMemberNo(rs.getInt("member_no"));
                        member.setName(rs.getString("name"));
                        member.setId(rs.getString("id"));
                        member.setPw(rs.getString("pw"));
                        member.setAge(rs.getInt("age"));
                        member.setTitle(rs.getString("title"));
                        member.setSelfPR(rs.getString("selfPR"));

                        return member; //market의 내용을 return해라
                    }
                }, memberNo
        );

        //정보를 찾지 못했다면 null, 있다면 해당 내용 리턴(0번 인덱스 - 한 개)
        //그 해당내용이라는 걸 바로 위의 productNo로 확인하는 건가?
        //이거 구조 파악하기가 좀 어렵네...
        return results.isEmpty() ? null : results.get(0);
    }


    // jdbcTemplate.query(A, B)
    // A에 해당하는 DB Query를 실행함
    // B에는 A에 배치될 정보들이 들어가며
    // 현재 RowMapper가 이 정보를 하나하나 처리해주고 있음
    // 모든 데이터를 싹 다 가져오게 되어있음
    public Member findMemberById(Member member) {
        List<Member> results = jdbcTemplate.query(
                "select * from member where id = ?", //이게 A

                new RowMapper<Member>() {
                    @SneakyThrows
                    @Override
                    public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Member member = new Member(); //멤버 객체화

                        member.setPw(rs.getString("pw")); //pw를 설정

                        return member;
                    }
                }, member.getId()
        );

        return results.isEmpty() ? null : results.get(0);
        //0번째 list가 null인 경우 isEmpty로 값을 return해라(NullPointException이 발생하지 않도록)
    }

    public void remove(Integer memberNo){
        String query = "delete from member where member_no = ?";

        jdbcTemplate.update(query, memberNo);
    }

    public void update(Member member) {
        String query = "update member set title = ?, selfPR = ? where member_no = ?";

        jdbcTemplate.update(query, member.getTitle(), member.getSelfPR(), member.getMemberNo());
    }
}
