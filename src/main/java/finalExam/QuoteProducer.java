package finalExam;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.*;
import java.util.List;
import java.util.Random;

@NoArgsConstructor
public class QuoteProducer {
    private  final List<String> quotes = List.of("Whether you think you can or you think you can't, you're right",
            "Life is what happens when you're busy making other plans.",
            "The way to get started is to quit talking and begin doing.",
            "The future belongs to those who believe in the beauty of their dreams.",
            "hello",
            "12345678910");

    private int countID = 1;
    private Random random = new Random();



    public void start() {
        long id = System.nanoTime();
        Quote quote = createQyute(id);
        writeToFile(quote);
    }

    private Quote createQyute(long id){
        String randonQuote = quotes.get(random.nextInt(quotes.size()));
        Quote quote = Quote.builder()
                .id(id)
                .text(randonQuote)
                .status(Status.getStatus(randonQuote.length()))
                .build();
        countID++;
        return quote;
    }

    @SneakyThrows
    private void writeToFile(Quote quote){
        String filePath = "src/main/java/finalExam/objfile/" + quote.getId() + ".obj";
        File file = new File(filePath);
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(quote);
        oos.close();
        fos.close();
    }




}
