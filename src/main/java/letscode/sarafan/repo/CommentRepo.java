package letscode.sarafan.repo;

import letscode.sarafan.domain.Comment;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;

public interface CommentRepo extends JpaRepository<Comment, Long> {
}
