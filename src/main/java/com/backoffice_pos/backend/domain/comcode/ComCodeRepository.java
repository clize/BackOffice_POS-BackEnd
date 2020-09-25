package com.backoffice_pos.backend.domain.comcode;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ComCodeRepository extends JpaRepository<MtComCode, String> {

    @Query("SELECT p FROM MtComCode p where p.largcd = '00000' ORDER BY p.medcd DESC")
    List<MtComCode> findAllDesc();

}
