package ua.mykola.java10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableCollections {

    public static void main(String[] args) {
        List<String> listStrs = new ArrayList<>();
        listStrs.add("Str1");
        listStrs.add("Str2");
        listStrs.add("Str3");

        List<String> unmodifiableList = Collections.unmodifiableList(listStrs);

        //Будет ошибка
//        unmodifiableList.add("Str4");

        listStrs.add("Str5");

        for (String s : unmodifiableList) {
            System.out.println(s);
        }

        //-------------------------------------------------------


        List<String> listStrs2 = new ArrayList<>();
        listStrs2.add("listStrs2 - Str1");
        listStrs2.add("listStrs2 - Str2");
        listStrs2.add("listStrs2 - Str3");

        List<String> unmodifiableList2 = List.copyOf(listStrs2);

        listStrs2.add("test");

        for (String s : unmodifiableList2) {
            System.out.println(s);
        }

    }
}
