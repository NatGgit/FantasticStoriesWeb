package fantastic_stories_app.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String firstName;
    private String lastName;

    // niezbyt bezpieczne ustawienie cascade na tym pozwalający usuwać zależne encje
    // fetch type eager oznacza, że będą ściągnięte wraz z autorem od razu wszystkie opowiadania
    //nie tworzy tej kolumny w bazie
    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Story> storyList;

    // rozwiązanie z platformy - żeby nie zwracać null w getterach przy kolekcjach
    public List<Story> getStories(){
        if (storyList == null){
            storyList = new ArrayList<>();
        }
        return storyList;
    }

}
