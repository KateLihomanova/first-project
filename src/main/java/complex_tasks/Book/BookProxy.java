package complex_tasks.Book;

public class BookProxy implements IBook {
    private String title;
    private Book book;

    public BookProxy(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public void read() {
        if(book == null) {
            book = new Book(title, "содержимое книги");
        }
        book.read();
    }
}
