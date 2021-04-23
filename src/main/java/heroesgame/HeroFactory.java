package heroesgame;

import java.util.Map;
import java.util.Random;

public class HeroFactory {

    private static final int NUMNER_OF_HEROS = 4;
    private static final Random random = new Random();

    public static Hero createHero(){
        int randomHeroNum = random.nextInt((NUMNER_OF_HEROS - 1) + 1) + 1;
        if(randomHeroNum == 1){
            return new Elf();
        }else if(randomHeroNum == 2){
            return new Hobbit();
        }else if(randomHeroNum == 3){
            return new King();
        }else{
            return new Knight();
        }
    }

}
