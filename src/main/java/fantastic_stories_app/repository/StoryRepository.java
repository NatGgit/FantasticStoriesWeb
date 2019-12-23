package fantastic_stories_app.repository;

import fantastic_stories_app.model.Story;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StoryRepository extends PagingAndSortingRepository<Story, Integer> {
}
