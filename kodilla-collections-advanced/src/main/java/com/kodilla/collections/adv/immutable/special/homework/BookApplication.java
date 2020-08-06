package com.kodilla.collections.adv.immutable.special.homework;

import java.util.Arrays;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        Book fav1 = bookManager.createBook("Smentarz zwierzont", "King Stephen");
        Book fav2 = bookManager.createBook("Ziarno prawdy", "Miłoszewski Zygmunt");
        Book fav3 = bookManager.createBook("Ziarno prawdy", "Miłoszewski Zygmunt");

        System.out.println(fav1.hashCode());
        System.out.println(fav2.hashCode());
        System.out.println(fav3.hashCode());



        System.out.println(fav1 == fav2);
        System.out.println(fav1 == fav3);
        System.out.println(fav2 == fav3);
        System.out.println(fav1.equals(fav2));
        System.out.println(fav1.equals(fav3));
        System.out.println(fav2.equals(fav3));
    }

}


