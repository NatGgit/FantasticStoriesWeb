package fantastic_stories_app.api.request;

import lombok.Data;

@Data
public class AddReviewRequest {
    private int id;
    private int rating;
    private String title;
    private String text;
}
