package fantastic_stories_app.model;

import javax.persistence.*;
import java.util.Objects;

// musiałam usunąć lomboka bo zapętlał mi odniesienia między review i story i dostawałam stackOverflow exception

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer rating;
    private String title;
    private String text;

    //usunięcie review nie spowoduje usunięcia story
    @OneToOne(cascade = CascadeType.PERSIST)
    // ustawienie unique=true nie pozwala dodać więcej niż 1 review dla 1 story
    @JoinColumn(name = "story_id", unique = true)
    private Story story;

    public Review() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", rating=" + rating +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", story=" + story +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return id == review.id &&
                rating == review.rating &&
                Objects.equals(title, review.title) &&
                Objects.equals(text, review.text) &&
                Objects.equals(story, review.story);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rating, title, text, story);
    }
}
