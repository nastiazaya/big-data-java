package finalExam;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;

@NoArgsConstructor
public class Consumer {


    public void start(File file) {
        Quote quote = readFromFile(file);
        writeToJson(quote, file.getName());
    }


    @SneakyThrows
    private Quote readFromFile(File file){
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream oos = new ObjectInputStream(fis);
        Quote quote = (Quote) oos.readObject();
        return quote;
    }

    @SneakyThrows
    private void writeToJson(Quote quote, String fileName){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID" , quote.getId());
        jsonObject.put("text", quote.getText());
        jsonObject.put("status", quote.getStatus());
        fileName = fileName.replace(".obj","");
        FileWriter file = new FileWriter("src/main/java/finalExam/jsonfile/" + fileName + ".json");
        file.write(jsonObject.toJSONString());
        file.close();
    }
}
