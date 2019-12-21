package fantastic_stories_app.controller;

import fantastic_stories_app.model.Issue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("issue")
public class IssueController {
    private List<Issue> issueList;

    public IssueController(){
//        issueList = new ArrayList<>();
//        issueList.add(new Issue( 2019, "5/2019"));
//        issueList.add(new Issue( 2019, "1/2019"));
//        issueList.add(new Issue( 2019, "special issue no 1"));
    }

    @GetMapping("/get")
    public Issue getIssueById(int id) throws NoSuchElementException {
        return null;
    }

    @GetMapping("/getAll")
    public List getIssueList(){
        return null;
    }



}
