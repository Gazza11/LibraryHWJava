
import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> booklist;

    public Borrower(String name){
        this.name = name;
        this.booklist = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getBooklistSize(){
        return this.booklist.size();
    }

    public void addBook(Library library) {
        Book book = library.removeBook();
        this.booklist.add(book);
    }
}
