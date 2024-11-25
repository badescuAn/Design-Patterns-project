package src.main;

// Clasa Utilizator (observator)
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(Book book) {
        System.out.println("Utilizatorul " + name + " a fost notificat ca '" + book.getTitle() + "' este acum disponibila!");
    }
}

