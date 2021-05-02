package finalExam;

public class FirstMain {
    public static void main(String[] args) {
        QuoteProducer quoteProducer = new QuoteProducer();
        for (int i = 0; i < 2; i++) {
            quoteProducer.start();
        }
    }
}
