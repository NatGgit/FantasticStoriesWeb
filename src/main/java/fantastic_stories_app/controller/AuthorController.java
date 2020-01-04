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
import java.util.NoSuchElementException;

@RestController
@RequestMapping("author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    //private List<Author> authorList;

    public AuthorController(){
//        authorList = new ArrayList<>();
//        authorList.add(new Author( "Artur", "Laisen"));
//        authorList.add(new Author( "Max", "Gladstone"));
//        authorList.add(new Author( "Vina Jie-Min", "Prasad"));
//        authorList.add(new Author( "Rachel ", "Pollack"));
    }

    @GetMapping("/getById")
    public Author getAuthorById(int id) throws NoSuchElementException {
        return authorService.getAuthorById(id);
    }

    @GetMapping("/getByName")
    public Author getAuthorByName(String lastName) throws NoSuchElementException {
        return authorService.getAuthorByName(lastName);
    }

    @GetMapping("/getAll")
    public ModelAndView getAllAuthors(Model model) {
        List<Author> authorList = authorService.getAllAuthors();
        return new ModelAndView("all_authors_list", "list", authorList);
    }

}
