package com.backoffice_pos.backend.service;


import com.backoffice_pos.backend.domain.comcode.MtComCode;
import com.backoffice_pos.backend.domain.comcode.ComCodeRepository;

import com.backoffice_pos.backend.web.dto.comcode.ComCodeListResponseDto;
import com.backoffice_pos.backend.web.dto.comcode.ComCodeResponseDto;
import com.backoffice_pos.backend.web.dto.comcode.ComCodeSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ComCodeService {

    private final ComCodeRepository comCodeRepository;

    @Transactional(readOnly = true)
    public List<ComCodeListResponseDto> findAllDesc() {
        return comCodeRepository.findAllDesc().stream()
                .map(ComCodeListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public ComCodeResponseDto findById(String largcd) {
        MtComCode entity = comCodeRepository.findById(largcd)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + largcd));
        return new ComCodeResponseDto(entity);
    }

    @Transactional
    public List<ComCodeListResponseDto> findByLargcd(String largcd) {
        return comCodeRepository.findByLargcd(largcd).stream()
                .map(ComCodeListResponseDto::new)
                .collect(Collectors.toList());
    }



}
