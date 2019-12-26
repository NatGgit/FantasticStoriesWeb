package fantastic_stories_app.controller;

import fantastic_stories_app.model.Story;
import fantastic_stories_app.service.StoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("story")
public class StoryController {
    private StoryService storyService;
    //private List<Story> storyList;

    public StoryController() {
//        storyList = new ArrayList<>();
//        storyList.add(new Story("Dalej niż koniec drogi"));
//        storyList.add(new Story("Modelka Crispina", "(Crispin's Model)"));
//        storyList.add(new Story("Zamówienie na steki", "(A Series of Steakes)"));
//        storyList.add(new Story("Pieśń Ognia", "(Song of Fire)"));
    }

    //TODO: połączyć z frontendem

    @GetMapping("/getById")
    public Story getStoryById(int storyId) throws NoSuchElementException {
        return storyService.getStoryById(storyId);
    }

    @GetMapping("/getByTitle")
    public Story getStoryByTitle(String storyTitle) throws NoSuchElementException {
        return storyService.getStoryByTitle(storyTitle);
    }

    @GetMapping("/getAllByIssueId")
    public List<Story> getStoriesByIssueId(int issueId) throws NoSuchElementException {
        return storyService.getStoriesByIssueId(issueId);
    }

    @GetMapping("/getAllByIssueNumber")
    public List<Story> getStoriesByIssueNumber(String issueNumber) throws NoSuchElementException {
        return storyService.getStoriesByIssueNumber(issueNumber);
    }

    @GetMapping("/getAllByAuthorId")
    public List<Story> getStoriesByAuthorId(int authorId) throws NoSuchElementException{
        return storyService.getStoriesByAuthorId(authorId);
    }

    @GetMapping("/getAllByAuthorName")
    public List<Story> getStoriesByAuthorName(String authorName) throws NoSuchElementException{
        return storyService.getStoriesByAuthorName(authorName);
    }

    @GetMapping("/getAll")
    public List<Story> getAllStories() {
        return storyService.getAllStories();
    }

}
