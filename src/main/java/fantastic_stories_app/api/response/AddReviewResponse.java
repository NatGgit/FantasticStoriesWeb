package fantastic_stories_app.api.response;

import lombok.Data;

@Data
public class AddReviewResponse extends BasicResponse {
    private int reviewId;

    public AddReviewResponse() {
    }

    public AddReviewResponse(String responseMsg, int reviewId) {
        super(responseMsg);
        this.reviewId = reviewId;
    }
}
