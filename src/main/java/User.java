import java.util.ArrayList;
import java.util.List;

public class User implements User_Interface{
    private String name;
    private List<Book> borrowedBooks;
    private List<Book> favoriteBooks;

    public User(String name) {
        this.name = name;
        borrowedBooks = new ArrayList<>();
        favoriteBooks = new ArrayList<>();
    }

    @Override
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " has borrowed the book: " + book.getTitle());
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public List<Book> getFavoriteBooks() {
        return favoriteBooks;
    }

    @Override
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(name + " has returned the book: " + book.getTitle());
    }

    @Override
    public void addFavorite(Book book) {
        favoriteBooks.add(book);
        System.out.println(name + " has added " + book.getTitle() + " to favorites.");
    }

    @Override
    public void removeFavorite(Book book) {
        favoriteBooks.remove(book);
        System.out.println(name + " has removed " + book.getTitle() + " from favorites.");
    }

    @Override
    public String getName() {
        return name;
    }
}
