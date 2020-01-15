package fantastic_stories_app.service;

import fantastic_stories_app.model.Author;
import fantastic_stories_app.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    // ewentualnie zwracać Page
    public List<Author> getAllAuthors() {
        return (List<Author>) authorRepository.findAll();
    }

    public Author getAuthorById(Integer id) {
        return authorRepository.findOne(id);
    }

}
