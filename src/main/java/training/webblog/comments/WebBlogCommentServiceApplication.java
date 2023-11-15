package training.webblog.comments;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class WebBlogCommentServiceApplication {

    private final CommentRepository commentRepository;

    public WebBlogCommentServiceApplication(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(WebBlogCommentServiceApplication.class, args);
    }

    @PostConstruct
    private void init() {

        String[] users = {"light.blogger", "heavy.blogger", "creative.blogger"};

        // Per article ...
        for (int i = 0; i < 10; i++) {
            // ... create comments
            for (int j = 0; j < 3; j++) {
                CommentEntity commentEntity = new CommentEntity();
                commentEntity.setArticleId(i + 1L);
                commentEntity.setText(UUID.randomUUID().toString());
                commentEntity.setUsername(users[new Random().nextInt(users.length)]);
                commentRepository.save(commentEntity);
            }
        }
    }

}
