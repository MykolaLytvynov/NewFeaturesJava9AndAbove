package ua.mykola.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class NewMethodsStringFiles {

    public static void main(String[] args) throws IOException {
        //indent
        String s1 = "Str1\nStr2\nStr3";
        System.out.println(s1);
        System.out.println(s1.indent(4));

        String s2 = "   new String\n  new String2";
        System.out.println(s2);
        System.out.println(s2.indent(-2));

        //transform
        String uppercase = "abcde".transform(String::toUpperCase);
        String uppercase2 = "abcde".toUpperCase();
        Integer i1 = "12345".transform(Integer::valueOf);
        Integer i2 = Integer.valueOf("12345");

        System.out.println(uppercase);

        String s = "Trans1,Trans2,Trans3";
        List<String> result1 = s.transform(str -> {return Arrays.asList(str.split(","));});
        List<String> result2 = Arrays.stream(s.split(",")).toList();
        System.out.println(result1);


        //Files.mismatch(filePath1, filePath2)
        String fileName = "mismatch1.txt";
        String fileName2 = "mismatch2.txt";

        Path path1 = Path.of(fileName);
        Path path2 = Path.of(fileName2);

        Files.writeString(path1, "TEST ");
        Files.writeString(path2, "TEST ");

        long mismatch = Files.mismatch(path1, path2);
        System.out.println(mismatch);

    }
}
