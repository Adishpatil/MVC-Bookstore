package controller;

import model.Book;
import model.Cart;
import view.Bookstoreview;

import java.util.List;
import java.util.Scanner;

public class Bookstorecontroller {
    private List<Book> books;
    private Cart cart;
    private Bookstoreview view;

    public Bookstorecontroller(List<Book> books, Cart cart, Bookstoreview view) {
        this.books = books;
        this.cart = cart;
        this.view = view;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.displayBooks(books);

            System.out.println("\nEnter book number to add to cart (0 to view cart, -1 to exit): ");

            int choice = scanner.nextInt();

            if (choice == -1) {
                break;
            }

            if (choice == 0) {
                view.displayCart(cart.getBooks());
                continue;
            }

            if (choice > 0 && choice <= books.size()) {
                cart.addBook(books.get(choice - 1));
                System.out.println("Book added to cart.");
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}