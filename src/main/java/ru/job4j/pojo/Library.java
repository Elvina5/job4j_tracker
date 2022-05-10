package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("The Master and Margarita", 504);
        Book second = new Book("Dead Souls", 323);
        Book third = new Book("Clean code", 250);
        Book fourth = new Book("Dog's heart", 256);
        Book[] prods = new Book[4];
        prods[0] = first;
        prods[1] = second;
        prods[2] = third;
        prods[3] = fourth;
        for (int index = 0; index < prods.length; index++) {
            Book pr = prods[index];
            System.out.println(pr.getName() + " - " + pr.getPage());
        }
        System.out.println("Replace first book to third book.");
        prods[0] = third;
        prods[2] = first;
        for (int index = 0; index < prods.length; index++) {
            Book pr = prods[index];
            System.out.println(pr.getName() + " - " + pr.getPage());
        }
        System.out.println("Only book with name shown \"Clean code\"");
        for (int index = 0; index < prods.length; index++) {
            Book pr = prods[index];
            if (pr.getName() == "Clean code") {
                System.out.println(pr.getName() + " - " + pr.getPage());
            }
        }
    }
}