package org.example;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
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

        CatHouse catHouse = new CatHouse();
        catHouse.addCat(cat);
        System.out.println("Size: " + catHouse.getCats().size());
        catHouse.removeCat(cat.getName());
        System.out.println("Size: " + catHouse.getCats().size());
        catHouse.removeCat(cat.getName());
        System.out.println("Size: " + catHouse.getCats().size());
        //add
    }
}