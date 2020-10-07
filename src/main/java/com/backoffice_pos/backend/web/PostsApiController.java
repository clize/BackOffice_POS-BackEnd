package com.backoffice_pos.backend.web;

import com.backoffice_pos.backend.service.PostsService;
import com.backoffice_pos.backend.web.dto.Posts.PostsListResponseDto;
import com.backoffice_pos.backend.web.dto.Posts.PostsResponseDto;

import com.backoffice_pos.backend.web.dto.Posts.PostsSaveRequestDto;
import com.backoffice_pos.backend.web.dto.Posts.PostsUpdateRequestDto;
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

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<PostsResponseDto> findById(@PathVariable("id") Long Id) {
        PostsResponseDto postsResponseDto = postsService.findById(Id);

        return new ResponseEntity<PostsResponseDto>(postsResponseDto, HttpStatus.OK);
    }

    /** 게시글 - 수정 */
    @PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<Long> update(@PathVariable("id") Long Id, @RequestBody PostsUpdateRequestDto postsUpdateRequestDto) {

        Long updatepostsSeq = postsService.update(Id, postsUpdateRequestDto);

        return new ResponseEntity<Long>(updatepostsSeq, HttpStatus.CREATED);
    }

    @DeleteMapping(value ="/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Long> delete(@PathVariable("id") Long postsSeq) {
        postsService.delete(postsSeq);

        return new ResponseEntity<Long>(postsSeq, HttpStatus.NO_CONTENT);
    }

    /** 게시글 - 등록 */
    @PostMapping(value = "", produces =  {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Long> save(@RequestBody PostsSaveRequestDto postsSaveRequestDto) {
        Long savePostsSeq = postsService.save(postsSaveRequestDto);

        return new ResponseEntity<Long>(savePostsSeq, HttpStatus.CREATED);
    }



}
