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

    // może nie po id, tylko po tytule opowiadania, z którym jest złączone?
    @GetMapping("/get")
    public Issue getReviewById(int id) throws NoSuchElementException {
        return null;
    }

    @GetMapping("/getAll")
    public List getReviewList() {
        return null;
    }


    // po samym numerze issue?
    @GetMapping("/getFromIssue")
    public List getReviewsFromSpecificIssue(Issue issue) throws NoSuchElementException{
        return null;
    }

    // po samym nazwisku autora?
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

    // być może tu trzeba stworzyć oddzielny request i response
    @DeleteMapping("/delete")
    public boolean deleteReview(Review review)throws NoSuchElementException {
        return false;
    }
}
