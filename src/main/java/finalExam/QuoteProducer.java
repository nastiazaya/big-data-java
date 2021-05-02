package finalExam;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@NoArgsConstructor
public class QuoteProducer {
    private  final List<String> quotes = List.of("bla bla",
            "hvdkjxh",
            "shflidhl");

    private int countID = 1;
    private Random random = new Random();



    public void start() {
        Quote quote = createQyute();
        writeToFile(quote);
    }

    private Quote createQyute(){
        String randonQuote = quotes.get(random.nextInt(quotes.size()));
        Quote quote = Quote.builder()
                .id(countID)
                .text(randonQuote)
                .status(Status.getStatus(randonQuote.length()))
                .build();

        return quote;
    }

    @SneakyThrows
    private void writeToFile(Quote quote){
        //LocalDateTime now = LocalDateTime.now().withNano(0);
        LocalDate now = LocalDate.now();
        String filePath = "src/main/java/finalExam/objfile/" + now.toString() + ".obj";
        File file = new File(filePath);
        //File file  = new File("src/main/java/finalExam/quotes" + "/" + now.toString() + ".obj");
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(quote);
        oos.close();
        fos.close();
    }




}
