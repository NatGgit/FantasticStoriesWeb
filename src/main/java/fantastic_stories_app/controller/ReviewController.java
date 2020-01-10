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

    //uzupełnić
    @GetMapping("/getById")
    public ModelAndView getReviewById(int reviewId) {
        return new ModelAndView("see_review", "review", new Review());
    }

//    @GetMapping("/getByStoryId")
//    public Review getReviewByStoryId(int storyId) {
//        return reviewService.getReviewByStoryId(storyId);
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

    // Wszelkie obiekty przesyłane poprzez model czy modelandview są zamieniane na stringi, co powoduje błędy jeśli chcemy
    // na nich dalej operować. dlatego trzeba przesyłać nie cały obiekt ale samo id i na jego podstawie pobierać obiekt
    // bezpośrednio z bazy
    @PostMapping(value = "/openForm")
    public ModelAndView createReview(@ModelAttribute(value = "story.id") String storyId) {
        Integer chosenStoryId = Integer.parseInt(storyId);
        Story chosenStory = storyService.getStoryById(chosenStoryId);
        Review review = new Review();
        review.setStory(chosenStory);
        return new ModelAndView("add_review_form", "review", review);
    }

    @GetMapping(value = "/seeReview")
    public ModelAndView seeReview(@ModelAttribute(value = "story.id") String storyId) {
        Integer chosenStoryId = Integer.parseInt(storyId);
        Story chosenStory = storyService.getStoryById(chosenStoryId);
        Integer reviewId = chosenStory.getReview().getId();
        Review review = reviewService.getReviewById(reviewId);
        return new ModelAndView("see_review", "review", review);
    }

    // dokonczyć. dodać pojawiającą się wiadomość "twoja recenzja została zachowan'a
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

    @RequestMapping("/goBack")
    public ModelAndView goBack() {
        return new ModelAndView("redirect:/story/getAll");
    }
}
