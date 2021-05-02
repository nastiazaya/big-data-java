package finalExam;

import lombok.SneakyThrows;

import java.io.File;

import static java.lang.Thread.sleep;

public class SecondMain {
    @SneakyThrows
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        File file = new File("src/main/java/finalExam/objfile/");
        while (true){
            File[] files = file.listFiles();
            if(files != null){
                for (File nextFile : files){
                    Thread thread = new Thread(() -> {
                        consumer.start(nextFile);
                        System.out.println("create: " + nextFile.getName());

                    });
                    thread.start();

                }
            }
            else{
                break;
            }
            Thread.sleep(10000);
        }
    }
}
