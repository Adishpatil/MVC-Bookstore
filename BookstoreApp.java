package def;

import model.Book;
import model.Cart;
import view.Bookstoreview;
import controller.Bookstorecontroller;

import java.util.Arrays;
import java.util.List;

public class BookstoreApp {
    public static void main(String[] args) {
        System.out.println("Name: Adish");
        System.out.println("Roll No: 01");
        System.out.println("Div: SY16\n");

        List<Book> books = Arrays.asList(
                new Book("Think and Grow Rich", 12.99),
                new Book("Deep Work", 14.49),
                new Book("Clean Code", 18.75),
                new Book("Atomic Habits", 11.50));

        Cart cart = new Cart();
        Bookstoreview view = new Bookstoreview();
        Bookstorecontroller controller = new Bookstorecontroller(books, cart, view);
        controller.start();
    }
}