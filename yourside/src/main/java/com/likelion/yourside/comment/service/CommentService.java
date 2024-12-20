package com.likelion.yourside.comment.service;

import com.likelion.yourside.comment.dto.CommentCreateDto;
import com.likelion.yourside.comment.dto.CommentDislikeDto;
import com.likelion.yourside.comment.dto.CommentLikeDto;
import com.likelion.yourside.util.response.CustomAPIResponse;
import org.springframework.http.ResponseEntity;

public interface CommentService {
    ResponseEntity<CustomAPIResponse<?>> createComment(CommentCreateDto.Req req);
    ResponseEntity<CustomAPIResponse<?>> getAllComment(Long userId, Long postingId);
    ResponseEntity<CustomAPIResponse<?>> addLikeOrDelete(CommentLikeDto.Req req);
    ResponseEntity<CustomAPIResponse<?>> addDislikeOrDelete(CommentDislikeDto.Req req);
}
