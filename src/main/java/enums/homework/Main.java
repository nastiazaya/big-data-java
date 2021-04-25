package enums.homework;

public class Main {

    private static HttpCodeHandler handleHttpCode = new HttpCodeHandler();;


    public static void main(String[] args) {
        handleHttpCode.handleHttpCode(150);
        handleHttpCode.handleHttpCode(234);
        handleHttpCode.handleHttpCode(345);
        handleHttpCode.handleHttpCode(456);
        handleHttpCode.handleHttpCode(567);
        handleHttpCode.handleHttpCode(678);
    }
}
