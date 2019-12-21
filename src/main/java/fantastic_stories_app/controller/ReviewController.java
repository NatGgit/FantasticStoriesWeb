package fantastic_stories_app.controller;

import fantastic_stories_app.api.request.AddReviewRequest;
import fantastic_stories_app.api.response.AddReviewResponse;
import fantastic_stories_app.model.Author;
import fantastic_stories_app.model.Issue;
import fantastic_stories_app.model.Review;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("review")
public class ReviewController {

    public ReviewController() {
    }

    @GetMapping("/get")
    public Issue getIssueById(int id) throws NoSuchElementException {
        return null;
    }

    @GetMapping("/getAll")
    public List getIssueList() {
        return null;
    }


    @GetMapping("/getFromIssue")
    public List getStoriesFromSpecificIssue(Issue issue) throws NoSuchElementException{
        return null;
    }

    @GetMapping("/getByAuthor")
    public List getReviewsBySpecificAuthor(Author author) throws NoSuchElementException {
        return null;
    }

    @PostMapping(value = "/add", produces = "application/json")
    public ResponseEntity<AddReviewResponse> addReview(
            @RequestBody AddReviewRequest request){
        return null;
    }

    // być może tu trzeba stworzyć oddzielny request i response
    @PutMapping(value = "/update", produces = "application/json")
    public ResponseEntity<AddReviewResponse> updateReview(
            @RequestBody AddReviewRequest request){
        return null;
    }

    @DeleteMapping("/delete")
    public boolean deleteReview(Review review)throws NoSuchElementException {
        return false;
    }
}
