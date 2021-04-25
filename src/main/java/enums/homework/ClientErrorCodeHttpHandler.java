package enums.homework;

public class ClientErrorCodeHttpHandler implements HttpHandler{
    @Override
    public void handle() {
        System.out.println("Client Error blok");
    }
}
