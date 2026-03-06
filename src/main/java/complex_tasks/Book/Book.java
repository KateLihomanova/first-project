package complex_tasks.Book;

public class Book implements IBook {
    private String title;
    private String content;

    public Book(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public void read() {
        System.out.println("Читаем книгу");
    }
}
