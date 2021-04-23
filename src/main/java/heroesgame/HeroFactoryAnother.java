package heroesgame;

import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;


public class HeroFactoryAnother {
    Map<Integer, Supplier<Hero>> heroesFactory = Map.of(1, getElf(),
            2, getHobbit(),
            3, getKing(),
            4, getKnight());

    public Supplier<Hero> getKnight(){
        return Knight::new;
    }

    public Supplier<Hero> getKing(){
        return King::new;
    }

    public Supplier<Hero> getHobbit(){
        return Hobbit::new;
    }

    public Supplier<Hero> getElf(){
        return Elf::new;
    }

    public Hero createHero() throws Exception {
        Random random = new Random();
        int randomHeroNum = random.nextInt((heroesFactory.size() - 1) + 1) + 1;
        return heroesFactory.get(randomHeroNum).get();
    }

}
