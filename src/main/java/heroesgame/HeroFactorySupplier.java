package heroesgame;

import java.util.List;
import java.util.function.Supplier;


public class HeroFactorySupplier {
    private final List<Supplier<Hero>> heroesFactory = List.of(
             Elf::new,
             Hobbit::new,
             King::new,
             Knight::new);


    public Hero createHero() throws Exception {
        Supplier<Hero> heroSupplier= RandomUtil.getRandomItem(heroesFactory);
        return heroSupplier.get();
    }

}
