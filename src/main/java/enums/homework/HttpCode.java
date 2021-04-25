package enums.homework;

import java.util.Arrays;

public enum HttpCode {
    INFORMATIONAL(100, 199,new InformationCodeHttpHandler()),
    SUCCESS(200, 299, new SuccessCodeHttpHandler()),
    REDIRECTION(300,399, new RedirectionCodeHttpHandler()),
    CLIENT_ERROR(400, 499, new ClientErrorCodeHttpHandler()),
    SERVER_ERROR(500, 599, new ServerErrorCodeHttpHandler());

    private final int min;
    private final int max;
    private final HttpHandler httpHandler;

    HttpCode(int min, int max, HttpHandler httpHandler) {
        this.min = min;
        this.max = max;
        this.httpHandler = httpHandler;
    }

    public static HttpCode getHttpCode(int code) {
        HttpCode[] httpCode = values();
        return Arrays.stream(httpCode).filter(item -> code >= item.min && code <= item.max)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(code + " not supported"));
    }


    public static HttpHandler findCode(int code) {
        return getHttpCode(code).httpHandler;
    }
}
