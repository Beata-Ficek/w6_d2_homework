import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book();
    }

    @Test
    public void shelfEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addRemoveBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
        library.removeBook(book);
        assertEquals(0, library.bookCount());
    }



}

//    @Test public boolean hasCapacity(){
//        assertEquals(true, library.hasCapacity());
//    }
//
//    @Test public boolean hasNoCapacity(){
//        assertEquals(true, library.hasNoCapacity());
//    }

    //    @Test public String checkCapacity(){
//        library.addBook(book);
//        assertEquals("There is space", library.checkCapacity());
//    }
