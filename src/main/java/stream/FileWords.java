package stream;

import lombok.SneakyThrows;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


public class FileWords {

    @SneakyThrows
    public static long numberOfWordInFile(String filePath){
        return Files
                .lines(Paths.get(filePath), StandardCharsets.UTF_8)
                .flatMap(line -> Arrays.stream(line.split("//s"))).count();
    }

    @SneakyThrows
    public static double avgWordLength(String filePath){
         return Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)
                 .flatMap(line -> Arrays.stream(line.split("//s")))
                 .mapToInt(String::length)
                 .average()
                 .orElse(0.0);
    }

    public static void main(String[] args) {
        numberOfWordInFile("src/main/resources/temp");
    }
}
