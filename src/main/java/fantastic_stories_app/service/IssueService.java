package fantastic_stories_app.service;

import fantastic_stories_app.model.Issue;
import fantastic_stories_app.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {
    @Autowired
    private IssueRepository issueRepository;

    // ewentualnie zwracać Page i sortować po kolejności
    public List<Issue> getAll(){
        return (List<Issue>) issueRepository.findAll();
    }

    public Issue getIssueById(Integer id) {
        return issueRepository.findOne(id);
    }

    public Issue getIssueByNumber(String issueNumber) {
        return issueRepository.findByNumber(issueNumber);
    }

    // ewentualnie zwracać Page i sortować po kolejności
    public List<Issue> getIssueFromYear(Integer yearOfPublication) {
        return issueRepository.findAllByPublicationYear(yearOfPublication);
    }
}
