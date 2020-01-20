package fantastic_stories_app.controller;

import fantastic_stories_app.model.Author;
import fantastic_stories_app.model.Issue;
import fantastic_stories_app.model.Story;
import fantastic_stories_app.service.AuthorService;
import fantastic_stories_app.service.IssueService;
import fantastic_stories_app.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("story")
public class StoryController {
    @Autowired
    private StoryService storyService;
    @Autowired
    private AuthorService authorService;
    @Autowired
    private IssueService issueService;

    public StoryController() {
    }

    @GetMapping("/getAllByIssue")
    public ModelAndView getStoriesByIssue(@ModelAttribute(value = "issue.id") String issueId) {
        Integer chosenIssueId = Integer.parseInt(issueId);
        List<Story> storyList = storyService.getStoriesByIssueId(chosenIssueId);
        Issue issue = issueService.getIssueById(chosenIssueId);
        Map<String, Object> model = new HashMap<>();
        model.put("storyList", storyList);
        model.put("issue", issue);
        return new ModelAndView("stories_chosen_by_issue_list", "model", model);
    }

    @GetMapping("/getAllByAuthor")
    public ModelAndView getStoriesByAuthor(@ModelAttribute(value = "author.id") String authorId) {
        Integer chosenAuthorId = Integer.parseInt(authorId);
        List<Story> storyList = storyService.getStoriesByAuthorId(chosenAuthorId);
        Author author = authorService.getAuthorById(chosenAuthorId);
        Map<String, Object> model = new HashMap<>();
        model.put("storyList", storyList);
        model.put("author", author);
        return new ModelAndView("stories_chosen_by_author_list", "model", model);
    }

    @GetMapping("/getAll")
    public ModelAndView getAllStories(Model model) {
        List<Story> storyList = storyService.getAllStories();
        return new ModelAndView("all_stories_list", "storyList", storyList);
    }

    @RequestMapping("/backToMainList")
    public ModelAndView goBack() {
        return new ModelAndView("redirect:/story/getAll");
    }

}
