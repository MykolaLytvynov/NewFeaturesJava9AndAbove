package ua.mykola.java11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WritingAndReadingFile {
    public static void main(String[] args) throws IOException {

        String fileName = "test1.txt";

        Path path = Path.of(fileName);

        Files.writeString(path, "Hi there");

        System.out.println(Files.readString(path).trim());

    }


}
