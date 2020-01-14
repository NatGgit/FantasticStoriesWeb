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

    public Review getReviewById(Integer reviewId) {
        return reviewRepository.findOne(reviewId);
    }

    //ewentualnie może zwracać posortowane wyniki
    public List<Review> getAllReviews(){
        return (List<Review>) reviewRepository.findAll();
    }

    public List<Review> getAllReviewsByRating(Integer rating) {
        return reviewRepository.findAllByRating(rating);
    }

    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    public void deleteReview(Review review) {
        reviewRepository.delete(review);
    }

//    public boolean checkIfReviewExists(Integer reviewId){
//        return reviewRepository.exists(reviewId);
//    }

}
