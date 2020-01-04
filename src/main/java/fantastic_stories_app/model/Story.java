package fantastic_stories_app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Story {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String title;
    private String originalTitle;

    @ManyToOne // z defaultu jest ustawienie fetch type na eager
    @JoinColumn() //(name = "author_id")  musiałam zakomentować bo wyrzucało błąd - nie widziało tej kolumny
    private Author author;

    @ManyToOne // z defaultu jest ustawienie fetch type na eager
    @JoinColumn() //(name = "issue_id") - musiałam zakomentować bo wyrzucało błąd - nie widziało tej kolumny
    private Issue issue;

    @JsonIgnore
    // usunięcie story spowoduje usunięcie review
    //nie tworzy tej kolumny w bazie
    @OneToOne(mappedBy = "story", cascade = CascadeType.ALL)
    private Review review;

    @Override
    public String toString() {
        return "Story{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", author=" + author +
                ", issue=" + issue +
                '}';
    }
}
