package com.backoffice_pos.backend.web.dto.comcode;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ComCodeUpdateRequestDto {

    private String largcd;
    private String largcd_nm;
    private String medcd;
    private String medcd_nm;
    private String use_yn;
    private String chg_id;
    private String chg_dt;
    private String reg_id;
    private String reg_dt;

    @Builder
    public ComCodeUpdateRequestDto (String largcd,String largcd_nm,String medcd
            , String medcd_nm, String use_yn
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
