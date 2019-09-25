package source.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import source.model.Blog;
import source.model.Category;
import source.repository.BlogRepository;
import source.service.BlogService;


public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findOne(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.delete(id);
    }

//    @Override
//    public Iterable<Blog> findAllByCategory(Category category) {
//        return blogRepository.findAlByCategory(category);
//    }

    @Override
    public Page<Blog> findAllByAuthorContaining(String author, Pageable pageable) {
        return blogRepository.findAllByAuthorContaining(author, pageable);
    }
}
