package homework.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryImpl implements Library {
    private List<Book> books;

    public LibraryImpl() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(String ISBN) {
        books.removeIf(book -> book.getISBN().equals(ISBN));
    }

    @Override
    public Book findBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public int getBook() {
        return 0;
    }

    @Override
    public int getBookCount() {
        return books.size();
    }

    @Override
    public void printBooks() {
        for (Book book : books) {
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Year: " + book.getYear());
            System.out.println("----------------------------");
        }
    }
}


