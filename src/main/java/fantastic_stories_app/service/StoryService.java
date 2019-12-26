package fantastic_stories_app.service;

import fantastic_stories_app.model.Story;
import fantastic_stories_app.repository.StoryRepository;

import java.util.List;

public class StoryService {
    private StoryRepository storyRepository;

    public Story getStoryById(int id){
        return storyRepository.findOne(id);
    }

    // można też zrobic metodę get by title containing
    public Story getStoryByTitle(String storyTitle){
        return storyRepository.findByTitle(storyTitle);
    }

    public List<Story> getStoriesByIssueId(int issueId){
        return storyRepository.findAllByIssueId(issueId);
    }

    public List<Story> getStoriesByIssueNumber(String issueNumber){
        return storyRepository.findAllByIssueNumber(issueNumber);
    }

    public List<Story> getStoriesByAuthorId(int authorId){
        return storyRepository.findAllByAuthorId(authorId);
    }

    public List<Story> getStoriesByAuthorName(String authorName){
        return storyRepository.findAllByAuthorName(authorName);
    }

    // ewentualnie zwrócić page i sortować
    public List<Story> getAllStories(){
        return (List<Story>) storyRepository.findAll();
    }

}
