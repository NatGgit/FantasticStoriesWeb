package fantastic_stories_app.repository;

import fantastic_stories_app.model.Issue;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueRepository extends PagingAndSortingRepository<Issue, Integer> {
    Issue findByNumber(String number);
    List<Issue> findAllByPublicationYear(int yearOfPublication);
}
