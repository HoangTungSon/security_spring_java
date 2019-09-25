package source.model;

import javax.persistence.*;

@Entity
@Table(name = "blogList")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
    private String author;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Blog(){

    }

    public Blog(String text, String author){
        this.text = text;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Blog[id=%d, text='%s', author='%s']", id, text, author);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
