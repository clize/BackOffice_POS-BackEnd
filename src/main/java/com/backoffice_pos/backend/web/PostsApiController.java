package com.backoffice_pos.backend.web;

import com.backoffice_pos.backend.service.PostsService;
import com.backoffice_pos.backend.web.dto.Posts.PostsListResponseDto;
import com.backoffice_pos.backend.web.dto.Posts.PostsResponseDto;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("api/v1/posts")
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @GetMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<PostsListResponseDto>> findAll() {

        List<PostsListResponseDto> postsResponseDtoList = postsService.findAllDesc();

        return new ResponseEntity<List<PostsListResponseDto>>(postsResponseDtoList, HttpStatus.OK);
    }

//    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
//    public ResponseEntity<PostsResponseDto> findById(@PathVariable("Id" Long Id)) {
//        PostsResponseDto postsResponseDto
//    }

//    @GetMapping("/list")
//    public List<PostsListResponseDto> findAll(){
//        return postsService.findAllDesc();
//    }

//    @PostMapping("/api/v1/posts")
//    public Long save(@RequestBody PostsSaveRequestDto requestDto){
//        return postsService.save(requestDto);
//    }

//    @GetMapping("/api/v1/posts/{id}")
//    public PostsResponseDto findById(@PathVariable Long id) {
//        return postsService.findById(id);
//    }



}
