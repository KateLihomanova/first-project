package complex_tasks.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private List<IBook> books;

    public LibraryCatalog(List<String> titles) {
        books = new ArrayList<>();
        for (String title : titles) {
            books.add(new BookProxy(title));
        }
    }

    public void listBooks() {
        for (IBook book : books) {
            System.out.println(book.getTitle());
        }
    }

    public void readBook(int index) {
        books.get(index).read();
    }
}
