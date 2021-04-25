package enums.homework;

import java.util.HashMap;
import java.util.Map;

public class HttpCodeHandler {

    public void handleHttpCode(int httpCode){

        HttpCode.findCode(httpCode).handle();
    }
}
