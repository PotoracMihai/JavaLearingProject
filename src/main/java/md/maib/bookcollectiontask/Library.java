package md.maib.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookStock = new ArrayList<>();

    private String name;

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        bookStock.add(book);
    }

    public void removeBook(Book book) {
        bookStock.remove(book);
    }

    public void containsBook(Book book) {
        bookStock.contains(book);
    }

    public void totalBooks() {
        bookStock.size();
    }

    public void printBooks() {
        for (Book book : bookStock) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
