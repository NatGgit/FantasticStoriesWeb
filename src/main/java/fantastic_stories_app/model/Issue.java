package fantastic_stories_app.model;

import lombok.Data;

import java.util.List;

@Data
public class Issue {
    public static int index = 1;
    private int id;
    private int publicationYear;
    private String number;
    private List<Story> storyList;

    public Issue() {
    }

    public Issue(int publicationYear, String number, List<Story> storyList) {
        this.id = index++;
        this.publicationYear = publicationYear;
        this.number = number;
        this.storyList = storyList;
    }
}
