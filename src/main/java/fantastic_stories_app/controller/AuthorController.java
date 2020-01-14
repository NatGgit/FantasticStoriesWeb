package fantastic_stories_app.controller;

import fantastic_stories_app.model.Author;
import fantastic_stories_app.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    public AuthorController() {
    }

//    @GetMapping("/getById")
//    public Author getAuthorById(Integer id) throws NoSuchElementException {
//        return authorService.getAuthorById(id);
//    }
//
//    @GetMapping("/getByName")
//    public Author getAuthorByName(String lastName) throws NoSuchElementException {
//        return authorService.getAuthorByName(lastName);
//    }

    @GetMapping("/getAll")
    public ModelAndView getAllAuthors(Model model) {
        List<Author> authorList = authorService.getAllAuthors();
        return new ModelAndView("all_authors_list", "authorList", authorList);
    }

}
