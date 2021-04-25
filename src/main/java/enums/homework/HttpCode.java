package enums.homework;

import java.util.Arrays;

public enum HttpCode {
    INFORMATIONAL(100, 199),
    SUCCESS(200, 299),
    REDIRECTION(300,399),
    CLIENT_ERROR(400, 499),
    SERVER_ERROR(500, 599);

    private final int min;
    private final int max;


    HttpCode(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static HttpCode getHttpCode(int code) {
        HttpCode[] httpCode = values();
        return Arrays.stream(httpCode).filter(item -> code >= item.min && code <= item.max)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(code + " not supported"));
    }
}
