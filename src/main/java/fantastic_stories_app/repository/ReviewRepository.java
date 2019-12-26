package fantastic_stories_app.repository;

import fantastic_stories_app.model.Author;
import fantastic_stories_app.model.Issue;
import fantastic_stories_app.model.Review;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ReviewRepository extends PagingAndSortingRepository<Review, Integer> {
    Review findByStoryTitle(String storyTitle);
    // zamienić na issue nr lub id?
    List<Review> findAllByIssue(Issue issue);
    // zamienić na author name lub id?
    List<Review> findAllByAuthor(Author author);
}
