package training.webblog.comments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentRequestBody {

    private Long articleId;
    private String text;
    private String author;

}
