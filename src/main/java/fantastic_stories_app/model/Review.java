package fantastic_stories_app.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int rating;
    private String title;
    private String text;

    //usunięcie review nie spowoduje usunięcia story
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn() //(name = "story_id") - musiałam zakomentować bo wyrzucało błąd - nie widziało tej kolumny
    private Story story;

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
}
