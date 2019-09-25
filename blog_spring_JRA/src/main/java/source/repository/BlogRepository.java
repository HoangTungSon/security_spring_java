package source.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import source.model.Blog;
import source.model.Category;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {

//    Iterable<Blog> findAlByCategory(Category category);

    Page<Blog> findAllByAuthorContaining(String author, Pageable pageable);
}
