package com.backoffice_pos.backend.domain.comcode;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter  // 클래스 내 모든 필드의, Gatter를 자동 생성, 롬북의 어노테이션
@NoArgsConstructor // 기본생성자 자동 추가, 롬북의 어노테이션
@Data
@Entity // 테이블과 링크될 클래스를 나타냄, JPA의 어노테이션
//@Table( name = "MT_COM_CODE")
@IdClass(MtComCodePK.class)
@Table( name = "MT_COM_CODE")
public class MtComCode {


    @Id  // PK 필드
//    @GeneratedValue(strategy = GenerationType.AUTO) // PK의 생성 규칙
//    @Column
    private String largcd;

    @Id  // PK 필드
    private String medcd;

    @Column( length = 100, nullable = false)
    private String largcd_nm;


    @Column
    private String medcd_nm;
    private String use_yn;
    private String chg_id;
    private String chg_dt;
    private String reg_id;
    private String reg_dt;

    @Builder  // 빌터 패턴 클래스를 생성
    public MtComCode(String largcd,String largcd_nm,String medcd,  String medcd_nm, String use_yn
                                    , String chg_dt, String chg_id
                                    , String reg_dt, String reg_id) {
        this.largcd = largcd;
        this.largcd_nm = largcd_nm;
        this.medcd = medcd;
        this.medcd_nm = medcd_nm;
        this.use_yn = use_yn;

        this.chg_dt = chg_dt;
        this.chg_id = chg_id;
        this.reg_dt = reg_dt;
        this.reg_id = reg_id;

    }

}
