package fantastic_stories_app.service;

import fantastic_stories_app.api.request.AddReviewRequest;
import fantastic_stories_app.api.response.AddReviewResponse;
import org.springframework.http.ResponseEntity;

public interface ReviewService {
    ResponseEntity<AddReviewResponse> addReview (AddReviewRequest request);

}
