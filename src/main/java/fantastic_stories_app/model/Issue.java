package fantastic_stories_app.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer publicationYear;
    private String number;
    // niezbyt bezpieczne ustawienie cascade na tym pozwalający usuwać zależne encje
    // fetch type eager oznacza, że będą ściągnięte wraz z issue od razu wszystkie stories
    // nie tworzy tej kolumny w bazie
    @OneToMany(mappedBy = "issue", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Story> storyList;

    // rozwiązanie z platformy - żeby nie zwracać null w getterach przy kolekcjach
    public List<Story> getStories() {
        if (storyList == null) {
            storyList = new ArrayList<>();
        }
        return storyList;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "id=" + id +
                ", publicationYear=" + publicationYear +
                ", number='" + number + '\'' +
                '}';
    }
}
