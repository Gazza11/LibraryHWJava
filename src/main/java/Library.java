import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean atCapacity() {
        if(this.capacity == this.books.size()){
            return true;
        }
        return false;
    }

    public Book removeBook() {
        return this.books.remove(0);
    }
}
