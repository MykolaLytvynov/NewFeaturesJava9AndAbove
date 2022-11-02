package ua.mykola.java9;
import java.util.*;

//Коллекции с готовыми элементами
//Фабричные методы для неизменяемых списков (ImmutableCollections)
public class Collect {


    public static void main(String[] args) {
        List<Integer> integers = List.of(12, 1223, 3434, 344);

        Set<String> strings = Set.of("Str1", "Str2", "Str3");

        Map<Integer, String> map = Map.of(1, "Str1",
                2, "Str2",
                3, "Str3",
                4, "Str4",
                5, "Str5",
                6, "Str6",
                7, "Str7",
                8, "Str8",
                9, "Str9",
                10, "Str10"
                );
        Map<Integer, String> map2 = Map.ofEntries(Map.entry(1, "Str1"),
                Map.entry(2, "Str2"),
                Map.entry(3, "Str3"),
                Map.entry(4, "Str4"),
                Map.entry(5, "Str5"),
                Map.entry(6, "Str6"),
                Map.entry(7, "Str7"),
                Map.entry(8, "Str8"),
                Map.entry(9, "Str9"),
                Map.entry(10, "Str10"),
                Map.entry(11, "Str11"),
                Map.entry(12, "Str12"),
                Map.entry(13, "Str13"),
                Map.entry(14, "Str14"));

//UnsupportedOperationException
//        integers.set(1, 123333);


        //Ранее был такой формат
        List<String> otherStrs = new ArrayList<>();
        otherStrs.add("Str1");
        otherStrs.add("Str2");
        otherStrs = Collections.unmodifiableList(otherStrs);
        otherStrs.forEach(System.out::println);

        Set<String> otherSet = new HashSet<>();
        otherSet.add("Str1");
        otherSet.add("Str2");
        otherSet.add("Str3");
        otherSet = Collections.unmodifiableSet(otherSet);

        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(1, "Str1");
        otherMap.put(2, "Str2");
        otherMap = Collections.unmodifiableMap(otherMap);


//UnsupportedOperationException
//        otherStrs.add("test");
//        otherMap.put(12, "as");


    }


}

