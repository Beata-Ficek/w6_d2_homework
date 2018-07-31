import java.util.ArrayList;

public class Library {


    private ArrayList<Book> books;
    private ArrayList<Book> capacity;

    public Library(){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public Book removeBook(Book book){
        return this.books.remove(0);
    }
//
//    public boolean hasCapacity() {
//        return (capacity - this.books.size() > 0);
//    }
//
//    public boolean hasNoCapacity() {
//        return (capacity - this.books.size() < 10);
//    }

//
//    public String checkCapacity(){
//        if (this.books.size() == 0 );
//        System.out.println("There is space");
//        else if (this.books.size() >= 0);
//        System.out.println("No space");
//    }



}
