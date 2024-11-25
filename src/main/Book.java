package src.main;

import java.util.ArrayList;
import java.util.List;
class Book {
    private String title;
    private BookState state;  // Starea curentă a carții

    private List<User> observers;  // Lista de observatori


    public Book(String title) {
        this.title = title;
        this.state = new AvailableState(this);  // Cartea incepe in starea disponibila
        this.observers = new ArrayList<>();
    }

    public void attach(User observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (User observer : observers) {
            observer.update(this);
        }
    }

    public void borrow() {
        state.borrow();
    }

    public void returnBook() {
        state.returnBook();
    }

    public String getTitle() {
        return title;
    }

    public void setState(BookState state) {
        this.state = state;
    }

    public void notifyAvailable() {
        notifyObservers();
    }
}



