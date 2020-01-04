package fantastic_stories_app.repository;

import fantastic_stories_app.model.Review;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends PagingAndSortingRepository<Review, Integer> {
    Review findByStoryTitle(String storyTitle);
    List<Review> findAllByRating(int rating);

}
