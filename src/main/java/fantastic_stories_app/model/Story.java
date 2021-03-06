package fantastic_stories_app.model;

import javax.persistence.*;
import java.util.Objects;

// musiałam usunąć lomboka bo zapętlał mi odniesienia między review i story i dostawałam stackOverflow exception

@Entity
public class Story {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String originalTitle;

    @ManyToOne // z defaultu jest ustawienie fetch type na eager
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToOne // z defaultu jest ustawienie fetch type na eager
    @JoinColumn(name = "issue_id")
    private Issue issue;

    // musiałam usunąć wszelką informację o cascadeType bo nie działało usuwanie Review
    @OneToOne(mappedBy = "story")
    private Review review;

    public Story() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Story story = (Story) o;
        return id == story.id &&
                Objects.equals(title, story.title) &&
                Objects.equals(originalTitle, story.originalTitle) &&
                Objects.equals(author, story.author) &&
                Objects.equals(issue, story.issue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, originalTitle, author, issue);
    }
}
