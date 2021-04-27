package my_spring;

import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;


class ApplicationContext {

    private Map<Class,Object> cache = new HashMap<Class,Object>();
    private final ObjectFactory objectFactory = ObjectFactory.getInstance();
    private static ApplicationContext applicationContext = new ApplicationContext();

    public static ApplicationContext getInstance() {
        return applicationContext;
    }

    private ApplicationContext(){}



    public Object getObject(Class type) {
        if(type.getAnnotation(Singleton.class) != null){
            Object newInstance = cache.get(type);
            if(newInstance == null){
                newInstance = objectFactory.createObject(type);
                cache.put(type,newInstance);
            }
            return newInstance;
        }else {
            return objectFactory.createObject(type);
        }
    }
}
