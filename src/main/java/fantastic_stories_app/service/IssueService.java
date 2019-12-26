package fantastic_stories_app.service;

import fantastic_stories_app.model.Issue;
import fantastic_stories_app.repository.IssueRepository;

import java.util.List;

public class IssueService {
    private IssueRepository issueRepository;

    // ewentualnie zwracać Page i sortować po kolejności
    public List<Issue> getAll(){
        return (List<Issue>) issueRepository.findAll();
    }

    public Issue getIssueById(int id) {
        return issueRepository.findOne(id);
    }

    public Issue getIssueByNumber(String issueNumber) {
        return issueRepository.findByIssueNumber(issueNumber);
    }

    // ewentualnie zwracać Page i sortować po kolejności
    public List<Issue> getIssueFromYear(int yearOfPublication) {
        return issueRepository.findAllByPublicationYear(yearOfPublication);
    }
}
