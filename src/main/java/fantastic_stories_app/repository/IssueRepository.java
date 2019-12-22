package fantastic_stories_app.repository;

import fantastic_stories_app.model.Issue;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IssueRepository extends PagingAndSortingRepository<Issue, Long> {
}
