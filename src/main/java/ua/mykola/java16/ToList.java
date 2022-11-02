package ua.mykola.java16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToList {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Fir");
        strings.add("Coo");
        List<String> strings2 = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> strings3 = strings.stream().map(String::toUpperCase).toList();

        strings2.add("rty");
        strings2.forEach(System.out::println);

//        strings3.add("empy");
//        strings3.forEach(System.out::println);
    }
}
