package Library_Manager;

public class Book {
    private final String author;
    private final String title;
    private final int numOfPages;

    public Book(String author, String title, int numOfPages) {
        this.author = author;
        this.title = title;
        this.numOfPages = numOfPages;
    }

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + numOfPages + " pages)";
    }
}
