import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    private Book book1;

    @BeforeEach
    public void setUp() {
        user = new User("Alice");
        book1 = new Book("Book 1", "Author 1");
    }

    @Test
    public void testBorrowBook() {
        user.borrowBook(book1);
        assertEquals(1, user.getBorrowedBooks().size());
    }

    @Test
    public void testReturnBook() {
        user.borrowBook(book1);
        user.returnBook(book1);
        assertEquals(0, user.getBorrowedBooks().size());
    }

    @Test
    public void testAddFavorite() {
        user.addFavorite(book1);
        assertEquals(1, user.getFavoriteBooks().size());
    }

    @Test
    public void testRemoveFavorite() {
        user.addFavorite(book1);
        user.removeFavorite(book1);
        assertEquals(0, user.getFavoriteBooks().size());
    }
}