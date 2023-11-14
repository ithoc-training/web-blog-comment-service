package training.webblog.comments;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "comment")
@Getter
@Setter
public class CommentEntity {

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long articleId;
    private String text;
    private String author;

}
