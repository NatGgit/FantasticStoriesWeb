package fantastic_stories_app.repository;

import fantastic_stories_app.model.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoryRepository extends JpaRepository<Story, Integer> {
    Story findByTitle(String storyTitle);

    List<Story> findAllByIssueId(int issueId);

    List<Story> findAllByIssueNumber(String issueNumber);

    List<Story> findAllByAuthorId(int authorId);

    List<Story> findAllByAuthorLastName(String authorLastName);
    // żeby dostać się do pól powiązanej tabeli musimy użyć dokładnie takich samych nazw jak w tej tabeli,
    // czyli find by + nazwa tabeli + nazwa kolumny
}
