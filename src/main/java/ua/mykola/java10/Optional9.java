package ua.mykola.java10;

import java.util.Optional;

public class Optional9 {
    public static void main(String[] args) {
        Optional<String> result = getResult();
        if (result.isPresent()) {
            System.out.println(result.orElseThrow());
        }

//        System.out.println(result.get());
//        System.out.println(result.orElseThrow());
    }

    public static Optional<String> getResult() {
        return Optional.ofNullable("STR");
//        return Optional.ofNullable(null);
    }
}
