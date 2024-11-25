package src.main;

public class LibraryApp {
    public static void main(String[] args) {
        // Cream o carte si adaugam utilizatori
        Book book = new Book("Calea Regilor");
        User user1 = new User("Popescu");
        User user2 = new User("Georgica");

        // Adaugam utilizatorii ca observatori
        book.attach(user1);
        book.attach(user2);

        // Imprumutam cartea
        book.borrow();

        // Incercam sa imprumutam din nou (cartea este deja imprumutata)
        book.borrow();

        // Returnam cartea si notificam utilizatorii
        book.returnBook();

        // Imprumutam din nou cartea
        book.borrow();
    }
}
