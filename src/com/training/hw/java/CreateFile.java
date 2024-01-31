package com.training.hw.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) throws IOException {
//        createFile();
        writeFile();
    }

    private static void writeFile() throws IOException {
        String personFile  = "E:\\guviTask\\src\\com\\training\\hw\\java\\person0.txt";

        String writeContent = "Java Full Stack";
        Files.writeString(Paths.get(personFile),writeContent);
    }

    private static void createFile() throws IOException {
        String personFile;
        for (int i = 0; i < 3; i++) {
            personFile  = "E:\\guviTask\\src\\com\\training\\hw\\java\\person"+i+".txt";
            Path path = Paths.get(personFile);

            Files.createFile(path);
        }
    }
}
