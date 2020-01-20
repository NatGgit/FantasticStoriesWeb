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

    @GetMapping("/getAll")
    public ModelAndView getAllReviews(Model model) {
        List<Review> reviewList = reviewService.getAllReviews();
        return new ModelAndView("all_reviews_list", "reviewList", reviewList);
    }

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

    @GetMapping(value = "/seeByStoryId")
    public ModelAndView seeReviewByStoryId(@ModelAttribute(value = "story.id") String storyId) {
        Integer chosenStoryId = Integer.parseInt(storyId);
        Story chosenStory = storyService.getStoryById(chosenStoryId);
        Integer reviewId = chosenStory.getReview().getId();
        Review review = reviewService.getReviewById(reviewId);
        return new ModelAndView("see_review", "review", review);
    }

    @GetMapping(value = "/seeByItsId")
    public ModelAndView seeReviewByItsId(@ModelAttribute(value = "review.id") String reviewId) {
        Integer chosenReviewId = Integer.parseInt(reviewId);
        Review review = reviewService.getReviewById(chosenReviewId);
        return new ModelAndView("see_review", "review", review);
    }

    @PostMapping(value = "/save")
    public ModelAndView saveReview(@ModelAttribute(value = "review") Review review) {
        Integer storyIdToSet = review.getStory().getId();
        review.setStory(storyService.getStoryById(storyIdToSet));
        // moja metoda odwołuje się do wbudowanej metody save z CRUDRepository, która sama sprawdza, czy dany obiekt istnieje
        //(na podstawie jego id) i w zależności od wyniku tego sprawdzenia albo tworzy nowy obiekt albo "nadpisuje" stary
        reviewService.saveReview(review);
        return new ModelAndView("redirect:/review/seeByItsId", "review.id", review.getId());
    }

    @PostMapping(value = "/edit")
    public ModelAndView editReview(@ModelAttribute(value = "review.id") String reviewId) {
        Integer chosenReviewId = Integer.parseInt(reviewId);
        Review review = reviewService.getReviewById(chosenReviewId);
        return new ModelAndView("edit_review_form", "review", review);
    }

    @GetMapping("/delete")
    public ModelAndView deleteReview(@ModelAttribute(value = "review.id") String reviewId) {
        Integer chosenReviewId = Integer.parseInt(reviewId);
        Review reviewToDelete = reviewService.getReviewById(chosenReviewId);
        reviewService.deleteReview(reviewToDelete);
        return new ModelAndView("redirect:/review/getAll");
    }

    @RequestMapping("/backToMainList")
    public ModelAndView goBack() {
        return new ModelAndView("redirect:/review/getAll");
    }

    //    @GetMapping("/getAllByRating")
//    public List<Review> getAllReviewsByRating(int rating) {
//        return reviewService.getAllReviewsByRating(rating);
//    }
}
