package com.backoffice_pos.backend.web.dto.comcode;

import com.backoffice_pos.backend.domain.comcode.MtComCode;
import lombok.Getter;

@Getter
public class ComCodeResponseDto {

    private String largcd;
    private String medcd;
    private String medcd_nm;
    private String use_yn;
    private String chg_id;
    private String chg_dt;
    private String reg_id;
    private String reg_dt;

    public ComCodeResponseDto(MtComCode entity){
        this.largcd = entity.getLargcd();
        this.medcd = entity.getMedcd();
        this.medcd_nm = entity.getMedcd_nm();
        this.use_yn = entity.getUse_yn();
        this.chg_id = entity.getChg_id();
        this.chg_dt = entity.getChg_dt();
        this.reg_id = entity.getReg_id();
        this.reg_dt = entity.getReg_dt();

    }

}
