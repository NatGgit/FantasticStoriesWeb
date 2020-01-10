package fantastic_stories_app.service;

import fantastic_stories_app.model.Story;
import fantastic_stories_app.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {
    @Autowired
    private StoryRepository storyRepository;

    public Story getStoryById(Integer id) {
        return storyRepository.findOne(id);
    }

    // można też zrobic metodę get by title containing
    public Story getStoryByTitle(String storyTitle){
        return storyRepository.findByTitle(storyTitle);
    }

    public List<Story> getStoriesByIssueId(Integer issueId) {
        return storyRepository.findAllByIssueId(issueId);
    }

    public List<Story> getStoriesByIssueNumber(String issueNumber){
        return storyRepository.findAllByIssueNumber(issueNumber);
    }

    public List<Story> getStoriesByAuthorId(Integer authorId) {
        return storyRepository.findAllByAuthorId(authorId);
    }

    public List<Story> getStoriesByAuthorName(String authorLastName){
        return storyRepository.findAllByAuthorLastName(authorLastName);
    }

    // ewentualnie zwrócić page i sortować
    public List<Story> getAllStories(){
        return storyRepository.findAll();
    }

}
