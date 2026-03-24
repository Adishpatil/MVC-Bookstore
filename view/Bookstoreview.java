package view;

import model.Book;

import java.util.List;

public class Bookstoreview {

    public void displayBooks(List<Book> books) {
        System.out.println("\nAvailable Books:");

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println((i + 1) + ". " + book.getTitle() + " - $" + book.getPrice());
        }
    }

    public void displayCart(List<Book> cartBooks) {
        System.out.println("\nCart Contents:");

        if (cartBooks.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        for (Book book : cartBooks) {
            System.out.println(book.getTitle() + " - $" + book.getPrice());
        }
    }
}