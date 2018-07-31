import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {


    Borrower borrower;
    Book book;
    Library library;

    @Before

    public void before() {
        borrower = new Borrower();
        library = new Library();
        book = new Book();
        library.addBook(book);
    }

    @Test
    public void addToCollection() {
        borrower.addBooktoCollection(library);
        assertEquals(1, borrower.bookCount());
    }
}


