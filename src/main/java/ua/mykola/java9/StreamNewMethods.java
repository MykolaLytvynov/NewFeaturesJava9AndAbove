package ua.mykola.java9;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamNewMethods {

    public static void main(String[] args) {
        //метод iterate
        IntStream.iterate(1, i -> i < 10, i -> i + 1)
                .forEach(System.out::println);


        // ofNullable
        List<Student> students = null;
        List<Student> filteredStudents = getFilteredStudentByAge(students);

        //метод dropWhile
        List<Integer> integerList = Arrays.asList(1, 3, 2, 22, 122, 9);
        integerList.stream().dropWhile(x -> x < 12).forEach(System.out::println);

        //метод takeWhile
        List<Integer> integerList2 = Arrays.asList(1, 3, 2, 22, 122, 9);
        integerList2.stream().takeWhile(x -> x < 12).forEach(System.out::println);
    }

    public static List<Student> getFilteredStudentByAge (List<Student> students) {
            if (students != null) {
               return students.stream()
                        .filter(student -> student.getAge() > 18)
                        .collect(Collectors.toList());
            } else return null;


//        return Stream.ofNullable(students)
//                .flatMap(Collection::stream)
//                .filter(student -> student.getAge() > 18)
//                .collect(Collectors.toList());
    }

}

@Data
@AllArgsConstructor
class Student {
    private String name;
    private int age;
}
