import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        borrower = new Borrower("Steve");
        library = new Library(5);
        book1 = new Book("The Witcher: The Last Wish", "Andrzej Sapkowski", "Fantasy");
        book2 = new Book("The Witcher: Blood of Elves", "Andrzej Sapkowski", "Fantasy");
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Steve", borrower.getName());
    }

    @Test
    public void borrowerHasBookList(){
        assertEquals(0, borrower.getBooklistSize());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        borrower.addBook(library);
        assertEquals(1, borrower.getBooklistSize());
    }
}
