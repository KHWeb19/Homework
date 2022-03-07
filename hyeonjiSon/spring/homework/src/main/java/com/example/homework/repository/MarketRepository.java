package com.example.homework.repository;

import com.example.homework.entity.order10th.Market;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MarketRepository { //관리 데이터베이스

    /*
    Jdbc(Java DataBase Connectivity) 자바에서 데이터베이스에 접속할 수 있도록 하는 자바 API
    JdbcTemplate(jdbc를 위한 툴) - DB와 연동하기 위해 SQL연산들을 수행할 수 있도록 도와주는 기술
     */
    @Autowired
    private JdbcTemplate jdbcTemplate; //Lecture demo에서는 나오는데 왜 여기에선 안되는거지?
    //@Repository를 넣고나니 Alt+Enter로 생성할 수 있었다. 해결!

    public void create(Market market) {
        String query = "insert into market (title, content, seller) values(?, ?, ?)";
        //market에 삽입해라(title, content)에 values(?, ?)를

        //↓위의 DB쿼리에 대응하는 녀석들이 이것들이다.
        jdbcTemplate.update(query, market.getTitle(), market.getContent(), market.getSeller());
    }

    public List<Market> list() {
        // jdbcTemplate.query(A, B)
        // A에 해당하는 DB Query를 실행함
        // B에는 A에 배치될 정보들이 들어가며
        // 현재 RowMapper가 이 정보를 하나하나 처리해주고 있음
        // 모든 데이터를 싹 다 가져오게 되어있음
        List<Market> results = jdbcTemplate.query(
                "select * from market " + "where product_no > 0 order by product_no desc", //이게 A
                //이 근처가 문제인 거 같은데 도저히 원인을 못찾겠다

                //RowMapper란? 원하는 형태의 결과값을 반환하게 해주는 인터페이스.
                new RowMapper<Market>() {
                    @SneakyThrows
                    @Override
                    public Market mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Market market = new Market();

                        market.setProductNo(rs.getInt("product_no"));
                        market.setTitle(rs.getString("title"));
                        market.setContent(rs.getString("content"));
                        market.setSeller(rs.getString("seller"));

                        return market; //market의 내용을 return해라
                    }
                }
        );
        return results; //List의 결과를 return해라
    }

    public Market read(Integer productNo) {
        List<Market> results = jdbcTemplate.query(
                "select * from market " +
                        "where product_no = ?", //이게 A

                //RowMapper란? 원하는 형태의 결과값을 반환하게 해주는 인터페이스.
                new RowMapper<Market>() {
                    @SneakyThrows
                    @Override
                    public Market mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Market market = new Market();

                        market.setProductNo(rs.getInt("product_no"));
                        market.setTitle(rs.getString("title"));
                        market.setContent(rs.getString("content"));
                        market.setSeller(rs.getString("seller"));

                        return market; //market의 내용을 return해라
                    }
                }, productNo
        );

        //정보를 찾지 못했다면 null, 있다면 해당 내용 리턴(0번 인덱스 - 한 개)
        //그 해당내용이라는 걸 바로 위의 productNo로 확인하는 건가?
        //이거 구조 파악하기가 좀 어렵네...
        return results.isEmpty() ? null : results.get(0);
    }

    public void remove(Integer productNo){
        String query = "delete from market where product_no = ?";

        jdbcTemplate.update(query, productNo);
    }

    public void update(Market market) {
        String query = "update market set title = ?, content = ? where product_no = ?";

        jdbcTemplate.update(query, market.getTitle(), market.getContent(), market.getProductNo());
    }
}



//아직 read, modify, remove 가 남았다.