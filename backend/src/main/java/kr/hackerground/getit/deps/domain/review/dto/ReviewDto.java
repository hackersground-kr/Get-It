package kr.hackerground.getit.deps.domain.review.dto;

import kr.hackerground.getit.deps.domain.review.entity.Review;
import lombok.*;

@Getter
@Setter
public class ReviewDto {
    @Getter @Setter @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request{
        Short starRate;
        String content;
        String title;
    }

    @Getter
    public static class Response{

        Short starRate;
        String content;
        String title;

        String userImagePath;
        String timeStamp;
        public Response(Review review) {
            this.starRate = review.getStarRate();
            this.content = review.getContent();
            this.title = review.getTitle();

            this.userImagePath = review.getUser().getImagePath();
            this.timeStamp = review.getUser().getTimeStamp();
        }
    }
}
