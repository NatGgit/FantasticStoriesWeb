package fantastic_stories_app.model;

import lombok.Data;

@Data
public class Story {
    public static int index = 1;
    private int id;
    private String title;
    private String originalTitle;
    private Author author;
    private Issue issue;
    private Review review;

    public Story() {
    }

    public Story(String title, String originalTitle, Author author, Issue issue, Review review) {
        this.id = index++;
        this.title = title;
        this.originalTitle = originalTitle;
        this.author = author;
        this.issue = issue;
        this.review = review;
    }

    public Story(String title) {
        this.id = index++;
        this.title = title;
    }

    public Story(String title, String originalTitle) {
        this.id = index++;
        this.title = title;
        this.originalTitle = originalTitle;
    }
}
