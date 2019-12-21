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
    private Story story;
}
