package heroesgame;

import java.util.List;
import java.util.Random;

public class RandomUtil {
    private static Random random = new Random();

    public static int getNumberBetween(int min, int max){
        return random.nextInt((max - min) + 1) + min;
    }

    public static <T> T getRandomItem(List<T> list) {
        return list.get(getNumberBetween(0,list.size()-1));
    }
}
