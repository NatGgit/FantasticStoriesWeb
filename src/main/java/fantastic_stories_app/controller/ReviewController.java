package fantastic_stories_app.controller;

import fantastic_stories_app.model.Review;
import fantastic_stories_app.model.Story;
import fantastic_stories_app.service.ReviewService;
import fantastic_stories_app.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @Autowired
    private StoryService storyService;

    public ReviewController() {
    }

    @GetMapping(value = "/form")
    public ModelAndView showForm() {
        return new ModelAndView("add_review_form", "review", new Review());
    }

//    @GetMapping("/getById")
//    public Review getReviewById(int reviewId) throws NoSuchElementException {
//        return reviewService.getReviewById(reviewId);
//    }

//    @GetMapping("/getByStoryId")
//    public Review getReviewByStoryId(int storyId) throws NoSuchElementException {
//        return reviewService.getReviewByStoryId(storyId);
//    }

//    @GetMapping("/getByStoryTitle")
//    public Review getReviewByStoryTitle(String storyTitle) throws NoSuchElementException {
//        return reviewService.getReviewByStoryTitle(storyTitle);
//    }

    @GetMapping("/getAll")
    public ModelAndView getAllReviews(Model model) {
        List<Review> reviewList = reviewService.getAllReviews();
        return new ModelAndView("all_reviews_list", "reviewList", reviewList);
    }

//    @GetMapping("/getAllByRating")
//    public List<Review> getAllReviewsByRating(int rating) {
//        return reviewService.getAllReviewsByRating(rating);
//    }

    @PostMapping(value = "/openForm")
    public ModelAndView createReview(@ModelAttribute(value = "story") Story story) {
        Review reviewToCreate = new Review();
        reviewToCreate.setStory(story);
        return new ModelAndView("redirect:/review/form", "reviewToCreate", reviewToCreate);
    }

    @PostMapping(value = "/save")
    public ModelAndView saveReview(@ModelAttribute(value = "review") Review review) {
        reviewService.saveReview(review);
        return new ModelAndView("redirect:/review/getAll");
    }

    @DeleteMapping("/delete")
    public ModelAndView deleteReview(@ModelAttribute(value = "review") Review review) {
        reviewService.deleteReview(review);
        return new ModelAndView("redirect:/review/getAll");
    }
}
