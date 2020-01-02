package fantastic_stories_app.repository;

import fantastic_stories_app.model.Review;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ReviewRepository extends PagingAndSortingRepository<Review, Integer> {
    Review findByStoryTitle(String storyTitle);
    List<Review> findAllByRating(int rating);

}
