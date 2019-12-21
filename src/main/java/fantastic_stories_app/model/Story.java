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

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "issue_id", referencedColumnName = "id")
    private Issue issue;

    @JsonIgnore
    // usunięcie story spowoduje usunięcie review
    @OneToOne(mappedBy = "story", cascade = CascadeType.ALL)
    private Review review;

}
