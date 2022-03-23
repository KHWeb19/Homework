package com.example.demo.entity.jpa;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity //이 태그가 붙은 클래스는 JPA가 관리. 엔티티라고 불린다. 테이블과 매핑된다.
public class VueJpaMember {
    @Id //기본 키(Primary key) 매핑
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberNo;

    //Column: 필드와 컬럼 매핑
    @Column(length = 20, nullable = false) //글자수 20자까지, null허용상태 = false
            //실제 비밀번호 자릿수 제한과는 별개이다. <- 이건 vue에서 검사하도록 하자.
    private String id;

    @Column(length = 20, nullable = false)
    private String pw;

    @CreationTimestamp //해당 멤버 정보 만들었을 때의 Timestamp
    private Date createdDate;

    @UpdateTimestamp //해당 멤버 정보 수정한 후의 Timestamp
    private Date lastModifiedDate;
}