package fantastic_stories_app.repository;

import fantastic_stories_app.model.Story;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StoryRepository extends PagingAndSortingRepository<Story, Integer> {
    Story findByTitle (String storyTitle);
    List<Story> findAllByIssueId (int issueId);
    //TODO: sprawdzić jak dobrać się do issue number
    List<Story> findAllByIssueNumber (String issueNumber);
    List<Story> findAllByAuthorId (int authorId);
    //TODO: sprawdzić jak dobrać się do author name
    List<Story> findAllByAuthorName(String authorName);
}
