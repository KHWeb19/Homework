package com.example.demo.repository.jpa.order63;

import com.example.demo.entity.jpa.JpaMemberBoth;
import com.example.demo.entity.jpa.VueJpaMember;
import com.example.demo.entity.jpa.VueJpaMemberWithAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface JpaBmRepository extends JpaRepository<JpaMemberBoth, Long> {

    @Transactional
    //@Query(value = "select * from jpa_member where member_no in (select many_to_many_member_no from tbl_many_to_many_member_auth where auth = :auth)", nativeQuery = true)
    @Query(value = "select * from jpa_member_both where member_no in (select jpa_member_both_member_no from jpa_member_auth_both where auth = :auth)", nativeQuery = true)
    public List<JpaMemberBoth> selectMemberWithRole(String auth);
}

/*
↓ (jpa_member_both의 member_no를 선택한다. / ←auth가 :auth 인 jpa_member_auth_both)
------------
이 member_no에 있는 jpa_member_both Entity의 모든 정보를 선택하겠다?
"select * from jpa_member_both
                   where member_no in (select jpa_member_both_member_no / from jpa_member_auth_both where auth = :auth)"

                   ...?? 뭔말인것임?

:auth = auth의 Entity(jpa_member_auth_both)에서 jpa_member_both Entity의 member_no를 선택한다??
-------------
ㄴ auth = :auth는 무슨 뜻이지? 이게 사업자인지 개인인지를 받는 부분인건가?

jpa_member_both의 member_no를 모두 선택한다.
                    ㄴ 조건: jpa_member_both의 member_no는 jpa_member_auth_both Entity의...

jpa_member_auth_both에서 auth가 :auth(아마 business)면
 */