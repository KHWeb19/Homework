package com.example.demo.repository;

import com.example.demo.entity.BankBoard;
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
public class BankBoardRepository { //저장소에 저장하기, 목록 불러오기, 수정하기,삭제,업데이트

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(BankBoard bankBoard) {

        String query = "insert into bankBoard (bank_Id, bankPassword, address,phoneNum) values (?,?, ?, ?)";
        jdbcTemplate.update(query, bankBoard.getBank_Id(), bankBoard.getBankPassword(), bankBoard.getAddress(), bankBoard.getPhoneNum());
    }

    public List<BankBoard> list() {

        List<BankBoard> results = jdbcTemplate.query(
                "select member_no, bank_Id, bankPassword, bankPassword,address, phoneNum from bankBoard " +
                        "where member_no > 0 order by member_no desc",

                // 요놈이 하나씩 넘겨줌
                new RowMapper<BankBoard>() {
                    @SneakyThrows
                    @Override
                    public BankBoard mapRow(ResultSet rs, int rowNum) throws SQLException {
                        BankBoard bankBoard = new BankBoard();

                        bankBoard.setMemberNo(rs.getInt("member_No"));
                        bankBoard.setBank_Id(rs.getString("bank_Id"));
                        bankBoard.setBankPassword(rs.getString("bankPassword"));
                        bankBoard.setAddress(rs.getString("address"));
                        bankBoard.setPhoneNum(rs.getInt("phoneNum"));

                        return bankBoard;
                    }
                }
        );

        return results;
    }

    public BankBoard read(Integer memberNo) {
        List<BankBoard> results = jdbcTemplate.query(
                "select * from bankBoard " +
                        "where member_no = ?",

                new RowMapper<BankBoard>() {
                    @SneakyThrows
                    @Override
                    public BankBoard mapRow(ResultSet rs, int rowNum) throws SQLException {
                        BankBoard bankBoard = new BankBoard();

                        bankBoard.setMemberNo(rs.getInt("member_No"));
                        bankBoard.setBank_Id(rs.getString("bank_Id"));
                        bankBoard.setBankPassword(rs.getString("bankPassword"));
                        bankBoard.setAddress(rs.getString("address"));
                        bankBoard.setPhoneNum(rs.getInt("phoneNum"));

                        return bankBoard;
                    }
                }, memberNo
        );

        return results.isEmpty() ? null : results.get(0);
    }
    public void delete(Integer memberNo) {
        String query = "delete from bankBoard where member_no = ?";

        jdbcTemplate.update(query, memberNo);
    }

    public void update(BankBoard bankBoard) {
        String query = "update bankBoard set bank_Id = ?, bankPassword = ?, address = ?,phoneNum = ?, where member_no = ?";

        jdbcTemplate.update(query,bankBoard.getBank_Id(), bankBoard.getBankPassword(), bankBoard.getAddress(), bankBoard.getPhoneNum(),bankBoard.getMemberNo());
    }




}



