package fantastic_stories_app.controller;

import fantastic_stories_app.model.Author;
import fantastic_stories_app.model.Issue;
import fantastic_stories_app.model.Review;
import fantastic_stories_app.model.Story;
import fantastic_stories_app.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    public ReviewController() {
    }

    //TODO: połączyć z frontendem

    @GetMapping("/getById")
    public Review getReviewById(int reviewId) throws NoSuchElementException {
        return reviewService.getReviewById(reviewId);
    }

    @GetMapping("/getByStoryId")
    public Review getReviewByStoryId(int storyId) throws NoSuchElementException {
        return reviewService.getReviewByStoryId(storyId);
    }

    @GetMapping("/getByStoryTitle")
    public Review getReviewByStoryTitle(String storyTitle) throws NoSuchElementException {
        return reviewService.getReviewByStoryTitle(storyTitle);
    }

    @GetMapping("/getAll")
    public ModelAndView getAllReviews(Model model) {
        List<Review> reviewList = reviewService.getAllReviews();
        return new ModelAndView("all_reviews_list", "list", reviewList);
    }

    @GetMapping("/getAllByRating")
    public List<Review> getAllReviewsByRating(int rating) {
        return reviewService.getAllReviewsByRating(rating);
    }


    @PostMapping(value = "/add", produces = "application/json")
    public Review addReview(Review review){
        return reviewService.addReview(review);
    }

    @PutMapping(value = "/update", produces = "application/json")
    public Review updateReview(Review review){
        return reviewService.updateReview(review);
    }

    @DeleteMapping("/delete")
    public void deleteReview(Review review)throws NoSuchElementException {
        reviewService.deleteReview(review);
    }
}
