package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("ABC", 33);
        Book book2 = new Book("Java", 500);
        Book book3 = new Book("Oracle", 400);
        Book book4 = new Book("Clean code", 100);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getNumberOfPages());
        }
        System.out.println("Переставить местами книги с индексом 0 и 3:");
        Book x = books[3];
        books[3] = books[0];
        books[0] = x;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getNumberOfPages());
        }
        System.out.println("Вывод книг с именем \"Clean code\":");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getNumberOfPages());
            }
        }

    }
}
