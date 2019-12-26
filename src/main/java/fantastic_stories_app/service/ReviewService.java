package fantastic_stories_app.service;

import fantastic_stories_app.model.Author;
import fantastic_stories_app.model.Issue;
import fantastic_stories_app.model.Review;
import fantastic_stories_app.repository.ReviewRepository;

import java.util.List;

public class ReviewService {
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

    public List<Review> getReviewsFromSpecificIssue(Issue issue){
        return reviewRepository.findAllByIssue(issue);
    }

    public List<Review> getReviewsBySpecificAuthor(Author author){
        return reviewRepository.findAllByAuthor(author);
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
