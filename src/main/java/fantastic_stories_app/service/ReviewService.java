package fantastic_stories_app.service;

import fantastic_stories_app.model.Review;
import fantastic_stories_app.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public Review getReviewById(int reviewId){
        return reviewRepository.findOne(reviewId);
    }

    public Review getReviewByStoryId(int storyId){
        return reviewRepository.findOne(storyId);
    }

    public Review getReviewByStoryTitle(String storyTitle){
        return reviewRepository.findByStoryTitle(storyTitle);
    }

    //ewentualnie może zwracać posortowane wyniki
    public List<Review> getAllReviews(){
        return (List<Review>) reviewRepository.findAll();
    }

    public List<Review> getAllReviewsByRating(int rating){
        return reviewRepository.findAllByRating(rating);
    }

    public Review addReview(Review review){
        return reviewRepository.save(review);
    }

    // TODO: uzupełnić logikę
    public Review updateReview(Review review){
        return reviewRepository.save(review);
    }

    public void deleteReview(Review review){
        reviewRepository.delete(review);
    }

}
