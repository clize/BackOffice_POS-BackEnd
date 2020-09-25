package com.backoffice_pos.backend.domain.comcode;

import lombok.Data;
import java.io.Serializable;

@Data
class MtComCodePK implements Serializable {
    private String largcd;
    private String medcd;
}