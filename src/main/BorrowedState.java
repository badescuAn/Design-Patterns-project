package src.main;

// Starea împrumutată a cărții
class BorrowedState implements BookState {
    private Book book;

    public BorrowedState(Book book) {
        this.book = book;
    }

    @Override
    public void borrow() {
        System.out.println("Cartea '" + book.getTitle() + "' este deja imprumutata.");
    }

    @Override
    public void returnBook() {
        System.out.println("Cartea '" + book.getTitle() + "' a fost returnata.");
        book.setState(new AvailableState(book));  // Schimba starea la disponibila
        book.notifyAvailable();  // Notifica utilizatorii ca este disponibila
    }
}
