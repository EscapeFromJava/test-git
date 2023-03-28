package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
public class CatHouse {

    private final List<Cat> cats = new ArrayList<>();

    public void addCat(Cat cat) {
        cats.add(cat);
    }

    public String removeCat(String name) throws Exception {
        Optional<Cat> maybeCat = cats.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst();
        if (maybeCat.isPresent()) {
            cats.remove(maybeCat.get());
            return "Cat " + maybeCat.get() + " removed";
        } else {
            throw new Exception("Cat not found!");
        }
    }

}
