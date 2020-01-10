package fantastic_stories_app.controller;

import fantastic_stories_app.model.Issue;
import fantastic_stories_app.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("issue")
public class IssueController {
    @Autowired
    private IssueService issueService;

    public IssueController() {
    }

//    @GetMapping("/getById")
//    public Issue getIssueById(Integer id) throws NoSuchElementException {
//        return issueService.getIssueById(id);
//    }
//
//    @GetMapping("/getByNumber")
//    public Issue getIssueByNumber(String issueNumber) throws NoSuchElementException {
//        return issueService.getIssueByNumber(issueNumber);
//    }
//
//    @GetMapping("/getAllFromYear")
//    public List<Issue> getIssuesFromYear(Integer yearOfPublication) throws NoSuchElementException {
//        return issueService.getIssueFromYear(yearOfPublication);
//    }

    @GetMapping("/getAll")
    public ModelAndView getIssueList() {
        List<Issue> issueList = issueService.getAll();
        return new ModelAndView("all_issues_list", "issueList", issueList);
    }


}
