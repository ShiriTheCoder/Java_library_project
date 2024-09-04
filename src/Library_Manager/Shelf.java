package Library_Manager;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<Book> books;
    private boolean isShelfFull;

    public Shelf() {
        this.books = new ArrayList<>();
        this.isShelfFull = false;
    }

    public boolean addBook(Book book) {
        if (books.size() < 5) {
            books.add(book);
            if (books.size() == 5) {
                isShelfFull = true;
            }
            return true;
        } else {
            System.out.println("No space left on the shelf.");
            return false;
        }
    }

    public void replaceBooks(int pos1, int pos2) {
        if (pos1 < 1 || pos2 < 1 || pos1 > 5 || pos2 > 5) {
            System.out.println("Invalid positions.");
            return;
        }
        if (pos1 <= books.size() && pos2 <= books.size()) {
            Book temp = books.get(pos1 - 1);
            books.set(pos1 - 1, books.get(pos2 - 1));
            books.set(pos2 - 1, temp);
        } else {
            System.out.println("One of the positions is empty.");
        }
    }

    public boolean isShelfFull() {
        return isShelfFull;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Shelf: " + books.toString();
    }
}
