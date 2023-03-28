package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cat {

    private String name;
    private Color color;
    private Person owner;
}

enum Color {
    RED, BLACK, WHITE
}
