package enums.homework;

import java.util.HashMap;
import java.util.Map;

public class HttpCodeHandler {

    static Map<HttpCode, HttpHandler> httpCodeHandlers  = new HashMap<HttpCode, HttpHandler>() {{
        put(HttpCode.INFORMATIONAL, new InformationCodeHttpHandler());
        put(HttpCode.SUCCESS, new SuccessCodeHttpHandler());
        put(HttpCode.REDIRECTION, new RedirectionCodeHttpHandler());
        put(HttpCode.CLIENT_ERROR, new ClientErrorCodeHttpHandler());
        put(HttpCode.SERVER_ERROR, new ServerErrorCodeHttpHandler());
    }};



    public void handleHttpCode(int httpCode){
        httpCodeHandlers.get(HttpCode.getHttpCode(httpCode)).handle();
    }
}
