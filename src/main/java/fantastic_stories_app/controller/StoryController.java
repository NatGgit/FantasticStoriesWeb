package fantastic_stories_app.controller;

import fantastic_stories_app.model.Story;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("story")
public class StoryController {
    private List<Story> storyList;

    public StoryController() {
        storyList = new ArrayList<>();
        storyList.add(new Story("Dalej niż koniec drogi"));
        storyList.add(new Story("Modelka Crispina", "(Crispin's Model)"));
        storyList.add(new Story("Zamówienie na steki", "(A Series of Steakes)"));
        storyList.add(new Story("Pieśń Ognia", "(Song of Fire)"));
    }

    @GetMapping("/getById")
    public Story getStoryById(int storyId) throws NoSuchElementException {
        return null;
    }

    @GetMapping("/getByTitle")
    public Story getStoryByTitle(String storyTitle) throws NoSuchElementException {
        return null;
    }

    @GetMapping("/getAllByIssueId")
    public List<Story> getStoriesByIssueId(int issueId) throws NoSuchElementException {
        return null;
    }

    @GetMapping("/getAllByIssueNumber")
    public List<Story> getStoriesByIssueNumber(String issueNumber) throws NoSuchElementException {
        return null;
    }

    @GetMapping("/getAllByAuthorId")
    public List<Story> getStoriesByAuthorId(int authorId) throws NoSuchElementException{
        return null;
    }

    @GetMapping("/getAllByAuthorName")
    public List<Story> getStoriesByAuthorName(String authorName) throws NoSuchElementException{
        return null;
    }

    @GetMapping("/getAll")
    public ModelAndView getAllStories(Model model) {
        return new ModelAndView("all_stories_list", "storyList", storyList);
    }

}
