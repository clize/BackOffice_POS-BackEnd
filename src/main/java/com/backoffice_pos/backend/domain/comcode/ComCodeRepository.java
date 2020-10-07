package com.backoffice_pos.backend.domain.comcode;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ComCodeRepository extends JpaRepository<MtComCode, String> {

    @Query("SELECT p FROM MtComCode p ORDER BY p.medcd DESC")
    List<MtComCode> findAllDesc();

    List<MtComCode> findByLargcd(String largcd);

}
