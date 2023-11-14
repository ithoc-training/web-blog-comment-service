package training.webblog.comments;

import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void commentArticle(Long articleId, String text, String author) {

        CommentEntity commentEntity = new CommentEntity();
        commentEntity.setArticleId(articleId);
        commentEntity.setText(text);
        commentEntity.setAuthor(author);
        commentRepository.save(commentEntity);
    }

}
