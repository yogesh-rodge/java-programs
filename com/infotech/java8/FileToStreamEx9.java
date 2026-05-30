package com.infotech.java8;
// Question 9: Create a Stream from a File’s Lines and Print the First 5

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileToStreamEx9 {
    public static void main(String[] args) {

        String filepath ="example.txt";

        try(Stream<String> lines = Files.lines(Path.of(filepath))){
            lines.limit(5).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
