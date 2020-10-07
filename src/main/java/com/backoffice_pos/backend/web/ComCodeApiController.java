package com.backoffice_pos.backend.web;

import com.backoffice_pos.backend.service.ComCodeService;
import com.backoffice_pos.backend.web.dto.Posts.PostsListResponseDto;
import com.backoffice_pos.backend.web.dto.Posts.PostsResponseDto;
import com.backoffice_pos.backend.web.dto.comcode.ComCodeListResponseDto;
import com.backoffice_pos.backend.web.dto.comcode.ComCodeResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/get/comcode/list")
@CrossOrigin(origins = "http://localhost:3000")
public class ComCodeApiController {

    private final ComCodeService comCodeService;

        @GetMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
        public ResponseEntity<List<ComCodeListResponseDto>> findAll() {
            List<ComCodeListResponseDto> comCodeResponseDtoList = comCodeService.findAllDesc();

            return new ResponseEntity<List<ComCodeListResponseDto>>(comCodeResponseDtoList, HttpStatus.OK);
        }

        @GetMapping(value = "/{largcd}", produces = {MediaType.APPLICATION_JSON_VALUE})
        public ResponseEntity<List<ComCodeListResponseDto>> findByLargcd(@PathVariable("largcd") String Largcd) {
            List<ComCodeListResponseDto> comCodeResponseDtoList = comCodeService.findByLargcd(Largcd);
            return new ResponseEntity<List<ComCodeListResponseDto>>(comCodeResponseDtoList, HttpStatus.OK);
        }

}
