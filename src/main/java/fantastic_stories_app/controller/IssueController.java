package fantastic_stories_app.controller;

import fantastic_stories_app.model.Issue;
import fantastic_stories_app.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("issue")
public class IssueController {
    @Autowired
    private IssueService issueService;
    //private List<Issue> issueList;

    public IssueController(){
//        issueList = new ArrayList<>();
//        issueList.add(new Issue( 2019, "5/2019"));
//        issueList.add(new Issue( 2019, "1/2019"));
//        issueList.add(new Issue( 2019, "special issue no 1"));
    }

    //TODO: połączyć z frontendem

    @GetMapping("/getById")
    public Issue getIssueById(int id) throws NoSuchElementException {
        return issueService.getIssueById(id);
    }

    @GetMapping("/getByNumber")
    public Issue getIssueByNumber(String issueNumber) throws NoSuchElementException {
        return issueService.getIssueByNumber(issueNumber);
    }

    @GetMapping("/getAllFromYear")
    public List<Issue> getIssuesFromYear(int yearOfPublication) throws NoSuchElementException {
        return issueService.getIssueFromYear(yearOfPublication);
    }

    @GetMapping("/getAll")
    public List<Issue> getIssueList(){
        return issueService.getAll();
    }



}
