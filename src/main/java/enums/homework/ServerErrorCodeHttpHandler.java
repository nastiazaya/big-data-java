package enums.homework;

public class ServerErrorCodeHttpHandler implements HttpHandler{
    @Override
    public void handle() {
        System.out.println("Server Error blok");
    }
}
