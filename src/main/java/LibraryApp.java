public class LibraryApp {

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Catcher in the Rye", "J. D. Salinger");
        Book book4 = new Book("The Grapes of Wrath", "John Steinbeck");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books in the library:");
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());




            User user1 = new User("Alice");
            User user2 = new User("Bob");

            user1.borrowBook(book1);
            user2.borrowBook(book3);

            user1.addFavorite(book4);
            user2.addFavorite(book2);


        }
    }
}
