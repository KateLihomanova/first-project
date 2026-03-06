package complex_tasks.Book;

public class BookBuilder {
    private String title;
    private String author;
    private String description;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Book build() {
        return new Book(title, description);
    }
}
