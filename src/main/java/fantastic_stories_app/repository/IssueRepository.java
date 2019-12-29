package fantastic_stories_app.repository;

import fantastic_stories_app.model.Issue;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IssueRepository extends PagingAndSortingRepository<Issue, Integer> {
    Issue findByNumber(String number);
    List<Issue> findAllByPublicationYear(int yearOfPublication);
}