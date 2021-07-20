import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Library libraryFull;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        library = new Library(10);
        book1 = new Book("The Witcher: The Last Wish", "Andrzej Sapkowski", "Fantasy");
        book2 = new Book("The Witcher: Blood of Elves", "Andrzej Sapkowski", "Fantasy");
    }

    @Test
    public void canLibraryCountBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void libraryCapacityCheck(){
        assertEquals(10, library.getCapacity());
    }

    @Test
    public void libraryFullTrue(){
        libraryFull = new Library(1);
        libraryFull.addBook(book1);
        assertEquals(true, libraryFull.atCapacity());
    }

    @Test
    public void libraryFullFalse(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(false, library.atCapacity());
    }

    
}
