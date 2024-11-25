package src.main;

// Starea disponibila a carții
class AvailableState implements BookState {
    private Book book;

    public AvailableState(Book book) {
        this.book = book;
    }

    @Override
    public void borrow() {
        System.out.println("Cartea '" + book.getTitle() + "' a fost imprumutata.");
        book.setState(new BorrowedState(book));  // Schimba starea la imprumutata
    }

    @Override
    public void returnBook() {
        System.out.println("Cartea '" + book.getTitle() + "' este deja disponibila.");
    }
}
