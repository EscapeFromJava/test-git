package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Base");
        System.out.println("Base Commit 1");

        System.out.println("Feature Commit 1");
        System.out.println("Feature Commit 2");
        System.out.println("Feature Commit 3");

        Person person = Person.builder()
                .name("Max")
                .age(33)
                .build();

        Cat cat = Cat.builder()
                .name("Barsik")
                .color(Color.WHITE)
                .owner(person)
                .build();

        System.out.println(cat);

        System.out.println("Demo Commit 1");
        System.out.println("Demo Commit 2");
    }
}