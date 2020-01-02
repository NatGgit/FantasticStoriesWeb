package fantastic_stories_app.repository;

import fantastic_stories_app.model.Author;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author, Integer> {
    Author findByLastName(String lastName);
}
