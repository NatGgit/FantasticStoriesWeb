package fantastic_stories_app.controller;

import fantastic_stories_app.model.Review;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("review")
public class ReviewController {
    private List<Review> reviewList;

    public ReviewController() {
    }

    @GetMapping("/getById")
    public Review getReviewById(int reviewId) throws NoSuchElementException {
        return null;
    }

    @GetMapping("/getByStoryId")
    public Review getReviewByStoryId(int storyId) throws NoSuchElementException {
        return null;
    }

    @GetMapping("/getByStoryTitle")
    public Review getReviewByStoryTitle(String storyTitle) throws NoSuchElementException {
        return null;
    }

    @GetMapping("/getAll")
    public ModelAndView getAllReviews(Model model) {
        return new ModelAndView("all_reviews_list", "reviewList", reviewList);
    }

    @GetMapping("/getAllByRating")
    public List<Review> getAllReviewsByRating(int rating) {
        return null;
    }


    @PostMapping(value = "/add", produces = "application/json")
    public Review addReview(Review review){
        return null;
    }

    @PutMapping(value = "/update", produces = "application/json")
    public Review updateReview(Review review){
        return null;
    }

    @DeleteMapping("/delete")
    public void deleteReview(Review review)throws NoSuchElementException {

    }
}
