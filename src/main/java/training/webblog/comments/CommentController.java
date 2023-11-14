package training.webblog.comments;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public ResponseEntity<Void> commentArticle(@RequestBody CommentRequestBody commentRequestBody) {

        commentService.commentArticle(commentRequestBody.getArticleId(),
                commentRequestBody.getText(), commentRequestBody.getAuthor());

        return ResponseEntity.ok().build();
    }

}
