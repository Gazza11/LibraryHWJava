import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class BookTest {

        private Book book;

        @Before
        public void before(){
            book = new Book("The Witcher: The Last Wish", "Andrzej Sapkowski", "Fantasy");
        }

        @Test
        public void bookHasTitle(){
            assertEquals("The Witcher: The Last Wish", book.getTitle());
        }

        @Test
        public void bookHasAuthor(){
            assertEquals("Andrzej Sapkowski", book.getAuthor());
        }

        @Test
        public void bookHasGenre(){
            assertEquals("Fantasy", book.getGenre());
        }
    }
