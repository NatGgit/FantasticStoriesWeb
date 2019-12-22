package fantastic_stories_app.repository;

import fantastic_stories_app.model.Review;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {
}
