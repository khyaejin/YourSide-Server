package com.likelion.yourside.comment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

public class CommentListResponseDto {

    @Getter @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class CommentResponse {
        private Long id;
        private String nickname;
        @JsonProperty("created_at")
        private String createdAt;
        private String content;
        @JsonProperty("is_liked")
        private boolean liked;
        @JsonProperty("is_disliked")
        private boolean disliked;
        @JsonProperty("like_count")
        private Integer likeCount;
        @JsonProperty("dislike_count")
        private Integer dislikeCount;
    }

    @Getter @Setter
    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SearchCommentRes{
        private List<CommentResponse> comments;

        public SearchCommentRes(List<CommentResponse> comments){
            this.comments = comments;}
    }
}
