package fantastic_stories_app.model;

import javax.persistence.*;

// musiałam usunąć lomboka bo zapętlał mi odniesienia między review i story i dostawałam stackOverflow exception

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

    // usunięcie story spowoduje usunięcie review
    //nie tworzy tej kolumny w bazie
    @OneToOne(mappedBy = "story", cascade = CascadeType.ALL)
    private Review review;

    public Story() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

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
