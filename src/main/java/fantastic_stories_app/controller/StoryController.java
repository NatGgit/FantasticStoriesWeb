package fantastic_stories_app.controller;

import fantastic_stories_app.model.Story;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("story")
public class StoryController {
    private List<Story> storyList;


    public StoryController() {
//        storyList = new ArrayList<>();
//        storyList.add(new Story("Dalej niż koniec drogi"));
//        storyList.add(new Story("Modelka Crispina", "(Crispin's Model)"));
//        storyList.add(new Story("Zamówienie na steki", "(A Series of Steakes)"));
//        storyList.add(new Story("Pieśń Ognia", "(Song of Fire)"));
    }

    // może raczej wyszukiwanie po tytule?
    @GetMapping("/get")
    public Story getStoryById(int id) throws NoSuchElementException {
        return null;
    }

    @GetMapping("/getAll")
    public List getStoryList() {
        return null;
    }

// może raczej po numerze issue?
    @GetMapping("/getFromIssue")
    public List getStoriesFromSpecificIssue(int issueId) throws NoSuchElementException {
        return null;
    }

    // może raczej po nazwisku autora?
    @GetMapping("/getByAuthor")
    public List getStoriesBySpecificAuthor(int authorId) throws NoSuchElementException{
        return null;
    }
}
