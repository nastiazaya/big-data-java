package my_junit;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Predicate;

public class TestRunner {

    @SneakyThrows
    public void runAllTestsOfClass(String className) {
        Class<?> aClass = Class.forName(className);
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Method[] methods = aClass.getMethods();
        Method[] testMethods = getTestMethods(methods);
        Method[] beforeTestMethods = getBeforeTestMethods(methods);
        for (Method test : testMethods) {
            Object testClassInstance = constructor.newInstance();
            for (Method beforeTest : beforeTestMethods) {
                beforeTest.setAccessible(true);
                beforeTest.invoke(testClassInstance);
            }
            test.setAccessible(true);
            test.invoke(testClassInstance);
        }
    }

    private Method[] getTestMethods(Method[] methods){
        return getMethods(methods, method -> method.getName().startsWith("test"));
    }

    private Method[] getBeforeTestMethods(Method[] methods){
        return getMethods(methods, method -> method.getAnnotation(RunBeforeEachTest.class) != null);
    }

    private Method[] getMethods(Method[] methods, Predicate<Method> filter) {
        return Arrays.stream(methods).filter(filter).toArray(Method[]::new);
    }


}