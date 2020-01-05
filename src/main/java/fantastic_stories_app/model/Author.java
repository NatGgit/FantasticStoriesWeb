package fantastic_stories_app.model;

import lombok.Data;

import java.util.List;

@Data
public class Author {
    public static int index = 1;
    private int id;
    private String firstName;
    private String lastName;
    private List<Story> stories;

    public Author() {
    }

    public Author(String firstName, String lastName, List<Story> stories) {
        this.id = index++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.stories = stories;
    }

    public Author(String firstName, String lastName) {
        this.id = index++;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
