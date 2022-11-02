package ua.mykola.java14;

import lombok.AllArgsConstructor;
import lombok.Data;

public class NPETest {
    public static void main(String[] args) {

        //Полезные исключения NullPointerException
        String colorAuto = getPerson().getOwnAuto().getColor();
        System.out.println(colorAuto);
    }


    public static Person getPerson() {
        return null;
//        return new Person(22, "Nelly", null);
    }
}

@Data
@AllArgsConstructor
class Person {
    private int age;
    private String name;
    private Auto ownAuto;
}

@Data
@AllArgsConstructor
class Auto {
    private String color;
}
