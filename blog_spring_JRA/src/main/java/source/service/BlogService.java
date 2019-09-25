package source.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import source.model.Blog;
import source.model.Category;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);

//    Iterable<Blog> findAllByCategory(Category category);

    Page<Blog> findAllByAuthorContaining (String author, Pageable pageable);
}
