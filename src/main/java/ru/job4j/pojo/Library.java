package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 700);
        Book book2 = new Book("Java Effectivnoe programmirovanie", 800);
        Book book3 = new Book("Hibernate", 500);
        Book book4 = new Book("Spring", 400);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " " + bk.getNumberOfPages());
        }
        System.out.println("Swap books");
        books[0] = book4;
        books[3] = book1;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " " + bk.getNumberOfPages());
        }
        System.out.println("Shown only one book");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.equals(book4 = book1)) {
                System.out.println(bk.getName() + " " + bk.getNumberOfPages());
            }

        }
    }
}
