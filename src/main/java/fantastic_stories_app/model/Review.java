package fantastic_stories_app.model;

import lombok.Data;

@Data
public class Review {
    public static int index = 1;
    private int id;
    private int rating;
    private String title;
    private String text;
    private Story story;

    public Review() {
    }

    public Review(int rating, String title, String text, Story story) {
        this.id = index++;
        this.rating = rating;
        this.title = title;
        this.text = text;
        this.story = story;
    }

    public Review(int rating, String title, String text) {
        this.id = index++;
        this.rating = rating;
        this.title = title;
        this.text = text;
    }
}
