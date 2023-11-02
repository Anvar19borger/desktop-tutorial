package homework.library;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryImplTest {

    private Library library;

    @Before
    public void setup() {
        library = new LibraryImpl();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("123456", "Author1", "Book 1", 2020);
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void testRemoveBook() {
        Book book = new Book("123456", "Author1", "Book 1", 2020);
        library.addBook(book);
        library.removeBook("123456");
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void testFindBook() {
        Book book = new Book("123456", "Author1", "Book 1", 2020);
        library.addBook(book);
        Book foundBook = library.findBook("123456");
        assertNotNull(foundBook);
        assertEquals("Book 1", foundBook.title);
    }

    @Test
    public void testGetBookCount() {
        assertEquals(0, library.getBookCount());
        library.addBook(new Book("123456", "Author1", "Book 1", 2020));
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void testPrintBooks() {
        library.addBook(new Book("123456", "Author1", "Book 1", 2020));
        library.addBook(new Book("789012", "Author2", "Book 2", 2015));
        library.printBooks();
    }
}



