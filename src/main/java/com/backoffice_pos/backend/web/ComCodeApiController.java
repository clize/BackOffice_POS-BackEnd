package com.backoffice_pos.backend.web;

import com.backoffice_pos.backend.service.ComCodeService;
import com.backoffice_pos.backend.web.dto.comcode.ComCodeListResponseDto;
import com.backoffice_pos.backend.web.dto.comcode.ComCodeResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ComCodeApiController {

    private final ComCodeService comCodeService;

    @GetMapping("/api/get/comcode/lc/{largcd}")
    public ComCodeResponseDto findById(@PathVariable String largcd) {
        return comCodeService.findById(largcd);
    }

    @GetMapping("/api/get/comcode/list")
    public List<ComCodeListResponseDto> findAllI(){
        return comCodeService.findAllDesc();
    }

}
